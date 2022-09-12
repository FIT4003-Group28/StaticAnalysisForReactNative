package defpackage;
/* compiled from: PG */
/* renamed from: dnnq  reason: default package */
/* loaded from: classes.dex */
public final class dnnq extends dsqw<dnnq, dnnp> implements dssk {
    public static final dnnq c;
    private static volatile dssr<dnnq> e;
    public String a = "";
    public boolean b;
    private int d;

    static {
        dnnq dnnqVar = new dnnq();
        c = dnnqVar;
        dsqw.cc(dnnq.class, dnnqVar);
    }

    private dnnq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnnq();
            }
            if (i2 == 4) {
                return new dnnp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnnq.class) {
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
