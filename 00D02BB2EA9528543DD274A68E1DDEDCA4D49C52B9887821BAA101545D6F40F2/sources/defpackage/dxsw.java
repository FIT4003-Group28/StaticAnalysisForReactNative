package defpackage;
/* compiled from: PG */
/* renamed from: dxsw  reason: default package */
/* loaded from: classes6.dex */
public final class dxsw extends dsqw<dxsw, dxsv> implements dssk {
    public static final dxsw b;
    private static volatile dssr<dxsw> c;
    public int a;

    static {
        dxsw dxswVar = new dxsw();
        b = dxswVar;
        dsqw.cc(dxsw.class, dxswVar);
    }

    private dxsw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxsw();
            }
            if (i2 == 4) {
                return new dxsv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsw.class) {
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
