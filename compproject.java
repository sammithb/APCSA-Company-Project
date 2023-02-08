import java.util.*;
public class MissionMap {
    public static void main(String[] args) {
        Scanner map = new Scanner(System.in);
        boolean inuse = true;
        print();
        ArrayList<classroom> school = new ArrayList<>();
        classroom studentparking = new classroom("", "Student Parking", "Student Parking ", false);
        school.add(studentparking);
        classroom kang = new classroom("Ms. Kang ", "English 10 & 12", "P6 ", false);
        school.add(kang);
        classroom rath = new classroom("Mr. Rath ", "English 10H & AP English Literature", "P5 ", false);
        school.add(rath);
        classroom g3 = new classroom("", "Small Gym", "G3 ", false);
        school.add(g3);
        classroom pool = new classroom("", "Pool", "Pool ", false);
        school.add(pool);
        classroom boys = new classroom("", "Boys Locker Room", "Boys ", true);
        school.add(boys);
        classroom girls = new classroom("", "Girls Locker Room", "Girls 2" +
                "" , true);
        school.add(girls);
        classroom g2 = new classroom("", "Mini Gym", "G2 ", false);
        school.add(g3);
        classroom e5 = new classroom("", "Book Room & Ceramics Room", "E5 ", false);
        school.add(e5);
        classroom e6 = new classroom("", "Weight Room", "E6 ", false);
        school.add(e6);
        classroom beckel = new classroom("Mr. Beckel ", "AP Music Theory & Choir 1/2", "E4 ", false );
        school.add(beckel);
        classroom stampfli = new classroom("Mr. Stampfli ", "Digital Photo 1", "E7 " , false);
        school.add(stampfli);
        classroom hobbs = new classroom("Ms. Hobbs ", "AP Studio Art & Art 1-3", "E3 ", false );
        school.add(hobbs);
        classroom boegman = new classroom("Mr. Boegman ", "English 9H & 10H", "E1A " , false);
        school.add(boegman);
        classroom dotson = new classroom("Ms. Dotson ", "English 11 & Expository Reading and Writing & Yearbook", "E1B " , false);
        school.add(dotson);
        classroom waller = new classroom("Ms. Waller ", "English 9H & 11H", "E2A ", false );
        school.add(waller);
        classroom low = new classroom("Tr. Low ", "English 9H & 10H & 11H", "E2B ", false );
        school.add(low);
        classroom boiler = new classroom("", "Boiler Room", "Boiler Room ", false);
        school.add(boiler);
        classroom p7 = new classroom("", "Storage Unit", "P7 ", false);
        school.add(p7);
        classroom ruebling = new classroom("Ms. Ruebling ", "Health", "P1 ",true);
        school.add(ruebling);
        classroom chung = new classroom("", "Ms. Chung ", "P2 ", false);
        school.add(chung);
        classroom smith = new classroom("Ms. Smith ", "Spanish 1/2", "P3 ", false);
        school.add(smith);
        classroom singh = new classroom("Ms. Singh ", "Adult Special Education", "P4 ", true);
        school.add(singh);
        classroom marple = new classroom("Mr. Marple ", "English 9H & English 10", "P21 ", false);
        school.add(marple);
        classroom p22 = new classroom("", "P22", "P22 ", false);
        school.add(p22);
        classroom dai = new classroom("Mr. Dai ", "English 10/10H & 11", "P23 ", false);
        school.add(dai);
        classroom p24 = new classroom("", "P24 ", "P24 ", false);
        school.add(p24);
        classroom larosa = new classroom("Tr. LaRosa ", "English 9H & 11H", "P25 ", false);
        school.add(larosa);
        classroom p26 = new classroom("", "P26", "P26 ", false);
        school.add(p26);
        classroom wren = new classroom("Mr. Wren ", "Adult Special Education", "M1 ", false);
        school.add(wren);
        classroom cohen = new classroom("Ms. Cohen ", "Journalism 1-3 & English 12", "M2 ", false );
        school.add(cohen);
        classroom evans = new classroom("Ms. Evans ", "Spanish 1/2","M3 " , true );
        school.add(evans);
        classroom vaz = new classroom("Mr. Vaz  ", "PE/Club Fitness", "Gym " , false);
        school.add(vaz);
        classroom randazzo = new classroom("Ms. Randazzo ", "PE", "Gym ", true);
        school.add(randazzo);
        classroom kaeo = new classroom("Ms. Kaeo ", "PE/Club Fitness", "Gym ", true);
        school.add(kaeo);
        classroom marden = new classroom("Mr. Marden ", "PE ", "Gym ", true);
        school.add(marden);
        classroom kuei = new classroom("Ms. Kuei ", "Chemistry in the Earth Systems, Honors Chemistry", "C16 ", false);
        school.add(kuei);
        classroom mueller = new classroom("Ms. Mueller ", "Chemistry in the Earth Systems, Honors Chemistry", "C17 " , false);
        school.add(mueller);
        classroom seremeta = new classroom("Ms. Seremeta ", "Living Earth & AP Chemistry", "C18 " , false);
        school.add(seremeta);
        classroom snack = new classroom("", "Snack bar", "Snack bar ", false);
        school.add(snack);
        classroom kraft = new classroom("Ms. Kraft ", "Band & Advanced Band 1-3 & Orchestra 1-4 & Marching Band", "M4 , M5 , M6 " , false);
        school.add(kraft);
        classroom boyer = new classroom("Ms. Boyer ", "Library", "Library " , false);
        school.add(boyer);
        classroom belltower = new classroom("", "Bell Tower", "Bell Tower ", false);
        school.add(belltower);
        classroom c1 = new classroom("", "Therapy Room", "C1 ", false);
        school.add(c1);
        classroom c2 = new classroom("", "Wellness Center", "C2 ", false);
        school.add(c2);
        classroom wareHartbeck = new classroom("Ms. Ware-Hartbeck ", "Living Earth & Health & AP Psychology & Psychology & Anatomy and Physiology", "C9 ", false );
        school.add(wareHartbeck);
        classroom ware = new classroom("Ms. Ware ", "Living Earth & Chemistry in the Earth Systems", "C10 ", false );
        school.add(ware);
        classroom sharma = new classroom("Ms. Sharma ", "Physics & Physics in the Universe", "C11 " , false);
        school.add(sharma);
        classroom c122 = new classroom("", "C122", "C122 ", false);
        school.add(c122);
        classroom c120 = new classroom("", "Multipurpose room", "C120 ", false);
        school.add(c120);
        classroom sultana = new classroom("Ms. Sultana ", "AP Biology & Living Earth", "P10 ", false);
        school.add(sultana);
        classroom melcic = new classroom("Mr. Melcic ", "Living Earth & AP Biology", "P9 ", false);
        school.add(melcic);
        classroom geers = new classroom("Ms. Geers ", "English 10H & AP English Literature", "P8 ", false);
        school.add(geers);
        classroom carattini = new classroom("Ms. Carattini ", "English 11/11H & Entrepreneurship 1/2 & Marketing", "P11 ", false);
        school.add(carattini);
        classroom stage = new classroom("", "Stage", "Stage ", false);
        school.add(stage);
        classroom l3 = new classroom("", "Printing Room", "L3 ", false);
        school.add(l3);
        classroom l5 = new classroom("", "Career Center & Student Store", "L5 ", false);
        school.add(l5);
        classroom bates = new classroom("Mr. Bates ", "Precalc Honors, Algebra 2 Trig/Precalculus Accelerated, Geometry", "C4 ", false );
        school.add(bates);
        classroom cafeteria1 = new classroom("", "Lunchroom", "C7 ", true);
        school.add(cafeteria1);
        classroom Mmagana = new classroom("Ms. Magana ", "Physics & Chemistry", "C14 ", false );
        school.add(Mmagana);
        classroom sawicka = new classroom("Ms. Sawicka ", "AP Physics 1", "C13 ", false );
        school.add(sawicka);
        classroom kumar = new classroom("Ms. Kumar ", "AP Physics 1 & AP Physics C & Classical Mechanics", "C12 ", false );
        school.add(kumar);
        classroom c121 = new classroom("", "C121", "C121 ", false);
        school.add(c121);
        classroom lau = new classroom("Mr. Lau ", "AP Statistics", "C6 ", false );
        school.add(lau);
        classroom patil = new classroom("Ms. Patil ", "Geometry & CC3 Math", "C5 " , false);
        school.add(patil);
        classroom ishimine = new classroom("Ms. Ishimine ", "Living Earth & AP Environmental Science", "N8 ", false);
        school.add(ishimine);
        classroom roblesgarcia = new classroom("Ms. Robles ", "Spanish 1/2", "N10 ", false);
        school.add(roblesgarcia);
        classroom breazeale = new classroom("Mr. Breazeale ", "PE & Leadership 1/2", "N7 ", false);
        school.add(breazeale);
        classroom lMagana = new classroom("Ms. Magana ", "Spanish 3 & AP Spanish", "N11 " ,true);
        school.add(lMagana);
        classroom saldivar = new classroom("Ms. Saldivar ", "CP Precalc & Precalc Honors & Trigonometry", "B1 " , false);
        school.add(saldivar);
        classroom jan = new classroom();
        school.add(jan);
        classroom hyunh = new classroom("Ms. Hyunh ", "Multivar/Linear Algebra", "B3 ", false );
        school.add(hyunh);
        classroom vu = new classroom("Ms. Vu ", "Multivar/Linear Algebra", "B3 ", false );
        school.add(vu);
        classroom tseng = new classroom("Ms. Tseng ", "Geometry/Algebra 2 Trig Accelerated & Algebra 2 Trig", "B4 ", false );
        school.add(tseng);
        classroom Khui = new classroom("Mr. Hui ", "AP Psychology & World History", "B15 " , false);
        school.add(Khui);
        classroom remmers = new classroom("Mr. Remmers ", "US History & History in Film", "B16 " , false);
        school.add(remmers);
        classroom peterson = new classroom("Mr. Peterson ", "Government and Economics", "B17 " , false);
        school.add(peterson);
        classroom williams = new classroom("Ms. Williams ", "Government and Economics", "B18 " , false);
        school.add(williams);
        classroom benton = new classroom("Ms. Benton ", "AP World History", "B30 " , false);
        school.add(benton);
        classroom saldana = new classroom("Mr. Saldana ", "Algebra 2 Trig & Intro to Design" , "B31 ", false );
        school.add(saldana);
        classroom mainoffice = new classroom("", "Main Office", "Main Office ", false);
        school.add(mainoffice);
        classroom cafeteria2 = new classroom("", "Lunchroom", "B12 ", true);
        school.add(cafeteria2);
        classroom mccarthy = new classroom("Ms. McCarthy ", "Chinese 1/2", "B32 " , false );
        school.add(mccarthy);
        classroom vierk = new classroom("Mr. Vierk ", "Civics and World History", "N5 ", false);
        school.add(vierk);
        classroom robinson = new classroom("Mr. Robinson ", "Algebra 1 & Algebra 2 Trig/Precalc Accelerated & CC3 Math" , "N3 ", false);
        school.add(robinson);
        classroom zhang = new classroom("Ms. Zhang ", "AP Chinese Language & Chinese Levels 1-4", "N1 ", false);
        school.add(zhang);
        classroom Dhui = new classroom("Mr. Hui ", "Digital Imaging 1/2 & Sculpture and Ceramics", "N4 ", false);
        school.add(Dhui);
        classroom sartori = new classroom("Ms. Sartori ", "French 1-4 & AP French & Peer Resource", "N2 " , false);
        school.add(sartori);
        classroom rusu = new classroom("Ms. Rusu ", "AP Calculus AB & BC", "B7 ", false );
        school.add(rusu);
        classroom hoffman = new classroom("Mr. Hoffman ", "C++ & Discrete Math", "B8 ", false );
        school.add(hoffman);
        classroom umit = new classroom("Mr. Umit ", "AP Calculus AB/BC & Calculus", "B9 " , false);
        school.add(umit);
        classroom kobylecky = new classroom("Mr. Kobylecky ", "Precalculus & Algebra 2", "B10 " , false);
        school.add(kobylecky);
        classroom weed = new classroom("Ms. Weed-Wolnick ", "English 9", "B24 ", false );
        school.add(weed);
        classroom salazar = new classroom("Ms. Salazar ", "World History & AP Psychology", "B23 ", false );
        school.add(salazar);
        classroom jeffers = new classroom("Mr. Jeffers ", "US History & AP Human Geography", "B22 ", false );
        school.add(jeffers);
        classroom kearns = new classroom("Ms. Kearns ", "Government and Economics & Women's Studies & Ethnic Studies", "B21 " , false);
        school.add(kearns);
        classroom usrey = new classroom("Mr. Usrey ", "World History & US History", "B37 " , false);
        school.add(usrey);
        classroom macasero = new classroom("Mr. Macasero ", "Civics & Government and Economics", "B36 " , false);
        school.add(macasero);
        classroom bellotti = new classroom("Mr. Bellotti ", "AP US History & US History", "B35 " , false);
        school.add(bellotti);
        classroom liu = new classroom("Mr. Liu ", "AP Statistics & Precalc Honors & AP Calculus AB", "A1 ", false );
        school.add(liu);
        classroom sugden = new classroom("Mr. Sugden ", "Geometry/Algebra 2 Trig Accelerated & Algebra 2", "A2 " , false);
        school.add(sugden);
        classroom nguyen = new classroom("Ms. Nguyen ", "Algebra 1 & Geometry & Algebra 2 Trig & Algebra 1/Geometry Accelerated", "A3 " , false);
        school.add(nguyen);
        classroom twofourone = new classroom("", "Flex Room", "241 ", false);
        school.add(twofourone);
        classroom twofourtwo = new classroom("", "Flex Room", "242 ", false);
        school.add(twofourtwo);
        classroom horseshoe = new classroom("", "Horseshoe Parking", "Horseshoe ", false);
        school.add(horseshoe);
        while(inuse) {
            int count = 0;
            System.out.println("Welcome to the Interactive MSJ Map. ");
            System.out.println("What do you need help with?");
            System.out.println("Enter the number for the service you are looking for.");
            System.out.println("1. Find a place on the map \n" + "2. Learn more about a teacher \n" + "3. Frequently Asked Questions \n" + "4. Find nearest bathroom \n" + "5. Find all teachers in wing \n" + "6. Search for teachers that teach a certain subject \n" + "7. Show map \n" + "8. Teacher directory \n");
            int choice = map.nextInt();
            map.nextLine();
            if (choice == 1)
            {
                System.out.println("Are you looking for a teacher or room on the map?");
                String lookfor = map.nextLine();
                if (lookfor.equals("teacher"))
                {
                    System.out.println("What is the teacher's last name? Example: Jan");
                    String teach = map.nextLine() + " ";
                    for (int i = 0; i < school.size(); i++)
                    {
                        if (school.get(i).getTeacher().indexOf(teach) != -1)
                        {
                            count++;
                            System.out.println(teach + "is in room " + school.get(i).getRoom() + ".");
                        }
                    }
                    if (count == 0)
                    {
                        System.out.println("Error: either incorrect spelling/capitalization or this teacher does not exist.");
                    }
                }
                if (lookfor.equals("room"))
                {
                    System.out.println("What room are you trying to find? Example: B2");
                    String roomnum = map.nextLine() + " ";
                    for (int i = 0; i < school.size(); i++)
                    {
                        if ((school.get(i).getRoom().indexOf(roomnum) != -1))
                        {
                            count++;
                            System.out.println(roomnum + "is where " + school.get(i).getTeacher() + "teaches in.");
                        }
                    }
                    if (count == 0)
                    {
                        System.out.println("Error: either incorrect spelling/capitalization or this room does not exist.");
                    }
                }
            }
            if (choice == 2) {
                System.out.println("Do you want to learn more about a (1) teacher or a (2) room?");
                int rep = map.nextInt();
                map.nextLine();
                if (rep == 1) {
                    System.out.println("Please enter teacher last name. Example: Jan");
                    String last = map.nextLine() + " ";
                    for (int i = 0; i < school.size(); i++) {
                        if (school.get(i).getTeacher().indexOf(last) != -1) {
                            count++;
                            System.out.println(school.get(i));
                        }
                    }
                    if (count == 0)
                    {
                        System.out.println("Error: either incorrect spelling/capitalization or this teacher does not exist.");
                    }
                }
                if (rep == 2) {
                    System.out.println("Please enter a room number. Example: B2");
                    String ro = map.nextLine() + " ";
                    for (int i = 0; i < school.size(); i++) {
                        if (school.get(i).getRoom().indexOf(ro) != -1) {
                            count++;
                            System.out.println(school.get(i));
                        }
                    }
                    if (count == 0)
                    {
                        System.out.println("Error: either incorrect spelling/capitalization or this room does not exist.");
                    }
                }
            }
            if (choice == 3)
            {
                boolean q = true;
                while (q) {
                    System.out.println("Please choose one of the following.");
                    System.out.println("1. Where can I eat lunch/Where can I get school lunch? \n" + "2. What is advisory? \n" + "3. Where do I go for PE? \n" + "4. What is in C120? \n" + "5. Where can I find more information about school clubs? \n" + "6. What does BTQ stand for? \n" + "7. What is Minga? \n" + "8. What is Infinite Campus and how can I access it? \n" + "9. Quit");
                    int help = map.nextInt();
                    map.nextLine();
                    if (help == 1) {
                        System.out.println("Near the bell tower (see map), there are a bunch of lunch tables for you and your friends to sit at.\n The campus also has a load of lunch benches scattered around the campus as well. If you would like the sit indoors, B12 is open every day. With the \n exception of rainy days, room 242 will be open for lunch seating. School lunch is served in C7 and at the snack bar near Gym and C classrooms.");
                    }
                    if (help == 2) {
                        System.out.println("Advisory is a block period of 50 minutes where students can visit any classroom for the duration of the time. Students can make up tests, \n ask questions, meet up with friends, participate in an event , etc. Make sure to let the teacher that you are staying with scan your student ID, \n or else you might get a Saturday School!");
                    }
                    if (help == 3) {
                        System.out.println("For students taking Physical Education, make sure to head into the appropriate locker room before class. After you change into your PE clothes, \n wait in front of the gym or behind the locker rooms according to your teacher's meeting point.");
                    }
                    if (help == 4) {
                        System.out.println("C120 serves as a multiple purpose room. Inside, you can see rows and rows of seats like a theater. During the beginning of the school year, students \n can go inside to take pictures for their student ID card. The leadership class and some clubs may host events in the building \n as well. On Wednesdays, you can go inside C120 to get your free Covid test.");
                    }
                    if (help == 5) {
                        System.out.println("Click link --> msjasb.org/clubs/ or look in Minga app. If you want to learn more about Minga select option 7.");
                    }
                    if (help == 6) {
                        System.out.println("BTQ stands for bell tower quad.");
                    }
                    if (help == 7) {
                        System.out.println("Minga is a mobile app that allows students to access their digital student ID and find out more information about the school's clubs and activities. \n Make sure to check it often for announcements!");
                    }
                    if (help == 8) {
                        System.out.println("Infinite Campus is an online website where students can see their grades in each subject as well as getting messages from the principal and other school staff.");
                    }
                    if (help == 9)
                    {
                        q = false;
                    }
                    if (q) {
                        System.out.println("Would you like to learn more?");
                        String re = map.nextLine();
                        if (re.equals("no")) {
                            q = false;
                        }
                    }
                }
            }
            if (choice == 4)
            {
                System.out.println("Enter current room number.");
                String roomnum = map.nextLine() + " ";
                int roomposition = 0;
                int broke = 0;
                for (int i = 0; (i < school.size()) && (broke == 0); i++) {
                    if (school.get(i).getRoom().equals(roomnum)){
                        roomposition = i;
                        broke++;
                    }
                }
                int position = school.size() + 1;
                int bathroomposition = -1;
                for (int i = 0; i <  school.size(); i++) {
                    if (school.get(i).hasBathroom()) {
                        if (position > Math.abs(roomposition - i)) {
                            bathroomposition = i;
                            position = Math.abs(roomposition - i);
                        }
                    }
                }
                classroom room = school.get(bathroomposition);
                System.out.println("The nearest bathroom is near " + room.getRoom());
            }
            if (choice == 5)
            {
                System.out.println("What wing would you like to know more about? (in caps)");
                String wing = map.nextLine();
                for (int i = 0; i < school.size(); i++)
                {
                    for (int j = 0; j < school.get(i).getRoom().length() - 1; j++)
                    {
                        if (school.get(i).getRoom().substring(j,j+1).equals(wing)) {
                            count++;
                            System.out.println(school.get(i));
                        }
                    }
                    if (count == 0)
                    {
                        System.out.println("Error: either incorrect spelling/capitalization or this wing does not exist.");
                    }
                }
            }
            if (choice == 6)
            {
                System.out.println("What subject are you interested in? Be as specific as possible.");
                String sub = map.nextLine();
                for (int i = 0; i < school.size(); i++)
                {
                    if (school.get(i).getSubject().indexOf(sub) != -1)
                    {
                        count++;
                        System.out.println(school.get(i));
                    }
                    if (count == 0)
                    {
                        System.out.println("Error: either incorrect spelling/capitalization or this subject does not exist.");
                    }
                }
            }
            if (choice == 7)
            {
                print();
            }
            if (choice == 8)
            {
                for (int i = 0; i < school.size(); i++)
                {
                    if (!school.get(i).getTeacher().equals(""))
                        System.out.println(school.get(i).getTeacher());
                }
            }
            System.out.println("Do you want to use this app again?");
            String no = map.nextLine();
            if (no.equals("no")) {
                inuse = false;
                System.out.println("Thank you for using. Please use this again!");
            }
        }
    }
    public static void print()
    {
        System.out.println("                         --------                                                  ");
        System.out.println("                         |  G3  |                                               ");
        System.out.println("Student      Basketball  | Small|-----------------    ---------------------------      ");
        System.out.println("Parking         Courts   |  Gym |   Pool  | Girls |   |     E5     |     E6     |  ----    ");
        System.out.println("                         -----------------| Locker|   -----------|--------------|  |P7|");
        System.out.println("             ----        | Boys Locker | G2| Room |    | E4 | E7 |              |  ----    ");
        System.out.println("             |P6|        |    Room     |-----------    |    |--- |              |      ");
        System.out.println("             ----        ---------------         BR    |    | E3 |              |      ");
        System.out.println("             |P5|                     BR               ----------------- -------|      ");
        System.out.println("             ----                                      | E | E | E | E | Boiler | ");
        System.out.println("                                                       | 1A| 1B| 2A| 2B| Room   |        ");
        System.out.println("------------------------               ----------      --------------------------                                  ");
        System.out.println("|                      |    ------     |        |                                        ----------------                  ");
        System.out.println("|      P Wing          |    | M1 |     |   G1   |                                        |    |    |    |                  ");
        System.out.println("| 1st Floor: P1 - P4   |    ------     |  Gym   |                                        |    |    |    |         ");
        System.out.println("|                      |    | M2 |     |        |                       -------------    | C  | C  | C  |                   ");
        System.out.println("| 2nd Floor: P21 - P26 |    ------     |        |                       | Snack Bar |    | 16 | 17 | 18 |              ");
        System.out.println("|                      |    | M3 |     ----------                       -------------    |    |    |    |                ");
        System.out.println("------------------------    ------                                                       ----------------            -------");
        System.out.println("        BR                   BR                             --------------                                          /      |");
        System.out.println("                     ---------------    -----------         | Bell Tower |                 --------------          / C 122 |");
        System.out.println("                     |  M6  |  M4  |    | Library |         --------------  ----------- BR | C | C | C |    ------/       /");
        System.out.println("                     |      |  M5  |    |    L1   |------                   | C1 | C2 |----| 9 | 10| 11|    |  C  |-------");
        System.out.println("-----------------    ----------------   -----------| L3 |                   ----------| C7 |------------    | 120 |");
        System.out.println("| P | P | P | P |           | Stage |            | L5   |                   | C3 | C4 |----| C | C | C |    |     |-------");
        System.out.println("| 10| 9 | 8 | 11|           ---------            --------                   -----------    | 14| 13| 12|    ------\\       \\");
        System.out.println("-----------------                                                           | C6 | C5 |    -------------           \\ C 121 |");
        System.out.println("                                                                            -----------                             \\      |");
        System.out.println("    --------------------                                                                                             -------");
        System.out.println("    |  N8  | N |  N10  |                                                                                                      ");
        System.out.println("    -------| 9 |--------                               ---------------------      -------------------------  -------------------");
        System.out.println("    |  N7  |---|  N11  |                               | B1 | B2 | B3 | B4 |      | B15 | B16 | B17 | B18 |  | B30 | B31 | B33 |");
        System.out.println("    --------    --------            ---------------    ----------------------------------------------------  -------------------");
        System.out.println("                  BR                | Main Office |    | B6 | B5 |         |  B   |           | B20 | B19 |    | B32 | B34|");
        System.out.println("    --------------------            ---------------    --------------------|  12  |------------------------  --------------------");
        System.out.println("    |  N5  | N |  N1   |                               | B7 | B8 | B9 | B10|------| B24 | B23 | B22 | B21 |  | B37 | B36 | B35 | ");
        System.out.println("    -------| 3 |--------         ----------------      ---------------------  BR  -------------------------  --------------------");
        System.out.println("    |  N4  |---|  N2   |        /   ----------   \\                                                                               ");
        System.out.println("    --------   ---------        |   |  Horse |   |            --------------------------------------------------------             ");
        System.out.println("                                |   |  Shoe  |   |            |    241    |     242    |    A1    |  A2  |    A3     |             ");
        System.out.println("                                |   |        |   |            --------------------------------------------------------               ");
        System.out.println("                                |   |        |   |                                                                                    ");
        System.out.println();
        System.out.println("Map Key: ");
        System.out.println("BR - Bathroom ");
        System.out.println("N + # - N Wing");
        System.out.println("P + # - P Wing");
        System.out.println("M + # - M Wing");
        System.out.println("B + # - B Wing");
        System.out.println("A + # - A Wing");
        System.out.println("C + # - C Wing");
        System.out.println("E + # - E Wing");
    }
}
