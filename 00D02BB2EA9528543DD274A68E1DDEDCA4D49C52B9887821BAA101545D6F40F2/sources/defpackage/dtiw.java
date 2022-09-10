package defpackage;
/* compiled from: PG */
/* renamed from: dtiw  reason: default package */
/* loaded from: classes6.dex */
public final class dtiw extends dsqw<dtiw, dtiv> implements dssk {
    public static final dtiw e;
    private static volatile dssr<dtiw> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        dtiw dtiwVar = new dtiw();
        e = dtiwVar;
        dsqw.cc(dtiw.class, dtiwVar);
    }

    private dtiw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtiw();
            }
            if (i2 == 4) {
                return new dtiv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtiw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtiw.class) {
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
