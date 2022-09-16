package defpackage;
/* compiled from: PG */
/* renamed from: pae  reason: default package */
/* loaded from: classes4.dex */
public final class pae {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean b(int i, pct pctVar, boolean z) {
        if (pctVar.h() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new ouf(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (pctVar.h() == 118 && pctVar.h() == 111 && pctVar.h() == 114 && pctVar.h() == 98 && pctVar.h() == 105 && pctVar.h() == 115) {
            return true;
        } else {
            if (!z) {
                throw new ouf("expected characters 'vorbis'");
            }
            return false;
        }
    }
}
