package defpackage;
/* compiled from: PG */
/* renamed from: dxku  reason: default package */
/* loaded from: classes6.dex */
public final class dxku extends dsqw<dxku, dxkt> implements dssk {
    public static final dxku d;
    private static volatile dssr<dxku> e;
    public dxmq a;
    public dsrj<dxks> b = dssu.b;
    public dxkw c;

    static {
        dxku dxkuVar = new dxku();
        d = dxkuVar;
        dsqw.cc(dxku.class, dxkuVar);
    }

    private dxku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\t", new Object[]{"a", "b", dxks.class, "c"});
            }
            if (i2 == 3) {
                return new dxku();
            }
            if (i2 == 4) {
                return new dxkt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxku> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxku.class) {
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
