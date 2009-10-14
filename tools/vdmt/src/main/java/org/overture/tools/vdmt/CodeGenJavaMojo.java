package org.overture.tools.vdmt;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.overture.tools.vdmt.VDMToolsProxy.VdmProject;

/**
 * Says "Hi" to the user.
 * 
 * @goal code
 * @goal eclipse
 * @requiresDependencyResolution test scopes
 */
public class CodeGenJavaMojo extends VdmBaseMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {
		super.execute();

		try{
		VdmProject p = new VdmProject(getLog(), vdmToolsCmd, project.getFile().getParentFile(), dependedVppLocations);
		p.codeGen(excludePackages,excludeClasses,importPackages);
		}catch (MojoExecutionException e)
		{
			throw e;
		}

	}

}
