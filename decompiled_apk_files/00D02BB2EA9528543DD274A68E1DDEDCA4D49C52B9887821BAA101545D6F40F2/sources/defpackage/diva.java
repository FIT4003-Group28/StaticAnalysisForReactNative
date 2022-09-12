package defpackage;
/* compiled from: PG */
/* renamed from: diva  reason: default package */
/* loaded from: classes6.dex */
public final class diva extends dsqw<diva, diuz> implements dssk {
    public static final diva b;
    private static volatile dssr<diva> d;
    public String a = "";
    private int c;

    static {
        diva divaVar = new diva();
        b = divaVar;
        dsqw.cc(diva.class, divaVar);
    }

    private diva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diva();
            }
            if (i2 == 4) {
                return new diuz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diva> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diva.class) {
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
