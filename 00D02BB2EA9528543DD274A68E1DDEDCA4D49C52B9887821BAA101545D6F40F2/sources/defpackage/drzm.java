package defpackage;
/* compiled from: PG */
/* renamed from: drzm  reason: default package */
/* loaded from: classes6.dex */
public final class drzm extends dsqw<drzm, drzl> implements dssk {
    public static final drzm e;
    private static volatile dssr<drzm> f;
    public int a;
    public String b = "";
    public dsay c;
    public dsai d;

    static {
        drzm drzmVar = new drzm();
        e = drzmVar;
        dsqw.cc(drzm.class, drzmVar);
    }

    private drzm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drzm();
            }
            if (i2 == 4) {
                return new drzl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drzm.class) {
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
