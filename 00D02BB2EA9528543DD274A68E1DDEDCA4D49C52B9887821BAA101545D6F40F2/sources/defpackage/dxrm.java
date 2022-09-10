package defpackage;
/* compiled from: PG */
/* renamed from: dxrm  reason: default package */
/* loaded from: classes6.dex */
public final class dxrm extends dsqw<dxrm, dxrl> implements dssk {
    public static final dxrm d;
    private static volatile dssr<dxrm> e;
    public dsrj<dxrk> a = dssu.b;
    public int b;
    public int c;

    static {
        dxrm dxrmVar = new dxrm();
        d = dxrmVar;
        dsqw.cc(dxrm.class, dxrmVar);
    }

    private dxrm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f", new Object[]{"a", dxrk.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dxrm();
            }
            if (i2 == 4) {
                return new dxrl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxrm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxrm.class) {
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
