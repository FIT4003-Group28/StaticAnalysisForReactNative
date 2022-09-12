package defpackage;
/* compiled from: PG */
/* renamed from: dcpj  reason: default package */
/* loaded from: classes.dex */
public abstract class dcpj extends dcpn {
    private static char[] c(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    @Override // defpackage.dcpn
    public String a(String str) {
        dbsk.s(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (b(str.charAt(i)) != null) {
                return d(str, i);
            }
        }
        return str;
    }

    protected abstract char[] b(char c);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str, int i) {
        int length = str.length();
        char[] a = dcpp.a();
        int length2 = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] b = b(str.charAt(i));
            if (b != null) {
                int length3 = b.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    int i7 = length - i;
                    length2 = i7 + i7 + i6;
                    a = c(a, i3, length2);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, a, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(b, 0, a, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i8 + i3;
            if (length2 < i9) {
                a = c(a, i3, i9);
            }
            str.getChars(i2, length, a, i3);
            i3 = i9;
        }
        return new String(a, 0, i3);
    }
}
