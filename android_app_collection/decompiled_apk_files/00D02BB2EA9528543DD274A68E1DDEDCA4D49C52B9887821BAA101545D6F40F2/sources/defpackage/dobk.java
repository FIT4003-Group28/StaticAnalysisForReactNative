package defpackage;
/* compiled from: PG */
/* renamed from: dobk  reason: default package */
/* loaded from: classes6.dex */
public final class dobk extends dsqw<dobk, dobh> implements dssk {
    public static final dobk d;
    private static volatile dssr<dobk> f;
    public int a = 0;
    public Object b;
    public int c;
    private int e;

    static {
        dobk dobkVar = new dobk();
        d = dobkVar;
        dsqw.cc(dobk.class, dobkVar);
    }

    private dobk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", "c", dobi.a, dczv.class});
            }
            if (i2 == 3) {
                return new dobk();
            }
            if (i2 == 4) {
                return new dobh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dobk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
