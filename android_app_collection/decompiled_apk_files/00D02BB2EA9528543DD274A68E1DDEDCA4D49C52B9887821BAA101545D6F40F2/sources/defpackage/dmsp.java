package defpackage;
/* compiled from: PG */
/* renamed from: dmsp  reason: default package */
/* loaded from: classes.dex */
public final class dmsp extends dsqw<dmsp, dmso> implements dssk {
    public static final dmsp c;
    private static volatile dssr<dmsp> d;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;

    static {
        dmsp dmspVar = new dmsp();
        c = dmspVar;
        dsqw.cc(dmsp.class, dmspVar);
    }

    private dmsp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmsp();
            }
            if (i2 == 4) {
                return new dmso();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmsp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
