package Generator;

import Logic.FlowGame;
import Logic.FlowPuzzle;
import java.util.Random;
import java.io.File;

public class LoadPuzzleFromFile implements PuzzleGenerator {

    private static String PUZZLE_PATH = "../rsc/puzzles";

    private Random randomGenerator;
    private int puzzleCount;
    private String[] paths;
    private int previousIndex;

    public LoadPuzzleFromFile() {
        File f = new File(PUZZLE_PATH);
        paths = f.list();
        puzzleCount = paths.length;
        previousIndex = -1;
        randomGenerator = new Random();
    }

    @Override
    public FlowPuzzle generatePuzzle() {

        int r = randomGenerator.nextInt(puzzleCount);

        while (r == previousIndex) {
            r = randomGenerator.nextInt(puzzleCount);
        }

        previousIndex = r;

        return new FlowPuzzle(paths[previousIndex]);

    }

}
