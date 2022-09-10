package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: dqie  reason: default package */
/* loaded from: classes6.dex */
public final class dqie extends dsqw<dqie, dqib> implements dssk {
    public static final dqie d;
    private static volatile dssr<dqie> f;
    public int a = 0;
    public Object b;
    public dgly c;
    private int e;

    static {
        dqie dqieVar = new dqie();
        d = dqieVar;
        dsqw.cc(dqie.class, dqieVar);
    }

    private dqie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဿ\u0000\u0003ျ\u0000", new Object[]{"b", "a", "e", "c", dqic.a});
            }
            if (i2 == 3) {
                return new dqie();
            }
            if (i2 == 4) {
                return new dqib();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqie> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqie.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
