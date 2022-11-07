public class Main {
    
    public static void main(String[] args)
    {
        // Sanity Check

        int[][] A = {{2,0,-1,6},{3,7,8,0},{-5,1,6,-2},{8,0,1,7}};
        int[][] B = {{0,1,6,3},{-2,8,7,1},{2,0,-1,0},{9,1,6,-2}};

        System.out.println("Classic Matrix Multiplication Sanity Check");
        int[][] classic = classicMultiply(A, B);
        printMatrix(classic);

        System.out.println("\nNaive Divide and Conquer Sanity Check");
        int[][] naiveDC = divAndConMultiply(A, B);
        printMatrix(naiveDC);

        System.out.println("\nStrassen's Matrix Multiplication Sanity Check");
        int[][] strassen = strassenMultiply(A, B);
        printMatrix(strassen);

        // 2x2 matrix

        int[][] A2x2 = createMatrixA(2);
        int[][] B2x2 = createMatrixB(2);

        System.out.println("\n2x2 Matrix test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime1 = System.nanoTime();
        int[][] matrix1 = classicMultiply(A2x2,B2x2);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime1 = System.nanoTime();
        matrix1 = classicMultiply(B2x2, A2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime1 = System.nanoTime();
        matrix1 = classicMultiply(A2x2, A2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime1 = System.nanoTime();
        matrix1 = classicMultiply(B2x2, B2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime1 = System.nanoTime();
        matrix1 = divAndConMultiply(A2x2, B2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime1 = System.nanoTime();
        matrix1 = divAndConMultiply(B2x2, A2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime1 = System.nanoTime();
        matrix1 = divAndConMultiply(A2x2, A2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime1 = System.nanoTime();
        matrix1 = divAndConMultiply(B2x2, B2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime1 = System.nanoTime();
        matrix1 = strassenMultiply(A2x2, B2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime1 = System.nanoTime();
        matrix1 = strassenMultiply(B2x2, A2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime1 = System.nanoTime();
        matrix1 = strassenMultiply(A2x2, A2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime1 = System.nanoTime();
        matrix1 = strassenMultiply(B2x2, B2x2);
        endTime1 = System.nanoTime();
        duration1 = (endTime1 - startTime1);
        System.out.println(duration1 + " nanoseconds");

        // 4x4 matrix

        int[][] A4x4 = createMatrixA(4);
        int[][] B4x4 = createMatrixB(4);

        System.out.println("\n4x4 Matrix test");
        
        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime2 = System.nanoTime();
        int[][] matrix2 = classicMultiply(A4x4,B4x4);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime2 = System.nanoTime();
        matrix2 = classicMultiply(B4x4,A4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime2 = System.nanoTime();
        matrix2 = classicMultiply(A4x4,A4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime2 = System.nanoTime();
        matrix2 = classicMultiply(B4x4,B4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime2 = System.nanoTime();
        matrix2 = divAndConMultiply(A4x4,B4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime2 = System.nanoTime();
        matrix2 = divAndConMultiply(B4x4,A4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime2 = System.nanoTime();
        matrix2 = divAndConMultiply(A4x4,A4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime2 = System.nanoTime();
        matrix2 = divAndConMultiply(B4x4,B4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime2 = System.nanoTime();
        matrix2 = strassenMultiply(A4x4,B4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime2 = System.nanoTime();
        matrix2 = strassenMultiply(B4x4,A4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime2 = System.nanoTime();
        matrix2 = strassenMultiply(A4x4,A4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime2 = System.nanoTime();
        matrix2 = strassenMultiply(B4x4,B4x4);
        endTime2 = System.nanoTime();
        duration2 = (endTime2 - startTime2);
        System.out.println(duration2 + " nanoseconds");

        // 8x8 matrix
        int[][] A8x8 = createMatrixA(8);
        int[][] B8x8 = createMatrixB(8);
        System.out.println("\n8x8 Matrix Test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime3 = System.nanoTime();
        int[][] matrix3 = classicMultiply(A8x8,B8x8);
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime3 = System.nanoTime();
        matrix3 = classicMultiply(B8x8,A8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime3 = System.nanoTime();
        matrix3 = classicMultiply(A8x8,A8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime3 = System.nanoTime();
        matrix3 = classicMultiply(B8x8,B8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime3 = System.nanoTime();
        matrix3 = divAndConMultiply(A8x8,B8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime3 = System.nanoTime();
        matrix3 = divAndConMultiply(B8x8,A8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime3 = System.nanoTime();
        matrix3 = divAndConMultiply(A8x8,A8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime3 = System.nanoTime();
        matrix3 = divAndConMultiply(B8x8,B8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime3 = System.nanoTime();
        matrix3 = strassenMultiply(A8x8,B8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime3 = System.nanoTime();
        matrix3 = strassenMultiply(B8x8,A8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime3 = System.nanoTime();
        matrix3 = strassenMultiply(A8x8,A8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime3 = System.nanoTime();
        matrix3 = strassenMultiply(B8x8,B8x8);
        endTime3 = System.nanoTime();
        duration3 = (endTime3 - startTime3);
        System.out.println(duration3 + " nanoseconds");

        // 16x16 matrix
        int[][] A16x16 = createMatrixA(16);
        int[][] B16x16 = createMatrixB(16);

        System.out.println("\n16x16 Matrix Test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime4 = System.nanoTime();
        int[][] matrix4 = classicMultiply(A16x16,B16x16);
        long endTime4 = System.nanoTime();
        long duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime4 = System.nanoTime();
        matrix4 = classicMultiply(B16x16,A16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime4 = System.nanoTime();
        matrix4 = classicMultiply(A16x16,A16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime4 = System.nanoTime();
        matrix4 = classicMultiply(B16x16,B16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime4 = System.nanoTime();
        matrix4 = divAndConMultiply(A16x16,B16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime4 = System.nanoTime();
        matrix4 = divAndConMultiply(B16x16,A16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime4 = System.nanoTime();
        matrix4 = divAndConMultiply(A16x16,A16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime4 = System.nanoTime();
        matrix4 = divAndConMultiply(B16x16,B16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime4 = System.nanoTime();
        matrix4 = strassenMultiply(A16x16,B16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime4 = System.nanoTime();
        matrix4 = strassenMultiply(B16x16,A16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime4 = System.nanoTime();
        matrix4 = strassenMultiply(A16x16,A16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime4 = System.nanoTime();
        matrix4 = strassenMultiply(B16x16,B16x16);
        endTime4 = System.nanoTime();
        duration4 = (endTime4 - startTime4);
        System.out.println(duration4 + " nanoseconds");


        // 32x32 matrix
        int[][] A32x32 = createMatrixA(32);
        int[][] B32x32 = createMatrixB(32);

        System.out.println("\n32x32 Matrix Test");

        System.out.println("Brute Force");
        long startTime5 = System.nanoTime();
        int[][] matrix5 = classicMultiply(A32x32,B32x32);
        long endTime5 = System.nanoTime();
        long duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime5 = System.nanoTime();
        matrix5 = classicMultiply(B32x32,A32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime5 = System.nanoTime();
        matrix5 = classicMultiply(A32x32,A32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime5 = System.nanoTime();
        matrix5 = classicMultiply(B32x32,B32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");


        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime5 = System.nanoTime();
        matrix5 = divAndConMultiply(A32x32,B32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime5 = System.nanoTime();
        matrix5 = divAndConMultiply(B32x32,A32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime5 = System.nanoTime();
        matrix5 = divAndConMultiply(B32x32,A32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime5 = System.nanoTime();
        matrix5 = divAndConMultiply(B32x32,B32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime5 = System.nanoTime();
        matrix5 = strassenMultiply(A32x32,B32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime5 = System.nanoTime();
        matrix5 = strassenMultiply(B32x32,A32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime5 = System.nanoTime();
        matrix5 = strassenMultiply(A32x32,A32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime5 = System.nanoTime();
        matrix5 = strassenMultiply(B32x32,B32x32);
        endTime5 = System.nanoTime();
        duration5 = (endTime5 - startTime5);
        System.out.println(duration5 + " nanoseconds");

        // 64x64 matrix
        int[][] A64x64 = createMatrixA(64);
        int[][] B64x64 = createMatrixB(64);
        System.out.println("\n64x64 Matrix Test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime6 = System.nanoTime();
        int[][] matrix6 = classicMultiply(A64x64,B64x64);
        long endTime6 = System.nanoTime();
        long duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime6 = System.nanoTime();
        matrix6 = classicMultiply(B64x64,A64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime6 = System.nanoTime();
        matrix6 = classicMultiply(A64x64,A64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime6 = System.nanoTime();
        matrix6 = classicMultiply(B64x64,B64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime6 = System.nanoTime();
        matrix6 = divAndConMultiply(A64x64,B64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime6 = System.nanoTime();
        matrix6 = divAndConMultiply(B64x64,A64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime6 = System.nanoTime();
        matrix6 = divAndConMultiply(A64x64,A64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime6 = System.nanoTime();
        matrix6 = divAndConMultiply(B64x64,B64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime6 = System.nanoTime();
        matrix6 = strassenMultiply(A64x64,B64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime6 = System.nanoTime();
        matrix6 = strassenMultiply(B64x64,A64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime6 = System.nanoTime();
        matrix6 = strassenMultiply(A64x64,A64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime6 = System.nanoTime();
        matrix6 = strassenMultiply(B64x64,B64x64);
        endTime6 = System.nanoTime();
        duration6 = (endTime6 - startTime6);
        System.out.println(duration6 + " nanoseconds");

        // 128x128 matrix
        int[][] A128x128 = createMatrixA(128);
        int[][] B128x128 = createMatrixB(128);
        System.out.println("\n128x128 Matrix Test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime7 = System.nanoTime();
        int[][] matrix7 = classicMultiply(A128x128,B128x128);
        long endTime7 = System.nanoTime();
        long duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime7 = System.nanoTime();
        matrix7 = classicMultiply(B128x128,A128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime7 = System.nanoTime();
        matrix7 = classicMultiply(A128x128,A128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime7 = System.nanoTime();
        matrix7 = classicMultiply(B128x128,B128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(A128x128,B128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(B128x128,A128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(A128x128,A128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(B128x128,B128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime7 = System.nanoTime();
        matrix7 = strassenMultiply(A128x128,B128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(B128x128,A128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(A128x128,A128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime7 = System.nanoTime();
        matrix7 = divAndConMultiply(B128x128,B128x128);
        endTime7 = System.nanoTime();
        duration7 = (endTime7 - startTime7);
        System.out.println(duration7 + " nanoseconds");

        // 256x256 matrix
        int[][] A256x256 = createMatrixA(256);
        int[][] B256x256 = createMatrixB(256);
        System.out.println("\n256x256 Matrix Test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime8 = System.nanoTime();
        int[][] matrix8 = classicMultiply(A256x256,B256x256);
        long endTime8 = System.nanoTime();
        long duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime8 = System.nanoTime();
        matrix8 = classicMultiply(B256x256,A256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime8 = System.nanoTime();
        matrix8 = classicMultiply(A256x256,A256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime8 = System.nanoTime();
        matrix8 = classicMultiply(B256x256,B256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime8 = System.nanoTime();
        matrix8 = divAndConMultiply(A256x256,B256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime8 = System.nanoTime();
        matrix8 = divAndConMultiply(B256x256,A256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime8 = System.nanoTime();
        matrix8 = divAndConMultiply(A256x256,A256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime8 = System.nanoTime();
        matrix8 = divAndConMultiply(B256x256,B256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime8 = System.nanoTime();
        matrix8 = strassenMultiply(A256x256,B256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime8 = System.nanoTime();
        matrix8 = strassenMultiply(B256x256,A256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime8 = System.nanoTime();
        matrix8 = strassenMultiply(A256x256,A256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime8 = System.nanoTime();
        matrix8 = strassenMultiply(B256x256,B256x256);
        endTime8 = System.nanoTime();
        duration8 = (endTime8 - startTime8);
        System.out.println(duration8 + " nanoseconds");

        // 512x512 matrix
        int[][] A512x512 = createMatrixA(512);
        int[][] B512x512 = createMatrixB(512);
        System.out.println("\n512x512 Matrix Test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime9 = System.nanoTime();
        int[][] matrix9 = classicMultiply(A512x512,B512x512);
        long endTime9 = System.nanoTime();
        long duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime9 = System.nanoTime();
        matrix9 = classicMultiply(B512x512,A512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime9 = System.nanoTime();
        matrix9 = classicMultiply(A512x512,A512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime9 = System.nanoTime();
        matrix9 = classicMultiply(B512x512,B512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime9 = System.nanoTime();
        matrix9 = divAndConMultiply(A512x512,B512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime9 = System.nanoTime();
        matrix9 = divAndConMultiply(A512x512,B512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime9 = System.nanoTime();
        matrix9 = divAndConMultiply(A512x512,A512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime9 = System.nanoTime();
        matrix9 = divAndConMultiply(B512x512,B512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");
        
        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime9 = System.nanoTime();
        matrix9 = strassenMultiply(A512x512,B512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime9 = System.nanoTime();
        matrix9 = strassenMultiply(B512x512,A512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime9 = System.nanoTime();
        matrix9 = strassenMultiply(A512x512,A512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime9 = System.nanoTime();
        matrix9 = strassenMultiply(B512x512,B512x512);
        endTime9 = System.nanoTime();
        duration9 = (endTime9 - startTime9);
        System.out.println(duration9 + " nanoseconds");


        // 1024x1024
        int[][] A1024x1024 = createMatrixA(1024);
        int[][] B1024x1024 = createMatrixB(1024);
        
        System.out.println("\n1024x1024 Matrix test");

        System.out.println("Brute Force");
        // Test Case 1 for Brute Force
        long startTime10 = System.nanoTime();
        int[][] matrix10 = classicMultiply(A1024x1024,B1024x1024);
        long endTime10 = System.nanoTime();
        long duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 2 for Brute Force
        startTime10 = System.nanoTime();
        matrix10 = classicMultiply(B1024x1024,A1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 3 for Brute Force
        startTime10 = System.nanoTime();
        matrix10 = classicMultiply(A1024x1024,A1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 4 for Brute Force
        startTime10 = System.nanoTime();
        matrix10 = classicMultiply(B1024x1024,B1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        System.out.println("Divide and Conquer");
        // Test Case 1 for Divide and Conquer
        startTime10 = System.nanoTime();
        matrix10 = divAndConMultiply(A1024x1024,B1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 2 for Divide and Conquer
        startTime10 = System.nanoTime();
        matrix10 = divAndConMultiply(B1024x1024,A1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 3 for Divide and Conquer
        startTime10 = System.nanoTime();
        matrix10 = divAndConMultiply(A1024x1024,A1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 4 for Divide and Conquer
        startTime10 = System.nanoTime();
        matrix10 = divAndConMultiply(B1024x1024,B1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        System.out.println("Strassen");
        // Test Case 1 for Strassen
        startTime10 = System.nanoTime();
        matrix10 = strassenMultiply(A1024x1024,B1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 2 for Strassen
        startTime10 = System.nanoTime();
        matrix10 = strassenMultiply(B1024x1024,A1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 3 for Strassen
        startTime10 = System.nanoTime();
        matrix10 = strassenMultiply(A1024x1024,A1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");

        // Test Case 4 for Strassen
        startTime10 = System.nanoTime();
        matrix10 = strassenMultiply(B1024x1024,B1024x1024);
        endTime10 = System.nanoTime();
        duration10 = (endTime10 - startTime10);
        System.out.println(duration10 + " nanoseconds");
    }  

    // classic method (brute force)
    public static int[][] classicMultiply(int[][] a, int[][] b)
    {
        int dimension = a.length;
        int[][] prod = new int[dimension][dimension];

        // first for loop for row
        for(int i = 0; i < dimension; i++)
        {
            // second for loop for column
            for(int j = 0; j < dimension; j++)
            {
                int sum = 0;

                // third for loop for traversing elements in matrices
                for(int k = 0; k < dimension; k++)
                {
                    int mul = a[i][k]*b[k][j];
                    sum = sum + mul;
                }
                prod[i][j] = sum;
            }
        }
        
        return prod;
    }

    // naive divide-and-conquer method
    public static int[][] divAndConMultiply(int[][] a, int[][] b)
    {
        int dimension = a.length;
        int[][] c = new int[dimension][dimension];

        // base case
        if(dimension == 2)
        {
            int a11 = a[0][0];
            int a12 = a[0][1];
            int a21 = a[1][0];
            int a22 = a[1][1];

            int b11 = b[0][0];
            int b12 = b[0][1];
            int b21 = b[1][0];
            int b22 = b[1][1];

            // 8 multiplications and 4 additions
            c[0][0] = (a11*b11) + (a12*b21);
            c[0][1] = (a11*b12) + (a12*b22);
            c[1][0] = (a21*b11) + (a22*b21);
            c[1][1] = (a21*b12) + (a22*b22);
        }
        // general case
        else
        {
            int splitIndex = dimension / 2;

            // Divide matrix A into 4 quadrants
            int[][] A11 = divideMatrix(a, 0, splitIndex, 0, splitIndex);
            int[][] A12 = divideMatrix(a, 0, splitIndex, splitIndex, dimension);
            int[][] A21 = divideMatrix(a, splitIndex, dimension, 0, splitIndex);
            int[][] A22 = divideMatrix(a, splitIndex, dimension, splitIndex, dimension);
            
            // Divide matrix B into 4 quadrants
            int[][] B11 = divideMatrix(b, 0, splitIndex, 0, splitIndex);
            int[][] B12 = divideMatrix(b, 0, splitIndex, splitIndex, dimension);
            int[][] B21 = divideMatrix(b, splitIndex, dimension, 0, splitIndex);
            int[][] B22 = divideMatrix(b, splitIndex, dimension, splitIndex, dimension);
            
            // Recursively multiply quadrants
            int[][] A11xB11 = divAndConMultiply(A11, B11);
            int[][] A12xB21 = divAndConMultiply(A12, B21);
            int[][] C11 = addMatrix(A11xB11, A12xB21);

            int[][] A11xB12 = divAndConMultiply(A11, B12);
            int[][] A12xB22 = divAndConMultiply(A12, B22);
            int[][] C12 = addMatrix(A11xB12, A12xB22);

            int[][] A21xB11 = divAndConMultiply(A21, B11);
            int[][] A22xB21 = divAndConMultiply(A22, B21);
            int[][] C21 = addMatrix(A21xB11, A22xB21);

            int[][] A21xB12 = divAndConMultiply(A21, B12);
            int[][] A22xB22 = divAndConMultiply(A22, B22);
            int[][] C22 = addMatrix(A21xB12, A22xB22);

            c = combineMatrix(C11, C12, C21, C22, dimension);

        }
        return c;
    }

    public static int[][] strassenMultiply(int[][] a, int[][] b)
    {
        int dimension = a.length;
        int[][] c = new int[dimension][dimension];

        // base case
        if(dimension == 2)
        {
            int a11 = a[0][0];
            int a12 = a[0][1];
            int a21 = a[1][0];
            int a22 = a[1][1];

            int b11 = b[0][0];
            int b12 = b[0][1];
            int b21 = b[1][0];
            int b22 = b[1][1];

            // compute 7 products
            int p1 = a11 * (b12 - b22);
            int p2 = (a11 + a12) * b22;
            int p3 = (a21 + a22) * b11;
            int p4 = a22 * (b21 - b11);
            int p5 = (a11 + a22) * (b11 + b22);
            int p6 = (a12 - a22) * (b21 + b22);
            int p7 = (a11 - a21) * (b11 + b12);

            // compute quadrants of c
            c[0][0] = p4 + p5 + p6 - p2;
            c[0][1] = p1 + p2;
            c[1][0] = p3 + p4;
            c[1][1] = p1 - p3 + p5 + p7;
        }
        // general case
        else
        {
            int splitIndex = dimension / 2;

            // Divide matrix A into 4 quadrants
            int[][] A11 = divideMatrix(a, 0, splitIndex, 0, splitIndex);
            int[][] A12 = divideMatrix(a, 0, splitIndex, splitIndex, dimension);
            int[][] A21 = divideMatrix(a, splitIndex, dimension, 0, splitIndex);
            int[][] A22 = divideMatrix(a, splitIndex, dimension, splitIndex, dimension);
            
            // Divide matrix B into 4 quadrants
            int[][] B11 = divideMatrix(b, 0, splitIndex, 0, splitIndex);
            int[][] B12 = divideMatrix(b, 0, splitIndex, splitIndex, dimension);
            int[][] B21 = divideMatrix(b, splitIndex, dimension, 0, splitIndex);
            int[][] B22 = divideMatrix(b, splitIndex, dimension, splitIndex, dimension);

            // compute product 1 recursively
            int[][] B12minusB22 = subtractMatrix(B12, B22);
            int[][] P1 = strassenMultiply(A11, B12minusB22);

            // compute product 2 recursively
            int[][] A11plusA12 = addMatrix(A11, A12);
            int[][] P2 = strassenMultiply(A11plusA12, B22);

            // compute product 3 recursively
            int[][] A21plusA22 = addMatrix(A21, A22);
            int[][] P3 = strassenMultiply(A21plusA22, B11);

            // compute product 4 recursively
            int[][] B21minusB11 = subtractMatrix(B21, B11);
            int[][] P4 = strassenMultiply(A22, B21minusB11);

            // compute product 5 recursively
            int[][] A11plusA22 = addMatrix(A11, A22);
            int[][] B11plusB22 = addMatrix(B11, B22);
            int[][] P5 = strassenMultiply(A11plusA22, B11plusB22);

            // compute product 6 recursively
            int[][] A12minusA22 = subtractMatrix(A12, A22);
            int[][] B21plusB22 = addMatrix(B21, B22);
            int[][] P6 = strassenMultiply(A12minusA22, B21plusB22);

            // compute product 7 recursively
            int[][] A11minusA21 = subtractMatrix(A11, A21);
            int[][] B11plusB12 = addMatrix(B11, B12);
            int[][] P7 = strassenMultiply(A11minusA21, B11plusB12);

            // compute C11
            int[][] C11sum1 = addMatrix(P4, P5);
            int[][] C11sub1 = subtractMatrix(P6, P2);
            int[][] C11 = addMatrix(C11sum1, C11sub1);

            // compute C12
            int[][] C12 = addMatrix(P1, P2);

            // compute C21
            int[][] C21 = addMatrix(P3, P4);

            // compute C22
            int[][] C22sub1 = subtractMatrix(P1, P3);
            int[][] C22sub2 = subtractMatrix(P5, P7);
            int[][] C22 = addMatrix(C22sub1, C22sub2);

            c = combineMatrix(C11, C12, C21, C22, dimension);
        }

        return c;
    }


    // helper method for dividing matrices
    private static int[][] divideMatrix(int[][] m, int rowStart, int rowEnd, int colStart, int colEnd)
    {
        int halfDim = m.length / 2;

        int[][] result = new int[halfDim][halfDim];

        for(int i = rowStart; i < rowEnd; i++)
        {
            for(int j = colStart; j < colEnd; j++)
            {
                result[i - rowStart][j - colStart] = m[i][j];
            }
        }
        return result;
    }

    // helper function for combining matrices
    private static int[][] combineMatrix(int[][] M11, int[][] M12, int[][] M21, int[][] M22, int dimension)
    {
        int[][] result = new int[dimension][dimension];
        int splitIndex = dimension / 2;

        for(int i = 0; i < splitIndex; i++)
        {
            for(int j = 0; j < splitIndex; j++)
            {
                result[i][j] = M11[i][j];
                result[i][j + splitIndex] = M12[i][j];
                result[i + splitIndex][j] = M21[i][j];
                result[i + splitIndex][j + splitIndex] = M22[i][j];
            }
        }

        return result;
    }

    // helper method for adding matrices
    private static int[][] addMatrix(int[][] m1, int[][] m2)
    {
        int m1Rows = m1.length;
        int m1Cols = m1[0].length;
        int[][] sum = new int[m1Rows][m1Cols];

        for(int i = 0; i < m1Rows; i++)
        {
            for(int j = 0; j < m1Rows; j++)
            {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
    }

    // helper method for subtracting matrices
    private static int[][] subtractMatrix(int[][] m1, int[][] m2)
    {
        int m1Rows = m1.length;
        int m1Cols = m1[0].length;
        int[][] sum = new int[m1Rows][m1Cols];

        for(int i = 0; i < m1Rows; i++)
        {
            for(int j = 0; j < m1Rows; j++)
            {
                sum[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return sum;
    }

    // helper method for creating random matrix
    private static int[][] createMatrixA(int size)
    {
        int[][] result = new int[size][size];

        int num = 1;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                result[i][j] = num;
                num++;
            }
        }
        return result;
    }

    // helper method for creating random matrix
    private static int[][] createMatrixB(int size)
    {
        int[][] result = new int[size][size];

        int num = size * size;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                result[i][j] = num;
                num--;
            }
        }
        return result;
    }

    // helper method for printing matrix
    private static void printMatrix(int[][] m)
    {
        int num = m.length;
        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < num; j++)
            {
                int element = m[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
