package defpackage;
/* compiled from: PG */
/* renamed from: dlbk  reason: default package */
/* loaded from: classes6.dex */
public final class dlbk extends dsqw<dlbk, dlbj> implements dssk {
    public static final dlbk b;
    private static volatile dssr<dlbk> d;
    public dnwb a;
    private int c;

    static {
        dlbk dlbkVar = new dlbk();
        b = dlbkVar;
        dsqw.cc(dlbk.class, dlbkVar);
    }

    private dlbk() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlbk();
            }
            if (i2 == 4) {
                return new dlbj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlbk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlbk.class) {
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
