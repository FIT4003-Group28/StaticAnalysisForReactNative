package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: eaog  reason: default package */
/* loaded from: classes6.dex */
public final class eaog implements eanb {
    static final String a;
    static final char[] b;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "\n";
        }
        a = str;
        char[] cArr = new char[64];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    @Override // defpackage.eanb
    public final void a(eams eamsVar, int i) {
        eamsVar.g(a);
        int i2 = i + i;
        while (i2 > 64) {
            char[] cArr = b;
            eamsVar.s(cArr, 64);
            int length = cArr.length;
            i2 -= 64;
        }
        eamsVar.s(b, i2);
    }
}
