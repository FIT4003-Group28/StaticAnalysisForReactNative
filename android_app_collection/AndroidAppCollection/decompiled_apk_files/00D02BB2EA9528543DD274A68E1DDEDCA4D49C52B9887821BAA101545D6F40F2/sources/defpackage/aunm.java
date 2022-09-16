package defpackage;
/* compiled from: PG */
/* renamed from: aunm  reason: default package */
/* loaded from: classes2.dex */
public final class aunm extends dsqw<aunm, aunl> implements dssk {
    public static final aunm f;
    private static volatile dssr<aunm> g;
    public int a;
    public auni b;
    public long c;
    public int d;
    public int e;

    static {
        aunm aunmVar = new aunm();
        f = aunmVar;
        dsqw.cc(aunm.class, aunmVar);
    }

    private aunm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", aunn.a, "e", aunf.a});
            }
            if (i2 == 3) {
                return new aunm();
            }
            if (i2 == 4) {
                return new aunl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aunm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (aunm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
