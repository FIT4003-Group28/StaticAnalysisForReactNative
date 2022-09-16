package defpackage;
/* compiled from: PG */
/* renamed from: dkmd  reason: default package */
/* loaded from: classes.dex */
public final class dkmd extends dsqw<dkmd, dkma> implements dssk {
    public static final dkmd c;
    private static volatile dssr<dkmd> e;
    public dkhd a;
    public int b;
    private int d;

    static {
        dkmd dkmdVar = new dkmd();
        c = dkmdVar;
        dsqw.cc(dkmd.class, dkmdVar);
    }

    private dkmd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dkmb.a});
            }
            if (i2 == 3) {
                return new dkmd();
            }
            if (i2 == 4) {
                return new dkma();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkmd.class) {
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
