package defpackage;
/* compiled from: PG */
/* renamed from: dogi  reason: default package */
/* loaded from: classes6.dex */
public final class dogi extends dsqw<dogi, dogd> implements dssk {
    public static final dogi b;
    private static volatile dssr<dogi> c;
    public dsrj<dogh> a = dssu.b;

    static {
        dogi dogiVar = new dogi();
        b = dogiVar;
        dsqw.cc(dogi.class, dogiVar);
    }

    private dogi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", dogh.class});
            }
            if (i2 == 3) {
                return new dogi();
            }
            if (i2 == 4) {
                return new dogd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dogi.class) {
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
