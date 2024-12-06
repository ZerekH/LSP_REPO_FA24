package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Singleton service to provide random numbers using different generation methods.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private GenerationMethod method;

    private enum GenerationMethod {
        JAVA_RANDOM,
        CUSTOM_RANDOM
    }

    private final Random javaRandom = new Random();
    private long customSeed = System.nanoTime();
    private static final long MULTIPLIER = 1664525;
    private static final long INCREMENT = 1013904223;
    private static final long MODULUS = (1L << 32);

    /**
     * Private constructor to enforce singleton pattern.
     */
    private RandomNumberService() {
    }

    /**
     * Returns the singleton instance of RandomNumberService.
     *
     * @return the singleton instance.
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation method.
     *
     * @param methodName the method name, either "JAVA_RANDOM" or "CUSTOM_RANDOM".
     * @throws IllegalArgumentException if an invalid method name is provided.
     */
    public void setMethod(String methodName) {
        switch (methodName.toUpperCase()) {
            case "JAVA_RANDOM":
                this.method = GenerationMethod.JAVA_RANDOM;
                break;
            case "CUSTOM_RANDOM":
                this.method = GenerationMethod.CUSTOM_RANDOM;
                break;
            default:
                throw new IllegalArgumentException("Invalid generation method: " + methodName);
        }
    }

    /**
     * Generates a random positive integer using the selected method.
     *
     * @return a randomly generated positive integer.
     * @throws IllegalStateException if no method has been set.
     */
    public int generateRandomNumber() {
        if (method == null) {
            throw new IllegalStateException("No random number generation method set.");
        }

        switch (method) {
            case JAVA_RANDOM:
                return javaRandom.nextInt(Integer.MAX_VALUE) + 1;
            case CUSTOM_RANDOM:
                customSeed = (MULTIPLIER * customSeed + INCREMENT) % MODULUS;
                return (int) (customSeed & 0x7FFFFFFF) + 1;
            default:
                throw new IllegalStateException("Unexpected generation method: " + method);
        }
    }
}
