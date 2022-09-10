package defpackage;
/* compiled from: PG */
/* renamed from: clab  reason: default package */
/* loaded from: classes5.dex */
public final class clab extends dsqw<clab, claa> implements dssk {
    public static final clab c;
    private static volatile dssr<clab> d;
    public int a;
    public boolean b;

    static {
        clab clabVar = new clab();
        c = clabVar;
        dsqw.cc(clab.class, clabVar);
    }

    private clab() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new clab();
            }
            if (i2 == 4) {
                return new claa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<clab> dssrVar = d;
            if (dssrVar == null) {
                synchronized (clab.class) {
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
