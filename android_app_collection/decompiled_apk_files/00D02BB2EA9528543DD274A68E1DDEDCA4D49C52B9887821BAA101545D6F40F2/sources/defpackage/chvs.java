package defpackage;
/* compiled from: PG */
/* renamed from: chvs  reason: default package */
/* loaded from: classes4.dex */
public final class chvs extends dsqw<chvs, chvr> implements dssk {
    public static final chvs f;
    private static volatile dssr<chvs> g;
    public int a;
    public dppt b;
    public String c = "";
    public drdg d;
    public dpvc e;

    static {
        chvs chvsVar = new chvs();
        f = chvsVar;
        dsqw.cc(chvs.class, chvsVar);
    }

    private chvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new chvs();
            }
            if (i2 == 4) {
                return new chvr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (chvs.class) {
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
