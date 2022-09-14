package defpackage;
/* compiled from: PG */
/* renamed from: dyyf  reason: default package */
/* loaded from: classes6.dex */
final class dyyf {
    private static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] b = new String[64];
    private static final String[] c = new String[256];

    static {
        int i = 0;
        while (true) {
            String[] strArr = c;
            int length = strArr.length;
            if (i >= 256) {
                break;
            }
            strArr[i] = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
            i++;
        }
        String[] strArr2 = b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = b;
            strArr3[i3 | 8] = String.valueOf(strArr3[i3]).concat("|PADDED");
        }
        String[] strArr4 = b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        for (int i5 = 3; i4 < i5; i5 = 3) {
            int i6 = iArr2[i4];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                String[] strArr5 = b;
                String str = strArr5[i8];
                String str2 = strArr5[i6];
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb.append(str);
                sb.append('|');
                sb.append(str2);
                strArr5[i9] = sb.toString();
                String str3 = strArr5[i8];
                String str4 = strArr5[i6];
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 8 + String.valueOf(str4).length());
                sb2.append(str3);
                sb2.append('|');
                sb2.append(str4);
                sb2.append("|PADDED");
                strArr5[i9 | 8] = sb2.toString();
            }
            i4++;
        }
        int i10 = 0;
        while (true) {
            String[] strArr6 = b;
            int length2 = strArr6.length;
            if (i10 < 64) {
                if (strArr6[i10] == null) {
                    strArr6[i10] = c[i10];
                }
                i10++;
            } else {
                return;
            }
        }
    }

    dyyf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String[] strArr = a;
        int length = strArr.length;
        String format = b2 < 10 ? strArr[b2] : String.format("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : c[b3];
                } else if (b2 != 7 && b2 != 8) {
                    String[] strArr2 = b;
                    int length2 = strArr2.length;
                    String str4 = b3 < 64 ? strArr2[b3] : c[b3];
                    if (b2 == 5) {
                        if ((b3 & 4) != 0) {
                            str2 = "HEADERS";
                            str3 = "PUSH_PROMISE";
                            str = str4.replace(str2, str3);
                        }
                        str = str4;
                    } else {
                        if (b2 == 0 && (b3 & 32) != 0) {
                            str2 = "PRIORITY";
                            str3 = "COMPRESSED";
                            str = str4.replace(str2, str3);
                        }
                        str = str4;
                    }
                }
            }
            str = c[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = true != z ? ">>" : "<<";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = str;
        return String.format("%s 0x%08x %5d %-13s %s", objArr);
    }
}
