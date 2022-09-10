package defpackage;
/* compiled from: PG */
/* renamed from: dmcn  reason: default package */
/* loaded from: classes6.dex */
public final class dmcn extends dsqw<dmcn, dmcm> implements dssk {
    public static final dmcn d;
    public static final dsqv<dmch, dmcn> e;
    private static volatile dssr<dmcn> f;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dmcn dmcnVar = new dmcn();
        d = dmcnVar;
        dsqw.cc(dmcn.class, dmcnVar);
        e = dsqw.newSingularGeneratedExtension(dmch.d, dmcnVar, dmcnVar, null, 1006, dsur.MESSAGE, dmcn.class);
    }

    private dmcn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmcn();
            }
            if (i2 == 4) {
                return new dmcm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmcn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmcn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
