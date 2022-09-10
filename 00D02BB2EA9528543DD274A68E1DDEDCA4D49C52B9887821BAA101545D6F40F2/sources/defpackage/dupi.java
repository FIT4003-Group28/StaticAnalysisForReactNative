package defpackage;
/* compiled from: PG */
/* renamed from: dupi  reason: default package */
/* loaded from: classes6.dex */
public final class dupi extends dsqw<dupi, duph> implements dssk {
    public static final dupi c;
    private static volatile dssr<dupi> d;
    public int a = 0;
    public Object b;

    static {
        dupi dupiVar = new dupi();
        c = dupiVar;
        dsqw.cc(dupi.class, dupiVar);
    }

    private dupi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000", new Object[]{"b", "a", dwpc.class});
            }
            if (i2 == 3) {
                return new dupi();
            }
            if (i2 == 4) {
                return new duph();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dupi.class) {
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
