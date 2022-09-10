package defpackage;
/* compiled from: PG */
/* renamed from: dhjl  reason: default package */
/* loaded from: classes6.dex */
public final class dhjl extends dsqw<dhjl, dhjj> implements dssk {
    public static final dhjl c;
    private static volatile dssr<dhjl> d;
    public int a;
    public int b;

    static {
        dhjl dhjlVar = new dhjl();
        c = dhjlVar;
        dsqw.cc(dhjl.class, dhjlVar);
    }

    private dhjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dhjk.a});
            }
            if (i2 == 3) {
                return new dhjl();
            }
            if (i2 == 4) {
                return new dhjj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhjl.class) {
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
