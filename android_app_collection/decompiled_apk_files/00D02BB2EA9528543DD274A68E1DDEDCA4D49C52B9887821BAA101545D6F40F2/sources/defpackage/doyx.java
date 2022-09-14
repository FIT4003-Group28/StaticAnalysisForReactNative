package defpackage;
/* compiled from: PG */
/* renamed from: doyx  reason: default package */
/* loaded from: classes6.dex */
public final class doyx extends dsqw<doyx, doyw> implements dssk {
    public static final doyx d;
    private static volatile dssr<doyx> e;
    public int a;
    public int b;
    public int c;

    static {
        doyx doyxVar = new doyx();
        d = doyxVar;
        dsqw.cc(doyx.class, doyxVar);
    }

    private doyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dmqc.c(), "c", dmqc.c()});
            }
            if (i2 == 3) {
                return new doyx();
            }
            if (i2 == 4) {
                return new doyw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doyx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doyx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
