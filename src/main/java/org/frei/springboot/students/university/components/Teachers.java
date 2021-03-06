package org.frei.springboot.students.university.components;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
public class Teachers {

    private List<Teacher> teachers;

    @XmlElement
    public List<Teacher> getStudents() {
        if (teachers == null){
            teachers = new ArrayList<>();
        }

        return teachers;
    }
}


// teacher class