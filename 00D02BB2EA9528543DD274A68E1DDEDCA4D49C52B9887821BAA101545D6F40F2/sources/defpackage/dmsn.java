package defpackage;
/* compiled from: PG */
/* renamed from: dmsn  reason: default package */
/* loaded from: classes.dex */
public final class dmsn extends dsqw<dmsn, dmsm> implements dssk {
    public static final dmsn d;
    private static volatile dssr<dmsn> f;
    public int a;
    public dsrf b = dsqz.b;
    public dsrf c = dsqz.b;
    private int e;

    static {
        dmsn dmsnVar = new dmsn();
        d = dmsnVar;
        dsqw.cc(dmsn.class, dmsnVar);
    }

    private dmsn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002'\u0003'", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmsn();
            }
            if (i2 == 4) {
                return new dmsm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmsn.class) {
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
