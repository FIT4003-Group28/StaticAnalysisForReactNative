package defpackage;
/* compiled from: PG */
/* renamed from: dmfo  reason: default package */
/* loaded from: classes6.dex */
public final class dmfo extends dsqw<dmfo, dmfn> implements dssk {
    public static final dmfo d;
    public static final dsqv<dmfs, dmfo> e;
    private static volatile dssr<dmfo> g;
    public String a = "";
    public dmhp b;
    public boolean c;
    private int f;

    static {
        dmfo dmfoVar = new dmfo();
        d = dmfoVar;
        dsqw.cc(dmfo.class, dmfoVar);
        e = dsqw.newSingularGeneratedExtension(dmfs.c, dmfoVar, dmfoVar, null, 1026, dsur.MESSAGE, dmfo.class);
    }

    private dmfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"f", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmfo();
            }
            if (i2 == 4) {
                return new dmfn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmfo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
