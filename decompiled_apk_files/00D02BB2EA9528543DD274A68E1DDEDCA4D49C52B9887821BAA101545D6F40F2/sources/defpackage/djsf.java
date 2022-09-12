package defpackage;
/* compiled from: PG */
/* renamed from: djsf  reason: default package */
/* loaded from: classes6.dex */
public final class djsf extends dsqw<djsf, djse> implements dssk {
    public static final djsf c;
    private static volatile dssr<djsf> e;
    public djsj a;
    public djsj b;
    private int d;

    static {
        djsf djsfVar = new djsf();
        c = djsfVar;
        dsqw.cc(djsf.class, djsfVar);
    }

    private djsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djsf();
            }
            if (i2 == 4) {
                return new djse();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djsf.class) {
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
