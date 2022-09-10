package defpackage;
/* compiled from: PG */
/* renamed from: ckvz  reason: default package */
/* loaded from: classes4.dex */
public final class ckvz extends dsqw<ckvz, ckvy> implements dssk {
    public static final ckvz d;
    private static volatile dssr<ckvz> e;
    public int a;
    public double b;
    public double c;

    static {
        ckvz ckvzVar = new ckvz();
        d = ckvzVar;
        dsqw.cc(ckvz.class, ckvzVar);
    }

    private ckvz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ckvz();
            }
            if (i2 == 4) {
                return new ckvy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckvz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckvz.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
