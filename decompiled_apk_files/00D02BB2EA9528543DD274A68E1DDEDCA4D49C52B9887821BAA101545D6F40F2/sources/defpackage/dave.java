package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dave  reason: default package */
/* loaded from: classes5.dex */
public final class dave extends davh {
    private static final char[] a = {'+'};
    private static final char[] b = "0123456789ABCDEF".toCharArray();
    private final boolean c;
    private final boolean[] d;

    public dave(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            if (z && str.contains(" ")) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            if (str.contains("%")) {
                throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
            }
            this.c = z;
            char[] charArray = str.toCharArray();
            int i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
            for (char c : charArray) {
                i = Math.max((int) c, i);
            }
            boolean[] zArr = new boolean[i + 1];
            for (int i2 = 48; i2 <= 57; i2++) {
                zArr[i2] = true;
            }
            for (int i3 = 65; i3 <= 90; i3++) {
                zArr[i3] = true;
            }
            for (int i4 = 97; i4 <= 122; i4++) {
                zArr[i4] = true;
            }
            for (char c2 : charArray) {
                zArr[c2] = true;
            }
            this.d = zArr;
            return;
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    @Override // defpackage.davd
    public final String a(String str) {
        char[] cArr;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                int length2 = str.length();
                char[] cArr2 = davg.a.get();
                int i2 = 0;
                int i3 = 0;
                while (i < length2) {
                    if (i < length2) {
                        int i4 = i + 1;
                        char charAt2 = str.charAt(i);
                        int i5 = charAt2;
                        if (charAt2 >= 55296) {
                            i5 = charAt2;
                            if (charAt2 <= 57343) {
                                if (charAt2 > 56319) {
                                    StringBuilder sb = new StringBuilder(82);
                                    sb.append("Unexpected low surrogate character '");
                                    sb.append(charAt2);
                                    sb.append("' with value ");
                                    sb.append((int) charAt2);
                                    sb.append(" at index ");
                                    sb.append(i4 - 1);
                                    throw new IllegalArgumentException(sb.toString());
                                } else if (i4 == length2) {
                                    i5 = -charAt2;
                                } else {
                                    char charAt3 = str.charAt(i4);
                                    if (Character.isLowSurrogate(charAt3)) {
                                        i5 = Character.toCodePoint(charAt2, charAt3);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(83);
                                        sb2.append("Expected low surrogate but got char '");
                                        sb2.append(charAt3);
                                        sb2.append("' with value ");
                                        sb2.append((int) charAt3);
                                        sb2.append(" at index ");
                                        sb2.append(i4);
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                }
                            }
                        }
                        if (i5 >= 0) {
                            boolean[] zArr2 = this.d;
                            int i6 = 1;
                            if (i5 < zArr2.length && zArr2[i5]) {
                                cArr = null;
                            } else if (i5 == 32 && this.c) {
                                cArr = a;
                            } else if (i5 <= 127) {
                                char[] cArr3 = b;
                                cArr = new char[]{'%', cArr3[i5 >>> 4], cArr3[i5 & 15]};
                            } else if (i5 <= 2047) {
                                char[] cArr4 = b;
                                cArr = new char[]{'%', cArr4[(r11 >>> 4) | 12], cArr4[r11 & 15], '%', cArr4[(r11 & 3) | 8], cArr4[i5 & 15]};
                                int i7 = i5 >>> 4;
                                int i8 = i7 >>> 2;
                            } else if (i5 <= 65535) {
                                char[] cArr5 = b;
                                cArr = new char[]{'%', 'E', cArr5[r11 >>> 2], '%', cArr5[(r11 & 3) | 8], cArr5[r11 & 15], '%', cArr5[(r11 & 3) | 8], cArr5[i5 & 15]};
                                int i9 = i5 >>> 4;
                                int i10 = i9 >>> 2;
                                int i11 = i10 >>> 4;
                            } else if (i5 > 1114111) {
                                StringBuilder sb3 = new StringBuilder(43);
                                sb3.append("Invalid unicode character value ");
                                sb3.append(i5);
                                throw new IllegalArgumentException(sb3.toString());
                            } else {
                                char[] cArr6 = b;
                                cArr = new char[]{'%', 'F', cArr6[r10 >>> 2], '%', cArr6[(r10 & 3) | 8], cArr6[r10 & 15], '%', cArr6[(r10 & 3) | 8], cArr6[r10 & 15], '%', cArr6[(r10 & 3) | 8], cArr6[i5 & 15]};
                                int i12 = i5 >>> 4;
                                int i13 = i12 >>> 2;
                                int i14 = i13 >>> 4;
                                int i15 = i14 >>> 2;
                                int i16 = i15 >>> 4;
                            }
                            if (true == Character.isSupplementaryCodePoint(i5)) {
                                i6 = 2;
                            }
                            int i17 = i6 + i;
                            if (cArr != null) {
                                int i18 = i - i2;
                                int i19 = i3 + i18;
                                int length3 = cArr.length;
                                int i20 = i19 + length3;
                                if (cArr2.length < i20) {
                                    cArr2 = davh.b(cArr2, i3, ((i20 + length2) - i) + 32);
                                }
                                if (i18 > 0) {
                                    str.getChars(i2, i, cArr2, i3);
                                    i3 = i19;
                                }
                                System.arraycopy(cArr, 0, cArr2, i3, length3);
                                i3 += length3;
                                i2 = i17;
                            }
                            i = i17;
                            while (i < length2) {
                                char charAt4 = str.charAt(i);
                                boolean[] zArr3 = this.d;
                                if (charAt4 < zArr3.length && zArr3[charAt4]) {
                                    i++;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                    } else {
                        throw new IndexOutOfBoundsException("Index exceeds specified range");
                    }
                }
                int i21 = length2 - i2;
                if (i21 > 0) {
                    int i22 = i21 + i3;
                    if (cArr2.length < i22) {
                        cArr2 = davh.b(cArr2, i3, i22);
                    }
                    str.getChars(i2, length2, cArr2, i3);
                    i3 = i22;
                }
                return new String(cArr2, 0, i3);
            }
            i++;
        }
        return str;
    }
}
