package com.aspose.tasks.examples.Projects;

import java.io.IOException;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class CreateEmptyProjectSaveMPP {

	public static void main(String[] args) throws IOException {
		// ExStart: CreateEmptyProjectSaveMPP
    	// For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateEmptyProjectSaveMPP.class);

        //Create a project instance
        Project newProject = new Project();

        newProject.save(dataDir + "Project1.mpp", SaveFileFormat.MPP);

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
        // ExEnd: CreateEmptyProjectSaveMPP
	}

}
