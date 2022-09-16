package defpackage;
/* compiled from: PG */
/* renamed from: dfpb  reason: default package */
/* loaded from: classes6.dex */
public final class dfpb extends dsqw<dfpb, dfoy> implements dssk {
    public static final dfpb e;
    private static volatile dssr<dfpb> f;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;

    static {
        dfpb dfpbVar = new dfpb();
        e = dfpbVar;
        dsqw.cc(dfpb.class, dfpbVar);
    }

    private dfpb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003ဿ\u0001\u0004ြ\u0001", new Object[]{"b", "a", "d", "c", duha.class, duhc.c(), dfpa.c(), duhk.class});
            }
            if (i2 == 3) {
                return new dfpb();
            }
            if (i2 == 4) {
                return new dfoy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfpb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfpb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
