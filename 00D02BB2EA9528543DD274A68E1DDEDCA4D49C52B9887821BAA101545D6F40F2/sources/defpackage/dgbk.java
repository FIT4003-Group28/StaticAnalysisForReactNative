package defpackage;
/* compiled from: PG */
/* renamed from: dgbk  reason: default package */
/* loaded from: classes6.dex */
public final class dgbk extends dsqw<dgbk, dgbj> implements dssk {
    public static final dgbk d;
    private static volatile dssr<dgbk> e;
    public int a;
    public double b;
    public double c;

    static {
        dgbk dgbkVar = new dgbk();
        d = dgbkVar;
        dsqw.cc(dgbk.class, dgbkVar);
    }

    private dgbk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgbk();
            }
            if (i2 == 4) {
                return new dgbj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgbk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgbk.class) {
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
