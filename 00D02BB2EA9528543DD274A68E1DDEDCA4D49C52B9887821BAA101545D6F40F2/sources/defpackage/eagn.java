package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eagn  reason: default package */
/* loaded from: classes6.dex */
public final class eagn {
    static final eajc a = eajc.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] b = new String[64];
    static final String[] c = new String[256];

    static {
        int i;
        String[] strArr;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = c;
            int length = strArr2.length;
            if (i3 >= 256) {
                break;
            }
            strArr2[i3] = eafa.v("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr3 = b;
        strArr3[0] = "";
        strArr3[1] = "END_STREAM";
        int[] iArr = {1};
        strArr3[8] = "PADDED";
        for (int i4 = 0; i4 <= 0; i4++) {
            int i5 = iArr[i4];
            b[i5 | 8] = strArr[i5] + "|PADDED";
        }
        String[] strArr4 = b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 <= 0; i8++) {
                int i9 = iArr[i8] | i7;
                String[] strArr5 = b;
                strArr5[i9] = strArr5[i] + '|' + strArr5[i7];
                strArr5[i9 | 8] = strArr5[i] + '|' + strArr5[i7] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = b;
            int length2 = strArr6.length;
            if (i2 < 64) {
                if (strArr6[i2] == null) {
                    strArr6[i2] = c[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private eagn() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(eafa.v(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException b(String str, Object... objArr) {
        throw new IOException(eafa.v(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String[] strArr = d;
        int length = strArr.length;
        String v = b2 < 10 ? strArr[b2] : eafa.v("0x%02x", Byte.valueOf(b2));
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
        objArr[3] = v;
        objArr[4] = str;
        return eafa.v("%s 0x%08x %5d %-13s %s", objArr);
    }
}
