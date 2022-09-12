package defpackage;
/* compiled from: PG */
/* renamed from: diud  reason: default package */
/* loaded from: classes6.dex */
public final class diud extends dsqw<diud, diuc> implements dssk {
    public static final diud b;
    private static volatile dssr<diud> d;
    public String a = "";
    private int c;

    static {
        diud diudVar = new diud();
        b = diudVar;
        dsqw.cc(diud.class, diudVar);
    }

    private diud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diud();
            }
            if (i2 == 4) {
                return new diuc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diud> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diud.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
