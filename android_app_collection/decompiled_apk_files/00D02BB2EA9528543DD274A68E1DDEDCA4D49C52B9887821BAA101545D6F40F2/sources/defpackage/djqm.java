package defpackage;
/* compiled from: PG */
/* renamed from: djqm  reason: default package */
/* loaded from: classes6.dex */
public final class djqm extends dsqw<djqm, djql> implements dssk {
    public static final djqm b;
    private static volatile dssr<djqm> d;
    public int a;
    private int c;

    static {
        djqm djqmVar = new djqm();
        b = djqmVar;
        dsqw.cc(djqm.class, djqmVar);
    }

    private djqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dpud.a});
            }
            if (i2 == 3) {
                return new djqm();
            }
            if (i2 == 4) {
                return new djql();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djqm.class) {
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
