package defpackage;

import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcpt  reason: default package */
/* loaded from: classes.dex */
final class dcpt extends dcpi {
    public dcpt(Map<Character, String> map) {
        super(map);
    }

    private static final char[] f(int i) {
        char[] cArr = new char[10];
        cArr[9] = '}';
        int i2 = 8;
        while (i != 0 && i2 > 2) {
            cArr[i2] = dcpw.a[i & 15];
            i >>>= 4;
            i2--;
        }
        int i3 = i2 - 1;
        cArr[i2] = '{';
        int i4 = i3 - 1;
        cArr[i3] = 'u';
        cArr[i4] = '\\';
        return i4 == 0 ? cArr : Arrays.copyOfRange(cArr, i4, 10);
    }

    @Override // defpackage.dcpi
    protected final char[] d(int i) {
        if (i < 256) {
            return dcpw.b((char) i);
        }
        if (i < 4096) {
            return f(i);
        }
        if (i < 65536) {
            return dcpw.a((char) i);
        }
        return f(i);
    }
}
