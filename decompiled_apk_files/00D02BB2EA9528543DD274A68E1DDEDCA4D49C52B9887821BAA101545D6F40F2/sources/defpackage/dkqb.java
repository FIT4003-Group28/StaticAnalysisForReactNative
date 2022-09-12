package defpackage;
/* compiled from: PG */
/* renamed from: dkqb  reason: default package */
/* loaded from: classes.dex */
public final class dkqb extends dsqw<dkqb, dkqa> implements dssk {
    public static final dkqb d;
    private static volatile dssr<dkqb> f;
    public int a;
    public dkps b;
    public int c;
    private int e;

    static {
        dkqb dkqbVar = new dkqb();
        d = dkqbVar;
        dsqw.cc(dkqb.class, dkqbVar);
    }

    private dkqb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"e", "a", dpyv.c(), "b", "c"});
            }
            if (i2 == 3) {
                return new dkqb();
            }
            if (i2 == 4) {
                return new dkqa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkqb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
