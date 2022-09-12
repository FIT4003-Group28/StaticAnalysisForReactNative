package defpackage;
/* compiled from: PG */
/* renamed from: devz  reason: default package */
/* loaded from: classes6.dex */
public final class devz extends dsqw<devz, devy> implements dssk {
    public static final devz d;
    public static final dsqv<dtro, devz> e;
    private static volatile dssr<devz> f;
    public int a;
    public long b;
    public dsrj<String> c = dssu.b;

    static {
        devz devzVar = new devz();
        d = devzVar;
        dsqw.cc(devz.class, devzVar);
        e = dsqw.newSingularGeneratedExtension(dtro.a, devzVar, devzVar, null, 182135729, dsur.MESSAGE, devz.class);
    }

    private devz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new devz();
            }
            if (i2 == 4) {
                return new devy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<devz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (devz.class) {
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
