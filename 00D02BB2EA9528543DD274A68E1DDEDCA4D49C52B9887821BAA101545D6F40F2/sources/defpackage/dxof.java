package defpackage;
/* compiled from: PG */
/* renamed from: dxof  reason: default package */
/* loaded from: classes6.dex */
public final class dxof extends dsqw<dxof, dxoe> implements dssk {
    public static final dxof c;
    private static volatile dssr<dxof> d;
    public dxmo a;
    public int b;

    static {
        dxof dxofVar = new dxof();
        c = dxofVar;
        dsqw.cc(dxof.class, dxofVar);
    }

    private dxof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxof();
            }
            if (i2 == 4) {
                return new dxoe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxof> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxof.class) {
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
