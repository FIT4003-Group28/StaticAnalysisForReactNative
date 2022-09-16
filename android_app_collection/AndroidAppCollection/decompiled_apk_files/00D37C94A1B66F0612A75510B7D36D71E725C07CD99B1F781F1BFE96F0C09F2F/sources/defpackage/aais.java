package defpackage;

import android.content.ContentValues;
import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: aais  reason: default package */
/* loaded from: classes.dex */
public final class aais {
    public static void a(vou vouVar, String str) {
        for (int i = 0; i < str.length(); i++) {
            Character valueOf = Character.valueOf(str.charAt(i));
            char charValue = valueOf.charValue();
            if (charValue == '_') {
                vouVar.b("_");
            } else {
                switch (charValue) {
                    case '0':
                        vouVar.b("0");
                        continue;
                    case '1':
                        vouVar.b("1");
                        continue;
                    case '2':
                        vouVar.b("2");
                        continue;
                    case '3':
                        vouVar.b("3");
                        continue;
                    case '4':
                        vouVar.b("4");
                        continue;
                    case '5':
                        vouVar.b("5");
                        continue;
                    case '6':
                        vouVar.b("6");
                        continue;
                    case '7':
                        vouVar.b("7");
                        continue;
                    case '8':
                        vouVar.b("8");
                        continue;
                    case '9':
                        vouVar.b("9");
                        continue;
                    default:
                        switch (charValue) {
                            case 'A':
                                vouVar.b("A");
                                continue;
                            case 'B':
                                vouVar.b("B");
                                continue;
                            case 'C':
                                vouVar.b("C");
                                continue;
                            case 'D':
                                vouVar.b("D");
                                continue;
                            case 'E':
                                vouVar.b("E");
                                continue;
                            case 'F':
                                vouVar.b("F");
                                continue;
                            case 'G':
                                vouVar.b("G");
                                continue;
                            case 'H':
                                vouVar.b("H");
                                continue;
                            case 'I':
                                vouVar.b("I");
                                continue;
                            case 'J':
                                vouVar.b("J");
                                continue;
                            case 'K':
                                vouVar.b("K");
                                continue;
                            case 'L':
                                vouVar.b("L");
                                continue;
                            case 'M':
                                vouVar.b("M");
                                continue;
                            case 'N':
                                vouVar.b("N");
                                continue;
                            case 'O':
                                vouVar.b("O");
                                continue;
                            case 'P':
                                vouVar.b("P");
                                continue;
                            case 'Q':
                                vouVar.b("Q");
                                continue;
                            case 'R':
                                vouVar.b("R");
                                continue;
                            case 'S':
                                vouVar.b("S");
                                continue;
                            case 'T':
                                vouVar.b("T");
                                continue;
                            case 'U':
                                vouVar.b("U");
                                continue;
                            case 'V':
                                vouVar.b("V");
                                continue;
                            case 'W':
                                vouVar.b("W");
                                continue;
                            case 'X':
                                vouVar.b("X");
                                continue;
                            case 'Y':
                                vouVar.b("Y");
                                continue;
                            case 'Z':
                                vouVar.b("Z");
                                continue;
                            default:
                                switch (charValue) {
                                    case 'a':
                                        vouVar.b("a");
                                        continue;
                                    case 'b':
                                        vouVar.b("b");
                                        continue;
                                    case 'c':
                                        vouVar.b("c");
                                        continue;
                                    case 'd':
                                        vouVar.b("d");
                                        continue;
                                    case 'e':
                                        vouVar.b("e");
                                        continue;
                                    case 'f':
                                        vouVar.b("f");
                                        continue;
                                    case 'g':
                                        vouVar.b("g");
                                        continue;
                                    case 'h':
                                        vouVar.b("h");
                                        continue;
                                    case 'i':
                                        vouVar.b("i");
                                        continue;
                                    case 'j':
                                        vouVar.b("j");
                                        continue;
                                    case 'k':
                                        vouVar.b("k");
                                        continue;
                                    case 'l':
                                        vouVar.b("l");
                                        continue;
                                    case 'm':
                                        vouVar.b("m");
                                        continue;
                                    case 'n':
                                        vouVar.b("n");
                                        continue;
                                    case 'o':
                                        vouVar.b("o");
                                        continue;
                                    case 'p':
                                        vouVar.b("p");
                                        continue;
                                    case 'q':
                                        vouVar.b("q");
                                        continue;
                                    case 'r':
                                        vouVar.b("r");
                                        continue;
                                    case 's':
                                        vouVar.b("s");
                                        continue;
                                    case 't':
                                        vouVar.b("t");
                                        continue;
                                    case 'u':
                                        vouVar.b("u");
                                        continue;
                                    case 'v':
                                        vouVar.b("v");
                                        continue;
                                    case 'w':
                                        vouVar.b("w");
                                        continue;
                                    case 'x':
                                        vouVar.b("x");
                                        continue;
                                    case 'y':
                                        vouVar.b("y");
                                        continue;
                                    case 'z':
                                        vouVar.b("z");
                                        continue;
                                        continue;
                                        continue;
                                    default:
                                        String valueOf2 = String.valueOf(valueOf);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                                        sb.append("Unhandled table name char:");
                                        sb.append(valueOf2);
                                        throw new IllegalStateException(sb.toString());
                                }
                        }
                }
            }
        }
    }

    public static void b(vox voxVar, aajj aajjVar) {
        amzs it = aajjVar.a().iterator();
        while (it.hasNext()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("parent_entity_key", aajjVar.d());
            contentValues.put("child_entity_key", (String) it.next());
            voxVar.f("entity_associations", contentValues);
        }
    }

    public static float c(long j) {
        return ((float) j) / 1.0E9f;
    }

    public static long d(float f) {
        return f * 1.0E9f;
    }

    public static void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(str.length() + 30 + String.valueOf(hexString).length());
        sb.append("GL Operation '");
        sb.append(str);
        sb.append("' caused error ");
        sb.append(hexString);
        sb.append("!");
        throw new RuntimeException(sb.toString());
    }
}
