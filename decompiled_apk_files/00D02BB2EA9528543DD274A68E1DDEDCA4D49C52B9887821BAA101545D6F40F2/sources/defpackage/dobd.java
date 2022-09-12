package defpackage;
/* compiled from: PG */
/* renamed from: dobd  reason: default package */
/* loaded from: classes6.dex */
public final class dobd extends dsqw<dobd, doba> implements dssk {
    public static final dobd d;
    private static volatile dssr<dobd> e;
    public int a;
    public boolean b;
    public dobc c;

    static {
        dobd dobdVar = new dobd();
        d = dobdVar;
        dsqw.cc(dobd.class, dobdVar);
    }

    private dobd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dobd();
            }
            if (i2 == 4) {
                return new doba();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dobd.class) {
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
