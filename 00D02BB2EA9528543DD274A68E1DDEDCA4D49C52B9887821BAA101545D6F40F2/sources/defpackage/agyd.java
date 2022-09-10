package defpackage;
/* compiled from: PG */
/* renamed from: agyd  reason: default package */
/* loaded from: classes2.dex */
public final class agyd extends dsqw<agyd, agyc> implements dssk {
    public static final agyd d;
    private static volatile dssr<agyd> e;
    public int a;
    public dlcn b;
    public int c = -1;

    static {
        agyd agydVar = new agyd();
        d = agydVar;
        dsqw.cc(agyd.class, agydVar);
    }

    private agyd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new agyd();
            }
            if (i2 == 4) {
                return new agyc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agyd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (agyd.class) {
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
