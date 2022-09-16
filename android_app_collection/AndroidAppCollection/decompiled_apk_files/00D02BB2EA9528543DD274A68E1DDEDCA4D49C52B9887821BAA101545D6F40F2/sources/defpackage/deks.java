package defpackage;
/* compiled from: PG */
/* renamed from: deks  reason: default package */
/* loaded from: classes6.dex */
public final class deks extends dsqw<deks, dekr> implements dssk {
    public static final deks e;
    private static volatile dssr<deks> f;
    public int a;
    public long b;
    public long c;
    public long d;

    static {
        deks deksVar = new deks();
        e = deksVar;
        dsqw.cc(deks.class, deksVar);
    }

    private deks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new deks();
            }
            if (i2 == 4) {
                return new dekr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deks> dssrVar = f;
            if (dssrVar == null) {
                synchronized (deks.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
