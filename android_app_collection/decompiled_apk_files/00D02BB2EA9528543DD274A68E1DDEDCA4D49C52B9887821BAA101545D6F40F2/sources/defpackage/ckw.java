package defpackage;
/* compiled from: PG */
/* renamed from: ckw  reason: default package */
/* loaded from: classes4.dex */
public final class ckw extends dsqw<ckw, ckv> implements dssk {
    public static final ckw a;
    private static volatile dssr<ckw> c;
    private dstq b;

    static {
        ckw ckwVar = new ckw();
        a = ckwVar;
        dsqw.cc(ckw.class, ckwVar);
    }

    private ckw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"b"});
            }
            if (i2 == 3) {
                return new ckw();
            }
            if (i2 == 4) {
                return new ckv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ckw.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
