package defpackage;
/* compiled from: PG */
/* renamed from: dvor  reason: default package */
/* loaded from: classes6.dex */
public final class dvor extends dsqw<dvor, dvoo> implements dssk {
    public static final dvor e;
    private static volatile dssr<dvor> f;
    public int a;
    public dsrj<dvoq> b = dssu.b;
    public String c = "";
    public boolean d;

    static {
        dvor dvorVar = new dvor();
        e = dvorVar;
        dsqw.cc(dvor.class, dvorVar);
    }

    private dvor() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", dvoq.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dvor();
            }
            if (i2 == 4) {
                return new dvoo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvor> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvor.class) {
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
