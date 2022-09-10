package defpackage;
/* compiled from: PG */
/* renamed from: dmdf  reason: default package */
/* loaded from: classes6.dex */
public final class dmdf extends dsqw<dmdf, dmde> implements dssk {
    public static final dmdf c;
    public static final dsqv<dmch, dmdf> d;
    private static volatile dssr<dmdf> e;
    public int a;
    public String b = "";

    static {
        dmdf dmdfVar = new dmdf();
        c = dmdfVar;
        dsqw.cc(dmdf.class, dmdfVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmdfVar, dmdfVar, null, 1011, dsur.MESSAGE, dmdf.class);
    }

    private dmdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmdf();
            }
            if (i2 == 4) {
                return new dmde();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmdf.class) {
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
