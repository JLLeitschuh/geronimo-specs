/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package javax.ccpp.uaprof;

/**
 * @version $Rev$ $Date$
 */
public class Dimension implements Comparable {

    private final int height;
    private final int width;


    public Dimension(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public Dimension(String str) throws NumberFormatException {
        String[] bits = str.split("x");
        if (bits.length != 2) {
            throw new NumberFormatException("can not parse as <width>x<height> string: " + str);
        }
        height = Integer.parseInt(bits[1]);
        width = Integer.parseInt(bits[0]);
    }

    public int compareTo(Object o) {
        return DimensionComparator.getInstance().compare(this, o);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimension dimension = (Dimension) o;

        if (height != dimension.height) return false;
        if (width != dimension.width) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return width + "x" + height;
    }
}
