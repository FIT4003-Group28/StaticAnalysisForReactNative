package defpackage;
/* compiled from: PG */
/* renamed from: ddiv  reason: default package */
/* loaded from: classes5.dex */
public final class ddiv extends dsqw<ddiv, ddiu> implements dssk {
    public static final ddiv d;
    private static volatile dssr<ddiv> e;
    public int a;
    public int b;
    public int c;

    static {
        ddiv ddivVar = new ddiv();
        d = ddivVar;
        dsqw.cc(ddiv.class, ddivVar);
    }

    private ddiv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", dqvw.a});
            }
            if (i2 == 3) {
                return new ddiv();
            }
            if (i2 == 4) {
                return new ddiu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddiv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddiv.class) {
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
