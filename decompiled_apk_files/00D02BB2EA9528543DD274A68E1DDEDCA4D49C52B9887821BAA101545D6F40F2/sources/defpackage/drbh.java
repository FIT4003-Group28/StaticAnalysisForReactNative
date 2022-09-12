package defpackage;
/* compiled from: PG */
/* renamed from: drbh  reason: default package */
/* loaded from: classes6.dex */
public final class drbh extends dsqw<drbh, drbc> implements dssk {
    public static final drbh g;
    private static volatile dssr<drbh> h;
    public int a;
    public int d;
    public drbg e;
    public String b = "";
    public String c = "";
    public dsrj<drbe> f = dssu.b;

    static {
        drbh drbhVar = new drbh();
        g = drbhVar;
        dsqw.cc(drbh.class, drbhVar);
    }

    private drbh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0003\u0003\u001b\u0004ဈ\u0001\u0005င\u0002", new Object[]{"a", "b", "e", "f", drbe.class, "c", "d"});
            }
            if (i2 == 3) {
                return new drbh();
            }
            if (i2 == 4) {
                return new drbc();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drbh.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
