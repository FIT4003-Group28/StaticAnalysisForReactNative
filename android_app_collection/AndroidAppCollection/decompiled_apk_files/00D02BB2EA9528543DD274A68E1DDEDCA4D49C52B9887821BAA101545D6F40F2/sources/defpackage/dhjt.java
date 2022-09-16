package defpackage;
/* compiled from: PG */
/* renamed from: dhjt  reason: default package */
/* loaded from: classes6.dex */
public final class dhjt extends dsqw<dhjt, dhjr> implements dssk {
    public static final dhjt d;
    private static volatile dssr<dhjt> e;
    public int a;
    public int b;
    public int c;

    static {
        dhjt dhjtVar = new dhjt();
        d = dhjtVar;
        dsqw.cc(dhjt.class, dhjtVar);
    }

    private dhjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0003\u0006\u0003\u0000\u0000\u0000\u0003\f\u0005\f\u0006\f", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhjt();
            }
            if (i2 == 4) {
                return new dhjr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhjt.class) {
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
