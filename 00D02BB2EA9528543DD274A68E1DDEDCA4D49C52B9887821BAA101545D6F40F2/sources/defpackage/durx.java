package defpackage;
/* compiled from: PG */
/* renamed from: durx  reason: default package */
/* loaded from: classes.dex */
public final class durx extends dsqw<durx, durw> implements dssk {
    public static final durx b;
    private static volatile dssr<durx> c;
    public dsrj<String> a = dssu.b;

    static {
        durx durxVar = new durx();
        b = durxVar;
        dsqw.cc(durx.class, durxVar);
    }

    private durx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new durx();
            }
            if (i2 == 4) {
                return new durw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<durx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (durx.class) {
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
