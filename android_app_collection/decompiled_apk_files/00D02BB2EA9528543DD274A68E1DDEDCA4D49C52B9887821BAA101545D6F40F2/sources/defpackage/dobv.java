package defpackage;
/* compiled from: PG */
/* renamed from: dobv  reason: default package */
/* loaded from: classes6.dex */
public final class dobv extends dsqw<dobv, dobu> implements dssk {
    public static final dobv a;
    private static volatile dssr<dobv> d;
    private int b;
    private dgxn c;

    static {
        dobv dobvVar = new dobv();
        a = dobvVar;
        dsqw.cc(dobv.class, dobvVar);
    }

    private dobv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dobv();
            }
            if (i2 == 4) {
                return new dobu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dobv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
