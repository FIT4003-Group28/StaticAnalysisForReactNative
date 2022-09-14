package defpackage;
/* compiled from: PG */
/* renamed from: dmix  reason: default package */
/* loaded from: classes6.dex */
public final class dmix extends dsqw<dmix, dmiw> implements dssk {
    public static final dmix c;
    public static final dsqv<dmfs, dmix> d;
    private static volatile dssr<dmix> e;
    public int a;
    public String b = "";

    static {
        dmix dmixVar = new dmix();
        c = dmixVar;
        dsqw.cc(dmix.class, dmixVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmixVar, dmixVar, null, 1035, dsur.MESSAGE, dmix.class);
    }

    private dmix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmix();
            }
            if (i2 == 4) {
                return new dmiw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmix> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmix.class) {
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
