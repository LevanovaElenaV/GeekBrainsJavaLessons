package JavaCoreLesson1;

public class Race {

    public static class Member {
        public String name;
        public int run; // сколько всего км может пробежать
        public int swim; // сколько всего км может проплыть
        public int climb; // сколько м может перелезть
        public int jump; // максимальная высота прыжка
        public boolean done;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Member(String name, int run, int swim, int climb, int jump) {
            this.name = name;
            this.run = run;
            this.swim = swim;
            this.climb = climb;
            this.jump = jump;
            this.done = false;
        }
    }

    public static class Team {
        public String name;
        static Member[] members;
        public boolean done;

        public Team(String name, Member[] members) {
            this.name = name;
            this.members = members;
            this.done = false;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void showResults() {
            if (done) {
                System.out.println("Полоса пройдена!");
            } else {
                System.out.println("Слив засчитан");
                for (int i = 0; i < 4; i++) {
                    System.out.println(members[i].name + " "+ members[i].done);
                }
            }
        }

    }

    public static class Course {
        public int length;
        public int riverWide;
        public int wallHeight;
        public int barriersHeight;

        public Course(int length, int riverWide, int wallHeight, int barriersHeight) {
            this.length = length;
            this.riverWide = riverWide;
            this.wallHeight = wallHeight;
            this.barriersHeight = barriersHeight;
        }

        void doIt (Team team) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                    if ((team.members[i].run >= length) & (team.members[i].swim >= riverWide) & (team.members[i].climb >= wallHeight) & (team.members[i].jump >= barriersHeight) ) {
                        count += 1;
                        team.members[i].done = true;
                    }
                }
            if (count == 4) team.done = true;
        }
    }

    public static void main(String[] args) {

        Member member1 = new Member("Jack", 120,10,200, 2);
        Member member2 = new Member("Pit", 100,50, 200, 2);
        Member member3 = new Member("Mike", 100, 10, 500, 2);
        Member member4 = new Member("Alice", 70,20, 200,1);

        Member[] members = {member1, member2, member3, member4};

        Team team = new Team("AllStars", members ); // Создаем команду


       Course c = new Course(70, 10, 150, 1 ); // Создаем полосу препятствий
       c.doIt(team); // Просим команду пройти полосу
       team.showResults(); // Показываем результаты
    }

}
