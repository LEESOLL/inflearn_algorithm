package recursion;

public class Maze {
    private static int N = 8;
    private  static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private static final int PATHWAY_COLOR = 0;
    private static final int WALL_COLOR = 1; // 벽인 cell
    private static final int BLOCKED_COLOR = 2; // visited 이며 출구까지의 경로상에 있지 않음이 밝혀진 cell
    private static final int PATH_COLOR = 3; // visited 이며 아직 출구로 가는 경로가 될 가능성이 있는 cell

    public static boolean findMazePath(int x, int y) {
        if (x<0 || y<0 || x>=N || y>=N) //미로의 범위를 벗어나는 경우
            return false;
        else if (maze[x][y] != PATHWAY_COLOR) //갈 수 없는 cell 이거나 이미 방문한 cell
            return false;
        else if (x==N-1 && y==N-1) { //출구
            maze[x][y] = PATH_COLOR;
            return true;
        }
        else {
            maze[x][y] = PATH_COLOR; //출구로 가는 가능성이 있는 cell 일 때
            if (findMazePath(x-1, y) || findMazePath(x, y+1) || findMazePath(x+1, y) || findMazePath(x, y-1)) { //현재 위치의 북동남서 순서로 cell 을 확인함
                return true;
            }
            maze[x][y] = BLOCKED_COLOR; //위에서 true 를 반환하지 못하고 실행되는 문장이기에, 갈 수 있는 방향이 없는 것을 의미함 -> 출구로 가는 경로상에 없다는 뜻
            return false;
        }
    }

    public static void main(String[] args) {
        findMazePath(0, 0);
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
