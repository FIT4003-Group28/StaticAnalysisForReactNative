package defpackage;
/* compiled from: PG */
/* renamed from: digb  reason: default package */
/* loaded from: classes6.dex */
public final class digb extends dsqw<digb, dift> implements dssk {
    public static final digb d;
    private static volatile dssr<digb> f;
    public int a = 0;
    public Object b;
    public difv c;
    private int e;

    static {
        digb digbVar = new digb();
        d = digbVar;
        dsqw.cc(digb.class, digbVar);
    }

    private digb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", "c", difx.class, difz.class});
            }
            if (i2 == 3) {
                return new digb();
            }
            if (i2 == 4) {
                return new dift();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (digb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
