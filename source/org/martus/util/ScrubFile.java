/*

The Martus(tm) free, social justice documentation and
monitoring software. Copyright (C) 2001-2003, Beneficent
Technology, Inc. (Benetech).

Martus is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either
version 2 of the License, or (at your option) any later
version with the additions and exceptions described in the
accompanying Martus license file entitled "license.txt".

It is distributed WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, including warranties of fitness of purpose or
merchantability.  See the accompanying Martus License and
GPL license for more details on the required license terms
for this software.

You should have received a copy of the GNU General Public
License along with this program; if not, write to the Free
Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA 02111-1307, USA.

*/
package org.martus.util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ScrubFile
{
	static public void scrub(File file) throws IOException
	{
		RandomAccessFile randomFile = new RandomAccessFile(file, "rw");
		randomFile.seek(0);
			
		for (int i=0; i< randomFile.length();++i)
		{
			randomFile.write(0x55);
		}
			
		randomFile.close();		
	}
}
