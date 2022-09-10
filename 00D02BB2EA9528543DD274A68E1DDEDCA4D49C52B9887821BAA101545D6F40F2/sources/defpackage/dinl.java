package defpackage;
/* compiled from: PG */
/* renamed from: dinl  reason: default package */
/* loaded from: classes6.dex */
public final class dinl extends dsqw<dinl, dinj> implements dssk {
    public static final dinl c;
    private static volatile dssr<dinl> d;
    public int a;
    public int b;

    static {
        dinl dinlVar = new dinl();
        c = dinlVar;
        dsqw.cc(dinl.class, dinlVar);
    }

    private dinl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dink.a});
            }
            if (i2 == 3) {
                return new dinl();
            }
            if (i2 == 4) {
                return new dinj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dinl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dinl.class) {
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
