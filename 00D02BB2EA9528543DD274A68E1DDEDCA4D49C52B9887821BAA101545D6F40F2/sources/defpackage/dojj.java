package defpackage;
/* compiled from: PG */
/* renamed from: dojj  reason: default package */
/* loaded from: classes6.dex */
public final class dojj extends dsqw<dojj, dojh> implements dssk {
    public static final dojj d;
    private static volatile dssr<dojj> e;
    public int a;
    public int b;
    public drjs c;

    static {
        dojj dojjVar = new dojj();
        d = dojjVar;
        dsqw.cc(dojj.class, dojjVar);
    }

    private dojj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", doji.a, "c"});
            }
            if (i2 == 3) {
                return new dojj();
            }
            if (i2 == 4) {
                return new dojh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dojj.class) {
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
