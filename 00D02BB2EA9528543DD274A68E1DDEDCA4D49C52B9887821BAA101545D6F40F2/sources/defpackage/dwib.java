package defpackage;
/* compiled from: PG */
/* renamed from: dwib  reason: default package */
/* loaded from: classes6.dex */
public final class dwib extends dsqw<dwib, dwia> implements dssk {
    public static final dwib b;
    private static volatile dssr<dwib> d;
    public String a = "";
    private int c;

    static {
        dwib dwibVar = new dwib();
        b = dwibVar;
        dsqw.cc(dwib.class, dwibVar);
    }

    private dwib() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwib();
            }
            if (i2 == 4) {
                return new dwia();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwib> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwib.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
