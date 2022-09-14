package defpackage;
/* compiled from: PG */
/* renamed from: dugc  reason: default package */
/* loaded from: classes6.dex */
public final class dugc extends dsqw<dugc, dugb> implements dssk {
    public static final dugc c;
    private static volatile dssr<dugc> e;
    public int a;
    public String b = "";
    private int d;

    static {
        dugc dugcVar = new dugc();
        c = dugcVar;
        dsqw.cc(dugc.class, dugcVar);
    }

    private dugc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0006ဌ\u0000", new Object[]{"d", "b", "a", duej.c()});
            }
            if (i2 == 3) {
                return new dugc();
            }
            if (i2 == 4) {
                return new dugb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dugc.class) {
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
