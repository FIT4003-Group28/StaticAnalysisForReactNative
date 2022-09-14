package defpackage;
/* compiled from: PG */
/* renamed from: dxbt  reason: default package */
/* loaded from: classes6.dex */
public final class dxbt extends dsqw<dxbt, dxbs> implements dssk {
    public static final dxbt d;
    private static volatile dssr<dxbt> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dxbt dxbtVar = new dxbt();
        d = dxbtVar;
        dsqw.cc(dxbt.class, dxbtVar);
    }

    private dxbt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxbt();
            }
            if (i2 == 4) {
                return new dxbs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxbt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxbt.class) {
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
