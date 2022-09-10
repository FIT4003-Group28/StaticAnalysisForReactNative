package defpackage;
/* compiled from: PG */
/* renamed from: diei  reason: default package */
/* loaded from: classes6.dex */
public final class diei extends dsqw<diei, died> implements dssk {
    public static final diei c;
    private static volatile dssr<diei> e;
    public String a = "";
    public dsrj<dieh> b = dssu.b;
    private int d;

    static {
        diei dieiVar = new diei();
        c = dieiVar;
        dsqw.cc(diei.class, dieiVar);
    }

    private diei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dieh.class});
            }
            if (i2 == 3) {
                return new diei();
            }
            if (i2 == 4) {
                return new died();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diei> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diei.class) {
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
