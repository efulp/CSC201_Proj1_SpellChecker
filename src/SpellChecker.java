/**
 * This program checks the spelling of a text file, both the dictionary
 * and text-file are command line arguments (in that order).
 *
 * Useage:
 *   java SpellChecker dictionary.txt text_file.txt
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Jan. 11, 2021
 */

public class SpellChecker {

    /**
     * This is the main method
     * @param args command line arguments (2 file names)
     */
    public static void main(String[] args){

        if(!argsOK(args))
            System.exit(1);

        System.out.println("Spell check " + args[0] + " using dictionary " + args[1]);
    }


    /**
     *  This method returns true if the command line arguments are acceptable,
     *  2 file names (Strings) must exist in args
     *
     *  @param  args list of Strings (command line arguments)
     *  @return true if the arguments are acceptable, false otherwise
     */
    private static boolean argsOK(String[] args){
        if(args.length != 2){
            System.out.println("Usage: java program dictionaryFile fileToCheck ");
            return false;
        }
        return true;
    }

}
