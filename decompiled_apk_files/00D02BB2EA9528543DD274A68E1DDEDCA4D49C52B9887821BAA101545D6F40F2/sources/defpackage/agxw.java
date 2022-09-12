package defpackage;
/* compiled from: PG */
/* renamed from: agxw  reason: default package */
/* loaded from: classes2.dex */
public final class agxw extends dsqw<agxw, agxv> implements dssk {
    public static final agxw c;
    private static volatile dssr<agxw> d;
    public int a;
    public int b;

    static {
        agxw agxwVar = new agxw();
        c = agxwVar;
        dsqw.cc(agxw.class, agxwVar);
    }

    private agxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new agxw();
            }
            if (i2 == 4) {
                return new agxv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agxw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (agxw.class) {
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
