package defpackage;
/* compiled from: PG */
/* renamed from: duap  reason: default package */
/* loaded from: classes.dex */
public final class duap extends dsqw<duap, duao> implements dssk {
    public static final duap b;
    private static volatile dssr<duap> c;
    public duan a;

    static {
        duap duapVar = new duap();
        b = duapVar;
        dsqw.cc(duap.class, duapVar);
    }

    private duap() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new duap();
            }
            if (i2 == 4) {
                return new duao();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duap> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duap.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
