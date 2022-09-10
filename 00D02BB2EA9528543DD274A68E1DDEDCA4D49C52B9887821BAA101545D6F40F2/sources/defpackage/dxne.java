package defpackage;
/* compiled from: PG */
/* renamed from: dxne  reason: default package */
/* loaded from: classes6.dex */
public final class dxne extends dsqw<dxne, dxnd> implements dssk {
    public static final dxne d;
    private static volatile dssr<dxne> e;
    public Object b;
    public int a = 0;
    public String c = "";

    static {
        dxne dxneVar = new dxne();
        d = dxneVar;
        dsqw.cc(dxne.class, dxneVar);
    }

    private dxne() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001=\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"b", "a", "c"});
            }
            if (i2 == 3) {
                return new dxne();
            }
            if (i2 == 4) {
                return new dxnd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxne> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxne.class) {
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
