package defpackage;
/* compiled from: PG */
/* renamed from: dxmu  reason: default package */
/* loaded from: classes6.dex */
public final class dxmu extends dsqw<dxmu, dxmt> implements dssk {
    public static final dxmu b;
    private static volatile dssr<dxmu> c;
    public dsri a = dsrx.b;

    static {
        dxmu dxmuVar = new dxmu();
        b = dxmuVar;
        dsqw.cc(dxmu.class, dxmuVar);
    }

    private dxmu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxmu();
            }
            if (i2 == 4) {
                return new dxmt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxmu.class) {
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
