package defpackage;
/* compiled from: PG */
/* renamed from: dfuw  reason: default package */
/* loaded from: classes6.dex */
public final class dfuw extends dsqw<dfuw, dfuu> implements dssk {
    public static final dfuw b;
    private static volatile dssr<dfuw> c;
    public int a;

    static {
        dfuw dfuwVar = new dfuw();
        b = dfuwVar;
        dsqw.cc(dfuw.class, dfuwVar);
    }

    private dfuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dfuw();
            }
            if (i2 == 4) {
                return new dfuu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfuw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dfuw.class) {
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
