package defpackage;
/* compiled from: PG */
/* renamed from: djwi  reason: default package */
/* loaded from: classes.dex */
public final class djwi extends dsqw<djwi, djwh> implements dssk {
    public static final djwi b;
    private static volatile dssr<djwi> d;
    public boolean a;
    private int c;

    static {
        djwi djwiVar = new djwi();
        b = djwiVar;
        dsqw.cc(djwi.class, djwiVar);
    }

    private djwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0004", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djwi();
            }
            if (i2 == 4) {
                return new djwh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djwi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djwi.class) {
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
