package defpackage;
/* compiled from: PG */
/* renamed from: dxko  reason: default package */
/* loaded from: classes6.dex */
public final class dxko extends dsqw<dxko, dxkn> implements dssk {
    public static final dxko f;
    private static volatile dssr<dxko> g;
    public int a;
    public String b = "";
    public dxna c;
    public String d;
    public dxmm e;

    static {
        dxko dxkoVar = new dxko();
        f = dxkoVar;
        dsqw.cc(dxko.class, dxkoVar);
    }

    private dxko() {
        dspd dspdVar = dspd.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0004\t\u0005Ȉ\u0006\t", new Object[]{"a", "b", "e", "d", "c"});
            }
            if (i2 == 3) {
                return new dxko();
            }
            if (i2 == 4) {
                return new dxkn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxko> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxko.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
