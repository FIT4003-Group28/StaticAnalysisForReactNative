package defpackage;
/* compiled from: PG */
/* renamed from: dxmo  reason: default package */
/* loaded from: classes6.dex */
public final class dxmo extends dsqw<dxmo, dxmn> implements dssk {
    public static final dxmo b;
    private static volatile dssr<dxmo> c;
    public int a;

    static {
        dxmo dxmoVar = new dxmo();
        b = dxmoVar;
        dsqw.cc(dxmo.class, dxmoVar);
    }

    private dxmo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxmo();
            }
            if (i2 == 4) {
                return new dxmn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxmo.class) {
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
