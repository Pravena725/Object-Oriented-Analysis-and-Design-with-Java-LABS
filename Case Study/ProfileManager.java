public class Personal {
    String per_info;
}

public class Proffesional {
    String prof_info;
}

public class BioData {
    String data;
}

public class Samples {
    String sample;
}

public interface Resume implements Personal, Proffesional {
    
}

punblic interface Portfolio implements BioData, Samples {
    
}
