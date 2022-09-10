package defpackage;
/* compiled from: PG */
/* renamed from: dngc  reason: default package */
/* loaded from: classes6.dex */
public final class dngc extends dsqw<dngc, dnfz> implements dssk {
    public static final dngc c;
    private static volatile dssr<dngc> e;
    public int a;
    public int b;
    private int d;

    static {
        dngc dngcVar = new dngc();
        c = dngcVar;
        dsqw.cc(dngc.class, dngcVar);
    }

    private dngc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002", new Object[]{"d", "a", dnfx.a, "b", dnga.a});
            }
            if (i2 == 3) {
                return new dngc();
            }
            if (i2 == 4) {
                return new dnfz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dngc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
