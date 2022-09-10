package defpackage;
/* compiled from: PG */
/* renamed from: dxjx  reason: default package */
/* loaded from: classes6.dex */
public final class dxjx extends dsqw<dxjx, dxjw> implements dssk {
    public static final dxjx c;
    private static volatile dssr<dxjx> d;
    public dxwi a;
    public dxmq b;

    static {
        dxjx dxjxVar = new dxjx();
        c = dxjxVar;
        dsqw.cc(dxjx.class, dxjxVar);
    }

    private dxjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxjx();
            }
            if (i2 == 4) {
                return new dxjw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxjx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxjx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
