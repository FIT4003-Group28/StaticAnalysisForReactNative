package defpackage;
/* compiled from: PG */
/* renamed from: dxrw  reason: default package */
/* loaded from: classes6.dex */
public final class dxrw extends dsqw<dxrw, dxrv> implements dssk {
    public static final dxrw d;
    private static volatile dssr<dxrw> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxrw dxrwVar = new dxrw();
        d = dxrwVar;
        dsqw.cc(dxrw.class, dxrwVar);
    }

    private dxrw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0001\u0000\u0001f\u0003\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000", new Object[]{"b", "a", "c", dxrq.class, dxry.class});
            }
            if (i2 == 3) {
                return new dxrw();
            }
            if (i2 == 4) {
                return new dxrv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxrw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxrw.class) {
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
