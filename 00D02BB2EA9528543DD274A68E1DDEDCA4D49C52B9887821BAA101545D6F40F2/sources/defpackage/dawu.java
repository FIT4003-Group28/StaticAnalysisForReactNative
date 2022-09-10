package defpackage;
/* compiled from: PG */
/* renamed from: dawu  reason: default package */
/* loaded from: classes5.dex */
public final class dawu extends dsqw<dawu, dawt> implements dssk {
    public static final dawu c;
    private static volatile dssr<dawu> d;
    public int a;
    public daxa b;

    static {
        dawu dawuVar = new dawu();
        c = dawuVar;
        dsqw.cc(dawu.class, dawuVar);
    }

    private dawu() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dawu();
            }
            if (i2 == 4) {
                return new dawt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dawu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dawu.class) {
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
