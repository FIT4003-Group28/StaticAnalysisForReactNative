package defpackage;
/* compiled from: PG */
/* renamed from: djro  reason: default package */
/* loaded from: classes.dex */
public final class djro extends dsqw<djro, djrn> implements dssk {
    public static final djro c;
    private static volatile dssr<djro> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        djro djroVar = new djro();
        c = djroVar;
        dsqw.cc(djro.class, djroVar);
    }

    private djro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djro();
            }
            if (i2 == 4) {
                return new djrn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djro> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djro.class) {
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
