package defpackage;
/* compiled from: PG */
/* renamed from: dgpe  reason: default package */
/* loaded from: classes6.dex */
public final class dgpe extends dsqw<dgpe, dgpd> implements dssk {
    public static final dgpe c;
    private static volatile dssr<dgpe> d;
    public int a = 0;
    public Object b;

    static {
        dgpe dgpeVar = new dgpe();
        c = dgpeVar;
        dsqw.cc(dgpe.class, dgpeVar);
    }

    private dgpe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001့\u0000\u0002့\u0000\u0003့\u0000\u0004့\u0000\u0005့\u0000\u0006့\u0000\u0007့\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dgpe();
            }
            if (i2 == 4) {
                return new dgpd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgpe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgpe.class) {
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
