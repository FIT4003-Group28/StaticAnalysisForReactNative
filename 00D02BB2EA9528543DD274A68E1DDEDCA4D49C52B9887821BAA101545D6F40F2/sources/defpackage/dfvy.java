package defpackage;
/* compiled from: PG */
/* renamed from: dfvy  reason: default package */
/* loaded from: classes6.dex */
public final class dfvy extends dsqw<dfvy, dfvx> implements dssk {
    public static final dfvy e;
    private static volatile dssr<dfvy> f;
    public int a;
    public dfxb b;
    public dfwr c;
    public float d;

    static {
        dfvy dfvyVar = new dfvy();
        e = dfvyVar;
        dsqw.cc(dfvy.class, dfvyVar);
    }

    private dfvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfvy();
            }
            if (i2 == 4) {
                return new dfvx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfvy.class) {
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
