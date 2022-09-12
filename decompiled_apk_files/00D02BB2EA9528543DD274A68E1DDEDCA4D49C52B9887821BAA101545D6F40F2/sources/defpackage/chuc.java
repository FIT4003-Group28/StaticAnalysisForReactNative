package defpackage;
/* compiled from: PG */
/* renamed from: chuc  reason: default package */
/* loaded from: classes4.dex */
public final class chuc extends dsqw<chuc, chub> implements dssk {
    public static final chuc f;
    private static volatile dssr<chuc> g;
    public int a;
    public int b;
    public dpoj c;
    public String d = "";
    public dpoj e;

    static {
        chuc chucVar = new chuc();
        f = chucVar;
        dsqw.cc(chuc.class, chucVar);
    }

    private chuc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new chuc();
            }
            if (i2 == 4) {
                return new chub();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chuc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (chuc.class) {
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
