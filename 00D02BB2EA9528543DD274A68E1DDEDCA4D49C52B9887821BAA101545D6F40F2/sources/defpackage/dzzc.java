package defpackage;
/* compiled from: PG */
/* renamed from: dzzc  reason: default package */
/* loaded from: classes.dex */
public final class dzzc extends dsqw<dzzc, dzzb> implements dssk {
    public static final dzzc c;
    public static final dsqv<dzze, dzzc> d;
    private static volatile dssr<dzzc> e;
    public int a;
    public eacm b;

    static {
        dzzc dzzcVar = new dzzc();
        c = dzzcVar;
        dsqw.cc(dzzc.class, dzzcVar);
        d = dsqw.newSingularGeneratedExtension(dzze.a, dzzcVar, dzzcVar, null, 2, dsur.MESSAGE, dzzc.class);
    }

    private dzzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dzzc();
            }
            if (i2 == 4) {
                return new dzzb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzzc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dzzc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
