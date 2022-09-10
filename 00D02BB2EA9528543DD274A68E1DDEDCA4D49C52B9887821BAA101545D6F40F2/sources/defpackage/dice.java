package defpackage;
/* compiled from: PG */
/* renamed from: dice  reason: default package */
/* loaded from: classes6.dex */
public final class dice extends dsqw<dice, dibz> implements dssk {
    public static final dice m;
    private static volatile dssr<dice> n;
    public int a;
    public diid b;
    public dihv d;
    public int e;
    public int g;
    public diyj h;
    public int l;
    public String c = "";
    public String f = "";
    public String i = "";
    public String j = "";
    public dsrj<diif> k = dssu.b;

    static {
        dice diceVar = new dice();
        m = diceVar;
        dsqw.cc(dice.class, diceVar);
    }

    private dice() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0002\f\u000b\u0000\u0001\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဉ\u0007\bဈ\b\tဈ\t\n\u001b\u000bဌ\u0004\fဌ\n", new Object[]{"a", "b", "c", "d", "f", "g", dica.a, "h", "i", "j", "k", diif.class, "e", djwt.a, "l", dicc.a});
            }
            if (i2 == 3) {
                return new dice();
            }
            if (i2 == 4) {
                return new dibz();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dice> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dice.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
