package defpackage;
/* compiled from: PG */
/* renamed from: duaq  reason: default package */
/* loaded from: classes.dex */
public final class duaq extends dsqw<duaq, duae> implements dssk {
    public static final duaq d;
    private static volatile dssr<duaq> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        duaq duaqVar = new duaq();
        d = duaqVar;
        dsqw.cc(duaq.class, duaqVar);
    }

    private duaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "c", duap.class, duag.class, duak.class, duai.class});
            }
            if (i2 == 3) {
                return new duaq();
            }
            if (i2 == 4) {
                return new duae();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duaq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duaq.class) {
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
