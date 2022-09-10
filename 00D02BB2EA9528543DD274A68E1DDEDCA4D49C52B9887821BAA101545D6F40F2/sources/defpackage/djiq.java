package defpackage;
/* compiled from: PG */
/* renamed from: djiq  reason: default package */
/* loaded from: classes6.dex */
public final class djiq extends dsqw<djiq, djip> implements dssk {
    public static final djiq d;
    private static volatile dssr<djiq> f;
    public int a;
    public dsrj<djie> b = dssu.b;
    public djim c;
    private int e;

    static {
        djiq djiqVar = new djiq();
        d = djiqVar;
        dsqw.cc(djiq.class, djiqVar);
    }

    private djiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0001\u0004ဌ\u0000", new Object[]{"e", "b", djie.class, "c", "a", dqes.a});
            }
            if (i2 == 3) {
                return new djiq();
            }
            if (i2 == 4) {
                return new djip();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djiq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djiq.class) {
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
