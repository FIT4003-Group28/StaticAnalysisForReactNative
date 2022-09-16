package defpackage;
/* compiled from: PG */
/* renamed from: dmcl  reason: default package */
/* loaded from: classes6.dex */
public final class dmcl extends dsqw<dmcl, dmck> implements dssk {
    public static final dmcl c;
    public static final dsqv<dmch, dmcl> d;
    private static volatile dssr<dmcl> e;
    public int a;
    public dpoj b;

    static {
        dmcl dmclVar = new dmcl();
        c = dmclVar;
        dsqw.cc(dmcl.class, dmclVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmclVar, dmclVar, null, 1013, dsur.MESSAGE, dmcl.class);
    }

    private dmcl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmcl();
            }
            if (i2 == 4) {
                return new dmck();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmcl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmcl.class) {
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
