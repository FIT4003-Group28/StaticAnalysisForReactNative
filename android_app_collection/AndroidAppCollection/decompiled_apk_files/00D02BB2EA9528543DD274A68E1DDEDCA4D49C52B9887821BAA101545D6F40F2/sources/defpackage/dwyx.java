package defpackage;
/* compiled from: PG */
/* renamed from: dwyx  reason: default package */
/* loaded from: classes6.dex */
public final class dwyx extends dsqw<dwyx, dwyw> implements dssk {
    public static final dwyx b;
    private static volatile dssr<dwyx> c;
    public dsrj<dwyr> a = dssu.b;

    static {
        dwyx dwyxVar = new dwyx();
        b = dwyxVar;
        dsqw.cc(dwyx.class, dwyxVar);
    }

    private dwyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dwyr.class});
            }
            if (i2 == 3) {
                return new dwyx();
            }
            if (i2 == 4) {
                return new dwyw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwyx.class) {
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
