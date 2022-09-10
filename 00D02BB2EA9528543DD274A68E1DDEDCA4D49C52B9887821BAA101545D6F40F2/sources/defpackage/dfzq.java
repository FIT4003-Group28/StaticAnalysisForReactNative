package defpackage;
/* compiled from: PG */
/* renamed from: dfzq  reason: default package */
/* loaded from: classes6.dex */
public final class dfzq extends dsqw<dfzq, dfzl> implements dssk {
    public static final dsrg<Integer, dfzg> i = new dfza();
    public static final dfzq j;
    private static volatile dssr<dfzq> k;
    public int a;
    public dfzi c;
    public dgaq e;
    public int f;
    public String b = "";
    public dsrj<dfzk> d = dssu.b;
    public dsrj<dfze> g = dssu.b;
    public dsrf h = dsqz.b;

    static {
        dfzq dfzqVar = new dfzq();
        j = dfzqVar;
        dsqw.cc(dfzq.class, dfzqVar);
    }

    private dfzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(j, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0003\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဌ\u0004\u0007\u001b\b\u001e", new Object[]{"a", "b", "c", "d", dfzk.class, "e", "f", dfzm.a, "g", dfze.class, "h", dfzg.c()});
            }
            if (i3 == 3) {
                return new dfzq();
            }
            if (i3 == 4) {
                return new dfzl();
            }
            if (i3 == 5) {
                return j;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dfzq> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dfzq.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
