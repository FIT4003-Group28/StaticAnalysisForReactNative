package defpackage;
/* compiled from: PG */
/* renamed from: dkmu  reason: default package */
/* loaded from: classes6.dex */
public final class dkmu extends dsqw<dkmu, dkmr> implements dssk {
    public static final dkmu e;
    private static volatile dssr<dkmu> g;
    public boolean a;
    public boolean b;
    public dsrj<dkmt> c = dssu.b;
    public boolean d;
    private int f;

    static {
        dkmu dkmuVar = new dkmu();
        e = dkmuVar;
        dsqw.cc(dkmu.class, dkmuVar);
    }

    private dkmu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဇ\u0002\u0004ဇ\u0001", new Object[]{"f", "a", "c", dkmt.class, "d", "b"});
            }
            if (i2 == 3) {
                return new dkmu();
            }
            if (i2 == 4) {
                return new dkmr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkmu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
