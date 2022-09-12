package defpackage;
/* compiled from: PG */
/* renamed from: divk  reason: default package */
/* loaded from: classes6.dex */
public final class divk extends dsqw<divk, divj> implements dssk {
    public static final divk b;
    private static volatile dssr<divk> d;
    public boolean a;
    private int c;

    static {
        divk divkVar = new divk();
        b = divkVar;
        dsqw.cc(divk.class, divkVar);
    }

    private divk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new divk();
            }
            if (i2 == 4) {
                return new divj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (divk.class) {
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
