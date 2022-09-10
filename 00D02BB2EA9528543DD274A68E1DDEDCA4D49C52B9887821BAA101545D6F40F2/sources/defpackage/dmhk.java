package defpackage;
/* compiled from: PG */
/* renamed from: dmhk  reason: default package */
/* loaded from: classes6.dex */
public final class dmhk extends dsqw<dmhk, dmhj> implements dssk {
    public static final dmhk d;
    public static final dsqv<dmfs, dmhk> e;
    private static volatile dssr<dmhk> g;
    public String a = "";
    public dmhp b;
    public boolean c;
    private int f;

    static {
        dmhk dmhkVar = new dmhk();
        d = dmhkVar;
        dsqw.cc(dmhk.class, dmhkVar);
        e = dsqw.newSingularGeneratedExtension(dmfs.c, dmhkVar, dmhkVar, null, 1027, dsur.MESSAGE, dmhk.class);
    }

    private dmhk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"f", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmhk();
            }
            if (i2 == 4) {
                return new dmhj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmhk.class) {
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
