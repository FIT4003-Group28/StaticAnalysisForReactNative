package defpackage;
/* compiled from: PG */
/* renamed from: dgrt  reason: default package */
/* loaded from: classes.dex */
public final class dgrt extends dsqw<dgrt, dgrs> implements dssk {
    public static final dgrt d;
    private static volatile dssr<dgrt> f;
    public int a;
    public dgrn b;
    public dgrn c;
    private byte e = 2;

    static {
        dgrt dgrtVar = new dgrt();
        d = dgrtVar;
        dsqw.cc(dgrt.class, dgrtVar);
    }

    private dgrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgrt();
            }
            if (i2 == 4) {
                return new dgrs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dgrt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgrt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
