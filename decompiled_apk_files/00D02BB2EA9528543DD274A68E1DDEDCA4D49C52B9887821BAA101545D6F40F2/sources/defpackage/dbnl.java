package defpackage;
/* compiled from: PG */
/* renamed from: dbnl  reason: default package */
/* loaded from: classes5.dex */
public final class dbnl extends dsqw<dbnl, dbnk> implements dssk {
    public static final dbnl a;
    private static volatile dssr<dbnl> b;

    static {
        dbnl dbnlVar = new dbnl();
        a = dbnlVar;
        dsqw.cc(dbnl.class, dbnlVar);
    }

    private dbnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbnl();
            }
            if (i2 == 4) {
                return new dbnk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbnl.class) {
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
