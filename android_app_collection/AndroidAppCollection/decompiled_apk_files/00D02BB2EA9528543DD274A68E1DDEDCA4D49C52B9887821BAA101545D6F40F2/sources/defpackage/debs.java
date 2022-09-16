package defpackage;
/* compiled from: PG */
/* renamed from: debs  reason: default package */
/* loaded from: classes6.dex */
public final class debs extends dcpx {
    private static final char[] a = {'+'};
    private static final char[] b = "0123456789ABCDEF".toCharArray();
    private final boolean c;
    private final boolean[] d;

    public debs(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            if (!z || !concat.contains(" ")) {
                this.c = z;
                char[] charArray = concat.toCharArray();
                int i = -1;
                for (char c : charArray) {
                    i = Math.max((int) c, i);
                }
                boolean[] zArr = new boolean[i + 1];
                for (char c2 : charArray) {
                    zArr[c2] = true;
                }
                this.d = zArr;
                return;
            }
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    @Override // defpackage.dcpx, defpackage.dcpn
    public final String a(String str) {
        dbsk.s(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return e(str, i);
            }
        }
        return str;
    }

    @Override // defpackage.dcpx
    protected final char[] b(int i) {
        boolean[] zArr = this.d;
        if (i >= zArr.length || !zArr[i]) {
            if (i == 32 && this.c) {
                return a;
            }
            if (i <= 127) {
                char[] cArr = b;
                return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
            } else if (i <= 2047) {
                char[] cArr2 = b;
                char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i & 15]};
                int i2 = i >>> 4;
                int i3 = i2 >>> 2;
                return cArr3;
            } else if (i <= 65535) {
                char[] cArr4 = b;
                char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i & 15]};
                int i4 = i >>> 4;
                int i5 = i4 >>> 2;
                int i6 = i5 >>> 4;
                return cArr5;
            } else if (i > 1114111) {
                StringBuilder sb = new StringBuilder(43);
                sb.append("Invalid unicode character value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else {
                char[] cArr6 = b;
                char[] cArr7 = {'%', 'F', cArr6[r14 >>> 2], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i & 15]};
                int i7 = i >>> 4;
                int i8 = i7 >>> 2;
                int i9 = i8 >>> 4;
                int i10 = i9 >>> 2;
                int i11 = i10 >>> 4;
                return cArr7;
            }
        }
        return null;
    }

    @Override // defpackage.dcpx
    protected final int c(CharSequence charSequence, int i, int i2) {
        dbsk.s(charSequence);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }
}
