package defpackage;
/* compiled from: PG */
/* renamed from: digy  reason: default package */
/* loaded from: classes6.dex */
public final class digy extends dsqw<digy, digx> implements dssk {
    public static final digy c;
    private static volatile dssr<digy> d;
    public int a;
    public String b = "";

    static {
        digy digyVar = new digy();
        c = digyVar;
        dsqw.cc(digy.class, digyVar);
    }

    private digy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new digy();
            }
            if (i2 == 4) {
                return new digx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (digy.class) {
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
