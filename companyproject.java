public class classroom {
    private String teacher;
    private String subject;
    private String room;
    private boolean bathroom;
    public classroom()
    {
        teacher = "Mr. Jan ";
        subject = "Geometry & AP Computer Science";
        room = "B2 ";
        bathroom = false;
    }
    public classroom(String a, String b, String c, boolean d)
    {
        teacher = a;
        subject = b;
        room = c;
        bathroom = d;
    }
    public String getTeacher()
    {
        return teacher;
    }
    public String getSubject()
    {
        return subject;
    }
    public String getRoom()
    {
        return room;
    }
    public boolean hasBathroom()
    {
        return bathroom;
    }
    public void setTeacher(String t)
    {
        teacher = t;
    }
    public void setSubject(String s)
    {
        subject = s;
    }
    public void setRoom(String r)
    {
        room = r;
    }
    public void setBathroom(boolean b)
    {
        bathroom = b;
    }
    public String toString()
    {
        return teacher + "teaches " + subject + " in " + room + ".";
    }
}
