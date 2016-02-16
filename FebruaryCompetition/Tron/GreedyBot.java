import java.util.*;
import java.io.*;
public class GreedyBot
{
    public static void main(String[] args) {
        Tron.init();
        ArrayList<ArrayList<Tron.Tile>> board = Tron.getMap();
        int[] myStart = TronUtils.findMe(board);
        Bot bot = new Bot(board, myStart);
        while (true) {
            bot.moveFirstFree(new int[]{1,2,3,4});
            //bot.moveRandomFree();
            bot.update();
        }
    }
}
