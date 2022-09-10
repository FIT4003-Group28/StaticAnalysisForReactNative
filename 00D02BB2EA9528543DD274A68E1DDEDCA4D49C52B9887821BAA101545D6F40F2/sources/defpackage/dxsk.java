package defpackage;
/* compiled from: PG */
/* renamed from: dxsk  reason: default package */
/* loaded from: classes6.dex */
public final class dxsk extends dsqw<dxsk, dxsj> implements dssk {
    public static final dxsk b;
    private static volatile dssr<dxsk> c;
    public int a;

    static {
        dxsk dxskVar = new dxsk();
        b = dxskVar;
        dsqw.cc(dxsk.class, dxskVar);
    }

    private dxsk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxsk();
            }
            if (i2 == 4) {
                return new dxsj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsk.class) {
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
