package defpackage;
/* compiled from: PG */
/* renamed from: dkos  reason: default package */
/* loaded from: classes.dex */
public final class dkos extends dsqw<dkos, dkor> implements dssk {
    public static final dkos d;
    private static volatile dssr<dkos> f;
    public dsrj<dkoq> a = dssu.b;
    public dsrj<String> b = dssu.b;
    public boolean c;
    private int e;

    static {
        dkos dkosVar = new dkos();
        d = dkosVar;
        dsqw.cc(dkos.class, dkosVar);
    }

    private dkos() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001a\u0003ဇ\u0000", new Object[]{"e", "a", dkoq.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dkos();
            }
            if (i2 == 4) {
                return new dkor();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkos> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkos.class) {
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
