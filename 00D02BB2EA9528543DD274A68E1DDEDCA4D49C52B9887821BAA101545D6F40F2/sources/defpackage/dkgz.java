package defpackage;
/* compiled from: PG */
/* renamed from: dkgz  reason: default package */
/* loaded from: classes6.dex */
public final class dkgz extends dsqw<dkgz, dkgy> implements dssk {
    public static final dkgz d;
    private static volatile dssr<dkgz> f;
    public boolean a;
    public int b = 50;
    public boolean c;
    private int e;

    static {
        dkgz dkgzVar = new dkgz();
        d = dkgzVar;
        dsqw.cc(dkgz.class, dkgzVar);
    }

    private dkgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkgz();
            }
            if (i2 == 4) {
                return new dkgy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkgz.class) {
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
