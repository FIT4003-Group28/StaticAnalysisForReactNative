package defpackage;
/* compiled from: PG */
/* renamed from: dhzu  reason: default package */
/* loaded from: classes6.dex */
public final class dhzu extends dsqw<dhzu, dhzt> implements dssk {
    public static final dhzu b;
    private static volatile dssr<dhzu> c;
    public dsrj<dfzw> a = dssu.b;

    static {
        dhzu dhzuVar = new dhzu();
        b = dhzuVar;
        dsqw.cc(dhzu.class, dhzuVar);
    }

    private dhzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dfzw.class});
            }
            if (i2 == 3) {
                return new dhzu();
            }
            if (i2 == 4) {
                return new dhzt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhzu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhzu.class) {
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
