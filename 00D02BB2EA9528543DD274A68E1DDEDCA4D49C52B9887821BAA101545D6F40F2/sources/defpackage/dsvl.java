package defpackage;
/* compiled from: PG */
/* renamed from: dsvl  reason: default package */
/* loaded from: classes6.dex */
public final class dsvl extends dsqw<dsvl, dsvk> implements dssk {
    public static final dsvl b;
    private static volatile dssr<dsvl> c;
    public dsrj<dsvj> a = dssu.b;

    static {
        dsvl dsvlVar = new dsvl();
        b = dsvlVar;
        dsqw.cc(dsvl.class, dsvlVar);
    }

    private dsvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsvj.class});
            }
            if (i2 == 3) {
                return new dsvl();
            }
            if (i2 == 4) {
                return new dsvk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsvl.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
