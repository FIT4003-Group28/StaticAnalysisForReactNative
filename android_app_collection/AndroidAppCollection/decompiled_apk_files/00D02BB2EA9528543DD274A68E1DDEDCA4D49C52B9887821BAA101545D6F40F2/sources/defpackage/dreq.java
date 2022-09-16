package defpackage;
/* compiled from: PG */
/* renamed from: dreq  reason: default package */
/* loaded from: classes6.dex */
public final class dreq extends dsqw<dreq, drel> implements dssk {
    public static final dreq c;
    private static volatile dssr<dreq> e;
    public int a;
    public dren b;
    private int d;

    static {
        dreq dreqVar = new dreq();
        c = dreqVar;
        dsqw.cc(dreq.class, dreqVar);
    }

    private dreq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဌ\u0001", new Object[]{"d", "b", "a", dreo.a});
            }
            if (i2 == 3) {
                return new dreq();
            }
            if (i2 == 4) {
                return new drel();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dreq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dreq.class) {
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
