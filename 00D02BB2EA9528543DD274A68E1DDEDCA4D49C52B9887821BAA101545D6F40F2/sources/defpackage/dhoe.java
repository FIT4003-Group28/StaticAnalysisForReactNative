package defpackage;
/* compiled from: PG */
/* renamed from: dhoe  reason: default package */
/* loaded from: classes6.dex */
public final class dhoe extends dsqw<dhoe, dhod> implements dssk {
    public static final dsrg<Integer, dkee> b = new dhoc();
    public static final dhoe c;
    private static volatile dssr<dhoe> d;
    public dsrf a = dsqz.b;

    static {
        dhoe dhoeVar = new dhoe();
        c = dhoeVar;
        dsqw.cc(dhoe.class, dhoeVar);
    }

    private dhoe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dkee.c()});
            }
            if (i2 == 3) {
                return new dhoe();
            }
            if (i2 == 4) {
                return new dhod();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhoe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhoe.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
