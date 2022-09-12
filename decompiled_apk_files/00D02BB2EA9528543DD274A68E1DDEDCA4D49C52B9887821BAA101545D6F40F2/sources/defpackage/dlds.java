package defpackage;
/* compiled from: PG */
/* renamed from: dlds  reason: default package */
/* loaded from: classes6.dex */
public final class dlds extends dsqw<dlds, dldr> implements dssk {
    public static final dlds e;
    private static volatile dssr<dlds> h;
    public dgly a;
    public docg b;
    public dlcz d;
    private int f;
    private byte g = 2;
    public dsrj<dwfl> c = dssu.b;

    static {
        dlds dldsVar = new dlds();
        e = dldsVar;
        dsqw.cc(dlds.class, dldsVar);
    }

    private dlds() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"f", "a", "b", "c", dwfl.class, "d"});
            }
            if (i2 == 3) {
                return new dlds();
            }
            if (i2 == 4) {
                return new dldr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dlds> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlds.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
