package defpackage;
/* compiled from: PG */
/* renamed from: dlaf  reason: default package */
/* loaded from: classes6.dex */
public final class dlaf extends dsqw<dlaf, dlae> implements dssk {
    public static final dlaf b;
    private static volatile dssr<dlaf> c;
    public dsrj<dlad> a = dssu.b;

    static {
        dlaf dlafVar = new dlaf();
        b = dlafVar;
        dsqw.cc(dlaf.class, dlafVar);
    }

    private dlaf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlad.class});
            }
            if (i2 == 3) {
                return new dlaf();
            }
            if (i2 == 4) {
                return new dlae();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlaf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlaf.class) {
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
