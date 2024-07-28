package dev.lpa;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

record VolleyballPlayer(String name, String position) implements Player {
}

public class GenericsMain {
    public static void main(String[] args) throws Exception {

        var angel = new Affiliation("city","Los Angeles, CA", "US");
        BaseballTeam angels1 = new BaseballTeam("Los Angeles Angels");
        BaseballTeam dodgers1 = new BaseballTeam("Los Angeles Dodgers");
        scoreResult(angels1, 3, dodgers1, 5);

        SportsTeam angels2 = new SportsTeam("Los Angeles Angels");
        SportsTeam dodgers2 = new SportsTeam("Los Angeles Dodgers");
        scoreResult(angels2, 3, dodgers2, 5);

        Team<BaseballPlayer, Affiliation> angels = new Team<>("Los Angeles Angels", angel);
        Team<BaseballPlayer, Affiliation> dodgers = new Team<>("Los Angeles Dodgers");
        scoreResult(angels, 3, dodgers, 5);

        var trout = new BaseballPlayer("Mike Trout", "Center Field");
        var bellinger = new BaseballPlayer("Cody Bellinger", "First Base");
        angels.addTeamMember(trout);
        angels.addTeamMember(bellinger);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        angels.addTeamMember(guthrie);
        angels.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Los Angeles Rams");
        Team<FootballPlayer, String> afc = new Team<>("Los Angeles Rams", "City of Los Angeles, California, USA");
        var tex = new FootballPlayer("Tex Walkers", "Quarterback");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Mid Field");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> rams = new Team<>("Los Angeles Rams");
        rams.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        rams.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, rams, 1);

        // Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");

    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }
}
