package defpackage;
/* compiled from: PG */
/* renamed from: dtwa  reason: default package */
/* loaded from: classes6.dex */
public final class dtwa extends dsqw<dtwa, dtvz> implements dssk {
    public static final dtwa c;
    private static volatile dssr<dtwa> d;
    public dtsk a;
    public int b;

    static {
        dtwa dtwaVar = new dtwa();
        c = dtwaVar;
        dsqw.cc(dtwa.class, dtwaVar);
    }

    private dtwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtwa();
            }
            if (i2 == 4) {
                return new dtvz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtwa.class) {
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
