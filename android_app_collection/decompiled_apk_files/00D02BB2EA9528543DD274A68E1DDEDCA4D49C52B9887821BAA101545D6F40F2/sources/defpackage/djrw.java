package defpackage;
/* compiled from: PG */
/* renamed from: djrw  reason: default package */
/* loaded from: classes6.dex */
public final class djrw extends dsqw<djrw, djrv> implements dssk {
    public static final djrw a;
    private static volatile dssr<djrw> b;

    static {
        djrw djrwVar = new djrw();
        a = djrwVar;
        dsqw.cc(djrw.class, djrwVar);
    }

    private djrw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djrw();
            }
            if (i2 == 4) {
                return new djrv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djrw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djrw.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
