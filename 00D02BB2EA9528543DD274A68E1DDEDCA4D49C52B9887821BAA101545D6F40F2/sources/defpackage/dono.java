package defpackage;
/* compiled from: PG */
/* renamed from: dono  reason: default package */
/* loaded from: classes6.dex */
public final class dono extends dsqw<dono, donn> implements dssk {
    public static final dono b;
    private static volatile dssr<dono> c;
    public dsrj<dnwt> a = dssu.b;

    static {
        dono donoVar = new dono();
        b = donoVar;
        dsqw.cc(dono.class, donoVar);
    }

    private dono() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnwt.class});
            }
            if (i2 == 3) {
                return new dono();
            }
            if (i2 == 4) {
                return new donn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dono> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dono.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
