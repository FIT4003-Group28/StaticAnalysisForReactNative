package defpackage;
/* compiled from: PG */
/* renamed from: dscz  reason: default package */
/* loaded from: classes6.dex */
public final class dscz extends dsqw<dscz, dscy> implements dssk {
    public static final dscz a;
    private static volatile dssr<dscz> b;

    static {
        dscz dsczVar = new dscz();
        a = dsczVar;
        dsqw.cc(dscz.class, dsczVar);
    }

    private dscz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dscz();
            }
            if (i2 == 4) {
                return new dscy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dscz.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
