package defpackage;
/* compiled from: PG */
/* renamed from: duom  reason: default package */
/* loaded from: classes.dex */
public final class duom extends dsqw<duom, duoj> implements dssk {
    public static final duom c;
    private static volatile dssr<duom> e;
    public String a = "";
    public int b;
    private int d;

    static {
        duom duomVar = new duom();
        c = duomVar;
        dsqw.cc(duom.class, duomVar);
    }

    private duom() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", duok.a});
            }
            if (i2 == 3) {
                return new duom();
            }
            if (i2 == 4) {
                return new duoj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duom> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duom.class) {
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
