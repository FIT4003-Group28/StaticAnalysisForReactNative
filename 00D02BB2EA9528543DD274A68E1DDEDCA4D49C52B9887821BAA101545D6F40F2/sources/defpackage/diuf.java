package defpackage;
/* compiled from: PG */
/* renamed from: diuf  reason: default package */
/* loaded from: classes6.dex */
public final class diuf extends dsqw<diuf, diue> implements dssk {
    public static final diuf c;
    private static volatile dssr<diuf> e;
    public String a = "";
    public dnpq b;
    private int d;

    static {
        diuf diufVar = new diuf();
        c = diufVar;
        dsqw.cc(diuf.class, diufVar);
    }

    private diuf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new diuf();
            }
            if (i2 == 4) {
                return new diue();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diuf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diuf.class) {
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
