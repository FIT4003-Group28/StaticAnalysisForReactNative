package defpackage;
/* compiled from: PG */
/* renamed from: djqi  reason: default package */
/* loaded from: classes6.dex */
public final class djqi extends dsqw<djqi, djqh> implements dssk {
    public static final djqi b;
    private static volatile dssr<djqi> d;
    public String a = "";
    private int c;

    static {
        djqi djqiVar = new djqi();
        b = djqiVar;
        dsqw.cc(djqi.class, djqiVar);
    }

    private djqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djqi();
            }
            if (i2 == 4) {
                return new djqh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djqi.class) {
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
