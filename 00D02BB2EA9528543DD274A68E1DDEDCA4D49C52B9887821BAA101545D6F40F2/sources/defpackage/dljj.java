package defpackage;
/* compiled from: PG */
/* renamed from: dljj  reason: default package */
/* loaded from: classes6.dex */
public final class dljj extends dsqw<dljj, dljg> implements dssk {
    public static final dljj b;
    private static volatile dssr<dljj> c;
    public dsrj<dlji> a = dssu.b;

    static {
        dljj dljjVar = new dljj();
        b = dljjVar;
        dsqw.cc(dljj.class, dljjVar);
    }

    private dljj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlji.class});
            }
            if (i2 == 3) {
                return new dljj();
            }
            if (i2 == 4) {
                return new dljg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dljj.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
