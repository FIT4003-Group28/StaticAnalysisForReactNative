package defpackage;
/* compiled from: PG */
/* renamed from: dppk  reason: default package */
/* loaded from: classes6.dex */
public final class dppk extends dsqw<dppk, dppj> implements dssk {
    public static final dppk b;
    private static volatile dssr<dppk> d;
    public dpre a;
    private int c;

    static {
        dppk dppkVar = new dppk();
        b = dppkVar;
        dsqw.cc(dppk.class, dppkVar);
    }

    private dppk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dppk();
            }
            if (i2 == 4) {
                return new dppj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dppk.class) {
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
