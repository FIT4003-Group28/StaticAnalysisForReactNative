package defpackage;
/* compiled from: PG */
/* renamed from: dotj  reason: default package */
/* loaded from: classes6.dex */
public final class dotj extends dsqw<dotj, dotg> implements dssk {
    public static final dotj c;
    private static volatile dssr<dotj> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dotj dotjVar = new dotj();
        c = dotjVar;
        dsqw.cc(dotj.class, dotjVar);
    }

    private dotj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", doth.a});
            }
            if (i2 == 3) {
                return new dotj();
            }
            if (i2 == 4) {
                return new dotg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dotj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dotj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
