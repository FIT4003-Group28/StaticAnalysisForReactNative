package defpackage;
/* compiled from: PG */
/* renamed from: dxqw  reason: default package */
/* loaded from: classes6.dex */
public final class dxqw extends dsqw<dxqw, dxqv> implements dssk {
    public static final dxqw c;
    private static volatile dssr<dxqw> d;
    public int a;
    public long b;

    static {
        dxqw dxqwVar = new dxqw();
        c = dxqwVar;
        dsqw.cc(dxqw.class, dxqwVar);
    }

    private dxqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxqw();
            }
            if (i2 == 4) {
                return new dxqv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxqw.class) {
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
