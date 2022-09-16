package defpackage;
/* compiled from: PG */
/* renamed from: dkfn  reason: default package */
/* loaded from: classes6.dex */
public final class dkfn extends dsqw<dkfn, dkfm> implements dssk {
    public static final dkfn d;
    private static volatile dssr<dkfn> e;
    public int a;
    public dutq b;
    public boolean c;

    static {
        dkfn dkfnVar = new dkfn();
        d = dkfnVar;
        dsqw.cc(dkfn.class, dkfnVar);
    }

    private dkfn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkfn();
            }
            if (i2 == 4) {
                return new dkfm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkfn.class) {
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
