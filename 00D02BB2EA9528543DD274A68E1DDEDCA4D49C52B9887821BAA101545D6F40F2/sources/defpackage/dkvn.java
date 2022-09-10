package defpackage;
/* compiled from: PG */
/* renamed from: dkvn  reason: default package */
/* loaded from: classes.dex */
public final class dkvn extends dsqw<dkvn, dkvm> implements dssk {
    public static final dkvn e;
    private static volatile dssr<dkvn> f;
    public int a;
    public dkhd b;
    public boolean c;
    public int d;

    static {
        dkvn dkvnVar = new dkvn();
        e = dkvnVar;
        dsqw.cc(dkvn.class, dkvnVar);
    }

    private dkvn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဉ\u0000\tဇ\u0004\nဌ\u0005", new Object[]{"a", "b", "c", "d", dkha.a});
            }
            if (i2 == 3) {
                return new dkvn();
            }
            if (i2 == 4) {
                return new dkvm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkvn.class) {
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
