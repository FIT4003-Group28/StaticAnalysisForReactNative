package defpackage;
/* compiled from: PG */
/* renamed from: dljm  reason: default package */
/* loaded from: classes6.dex */
public final class dljm extends dsqw<dljm, dljl> implements dssk {
    public static final dljm d;
    private static volatile dssr<dljm> e;
    public int a;
    public dspd b = dspd.b;
    public long c;

    static {
        dljm dljmVar = new dljm();
        d = dljmVar;
        dsqw.cc(dljm.class, dljmVar);
    }

    private dljm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dljm();
            }
            if (i2 == 4) {
                return new dljl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dljm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
