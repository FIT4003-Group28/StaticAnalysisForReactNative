package defpackage;
/* compiled from: PG */
/* renamed from: dgnj  reason: default package */
/* loaded from: classes6.dex */
public final class dgnj extends dsqw<dgnj, dgni> implements dssk {
    public static final dgnj a;
    private static volatile dssr<dgnj> b;

    static {
        dgnj dgnjVar = new dgnj();
        a = dgnjVar;
        dsqw.cc(dgnj.class, dgnjVar);
    }

    private dgnj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgnj();
            }
            if (i2 == 4) {
                return new dgni();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgnj.class) {
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
