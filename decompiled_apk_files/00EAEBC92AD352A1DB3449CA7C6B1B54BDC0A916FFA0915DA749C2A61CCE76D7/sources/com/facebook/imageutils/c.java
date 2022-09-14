package com.facebook.imageutils;

import c.d.d.d.i;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class c {
    public static int a(int i) {
        return e.a(i);
    }

    public static int a(InputStream inputStream) {
        try {
            int b2 = b(inputStream);
            if (b2 != 0) {
                return e.a(inputStream, b2);
            }
            return 0;
        } catch (IOException unused) {
            return 0;
        }
    }

    public static boolean a(InputStream inputStream, int i) {
        i.a(inputStream);
        while (d.a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = d.a(inputStream, 1, false);
            }
            if ((i == 192 && b(i2)) || i2 == i) {
                return true;
            }
            if (i2 != 216 && i2 != 1) {
                if (i2 == 217 || i2 == 218) {
                    break;
                }
                inputStream.skip(d.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    private static int b(InputStream inputStream) {
        int a2;
        if (a(inputStream, 225) && (a2 = d.a(inputStream, 2, false) - 2) > 6) {
            int a3 = d.a(inputStream, 4, false);
            int a4 = d.a(inputStream, 2, false);
            int i = (a2 - 4) - 2;
            if (a3 == 1165519206 && a4 == 0) {
                return i;
            }
        }
        return 0;
    }

    private static boolean b(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }
}
