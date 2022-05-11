package com.tg;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class SudokuIsValid {

    public boolean isValid(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i][j] != 0 && !check(sudoku, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check(int[][] sudoku, int r, int c) {
        for (int i = 0; i < sudoku[r].length; i++) {
            if (i != c && sudoku[r][i] == sudoku[r][c]) {
                return false;
            }
        }
        for (int i = 0; i < sudoku.length; i++) {
            if (i != r && sudoku[i][c] == sudoku[r][c]) {
                return false;
            }
        }

        int startRow = r - (r % 3);
        int startColumn = c - (c % 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (i != r && j != c && sudoku[i][j] == sudoku[r][c]) {
                    return false;
                }
            }
        }

        return true;
    }

}
