package defpackage;
/* compiled from: PG */
/* renamed from: ckl  reason: default package */
/* loaded from: classes4.dex */
public final class ckl extends dsqw<ckl, cki> implements dssk {
    public static final ckl d;
    private static volatile dssr<ckl> e;
    public int a;
    public int b;
    public String c = "";

    static {
        ckl cklVar = new ckl();
        d = cklVar;
        dsqw.cc(ckl.class, cklVar);
    }

    private ckl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", ckj.a, "c"});
            }
            if (i2 == 3) {
                return new ckl();
            }
            if (i2 == 4) {
                return new cki();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckl.class) {
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
