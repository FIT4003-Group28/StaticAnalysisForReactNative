package defpackage;
/* compiled from: PG */
/* renamed from: dxri  reason: default package */
/* loaded from: classes6.dex */
public final class dxri extends dsqw<dxri, dxrh> implements dssk {
    public static final dxri d;
    private static volatile dssr<dxri> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxri dxriVar = new dxri();
        d = dxriVar;
        dsqw.cc(dxri.class, dxriVar);
    }

    private dxri() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000g<\u0000", new Object[]{"b", "a", "c", dxro.class, dxrs.class, dxqy.class});
            }
            if (i2 == 3) {
                return new dxri();
            }
            if (i2 == 4) {
                return new dxrh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxri> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxri.class) {
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
