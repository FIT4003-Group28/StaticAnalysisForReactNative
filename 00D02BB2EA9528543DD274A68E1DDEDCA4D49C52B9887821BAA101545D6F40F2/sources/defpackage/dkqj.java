package defpackage;
/* compiled from: PG */
/* renamed from: dkqj  reason: default package */
/* loaded from: classes6.dex */
public final class dkqj extends dsqw<dkqj, dkqg> implements dssk {
    public static final dkqj c;
    private static volatile dssr<dkqj> e;
    public int a;
    public boolean b;
    private int d;

    static {
        dkqj dkqjVar = new dkqj();
        c = dkqjVar;
        dsqw.cc(dkqj.class, dkqjVar);
    }

    private dkqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", dkqh.a, "b"});
            }
            if (i2 == 3) {
                return new dkqj();
            }
            if (i2 == 4) {
                return new dkqg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkqj.class) {
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
