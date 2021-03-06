/* XMLParseException.java
 *
 * $Revision: 1.1 $
 * $Date: 2002/08/03 04:05:32 $
 * $Name:  $
 *
 * This file is part of NanoXML 2 Lite.
 * Copyright (C) 2000-2002 Marc De Scheemaecker, All Rights Reserved.
 *
 * This software is provided 'as-is', without any express or implied warranty.
 * In no event will the authors be held liable for any damages arising from the
 * use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 *
 *  1. The origin of this software must not be misrepresented; you must not
 *     claim that you wrote the original software. If you use this software in
 *     a product, an acknowledgment in the product documentation would be
 *     appreciated but is not required.
 *
 *  2. Altered source versions must be plainly marked as such, and must not be
 *     misrepresented as being the original software.
 *
 *  3. This notice may not be removed or altered from any source distribution.
 *****************************************************************************/

package net.adoptopenjdk.icedteaweb.xmlparser;

/**
 * An XMLParseException is thrown when an error occurs while parsing an XML
 * string.
 * <p>
 * $Revision: 1.1 $</p>
 * <p>
 * $Date: 2002/08/03 04:05:32 $</p>
 *
 * @see XMLElement
 *
 * @author Marc De Scheemaecker
 * @version $Name:  $, $Revision: 1.1 $
 */
public class XMLParseException
        extends RuntimeException {

    /**
     * Creates an exception.
     *
     * @param name    The name of the element where the error is located.
     * @param lineNr  The number of the line in the input.
     * @param message A message describing what went wrong.
     *
     * <dl><dt><b>Preconditions:</b></dt><dd>
     * <ul><li>{@code message != null}</li>
     *     <li>{@code lineNr &gt; 0}</li>
     * </ul></dd></dl>
     *
     * <dl><dt><b>Postconditions:</b></dt><dd>
     * <ul><li>{@code getLineNr() => lineNr}</li>
     * </ul></dd></dl>
     */
    public XMLParseException(String name,
                             int lineNr,
                             String message) {
        super("XML Parse Exception during parsing of "
                + ((name == null) ? "the XML definition"
                                : ("a " + name + " element"))
                + " at line " + lineNr + ": " + message);
    }
}
