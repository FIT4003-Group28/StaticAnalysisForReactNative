package defpackage;
/* compiled from: PG */
/* renamed from: dxkw  reason: default package */
/* loaded from: classes6.dex */
public final class dxkw extends dsqw<dxkw, dxkv> implements dssk {
    public static final dxkw b;
    private static volatile dssr<dxkw> c;
    public dsrj<dxla> a = dssu.b;

    static {
        dxkw dxkwVar = new dxkw();
        b = dxkwVar;
        dsqw.cc(dxkw.class, dxkwVar);
    }

    private dxkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dxla.class});
            }
            if (i2 == 3) {
                return new dxkw();
            }
            if (i2 == 4) {
                return new dxkv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxkw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxkw.class) {
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
