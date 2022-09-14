package defpackage;
/* compiled from: PG */
/* renamed from: dmew  reason: default package */
/* loaded from: classes6.dex */
public final class dmew extends dsqw<dmew, dmev> implements dssk {
    public static final dmew b;
    public static final dsqv<dmfs, dmew> c;
    private static volatile dssr<dmew> d;
    public dsrj<dmdp> a = dssu.b;

    static {
        dmew dmewVar = new dmew();
        b = dmewVar;
        dsqw.cc(dmew.class, dmewVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmewVar, dmewVar, null, 1011, dsur.MESSAGE, dmew.class);
    }

    private dmew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmdp.class});
            }
            if (i2 == 3) {
                return new dmew();
            }
            if (i2 == 4) {
                return new dmev();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmew> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmew.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
