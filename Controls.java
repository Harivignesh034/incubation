public class Controls {
    char pick = 'a';
    char drop = 'a';
    int cost = 0;
    byte wait_time = 0;
    byte travel_time = 0;
    Details obj;

    Controls(char pick, char drop, int cost, byte wait_time, byte travel_time, Details obj) {
        this.pick = pick;
        this.drop = drop;
        this.cost = cost;
        this.wait_time = wait_time;
        this.travel_time = travel_time;
        this.obj = obj;

    }

}
