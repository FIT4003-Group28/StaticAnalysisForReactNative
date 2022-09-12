package defpackage;
/* compiled from: PG */
/* renamed from: dxky  reason: default package */
/* loaded from: classes6.dex */
public final class dxky extends dsqw<dxky, dxkx> implements dssk {
    public static final dxky b;
    private static volatile dssr<dxky> c;
    public long a;

    static {
        dxky dxkyVar = new dxky();
        b = dxkyVar;
        dsqw.cc(dxky.class, dxkyVar);
    }

    private dxky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxky();
            }
            if (i2 == 4) {
                return new dxkx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxky> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxky.class) {
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
