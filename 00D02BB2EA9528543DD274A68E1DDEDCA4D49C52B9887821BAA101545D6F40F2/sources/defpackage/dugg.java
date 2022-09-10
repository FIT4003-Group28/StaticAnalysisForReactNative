package defpackage;
/* compiled from: PG */
/* renamed from: dugg  reason: default package */
/* loaded from: classes6.dex */
public final class dugg extends dsqw<dugg, dugf> implements dssk {
    public static final dugg c;
    private static volatile dssr<dugg> d;
    public int a = 0;
    public Object b;

    static {
        dugg duggVar = new dugg();
        c = duggVar;
        dsqw.cc(dugg.class, duggVar);
    }

    private dugg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002ြ\u0000", new Object[]{"b", "a", dufs.class});
            }
            if (i2 == 3) {
                return new dugg();
            }
            if (i2 == 4) {
                return new dugf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dugg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
