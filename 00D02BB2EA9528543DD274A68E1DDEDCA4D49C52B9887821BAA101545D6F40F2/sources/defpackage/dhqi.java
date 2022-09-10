package defpackage;
/* compiled from: PG */
/* renamed from: dhqi  reason: default package */
/* loaded from: classes6.dex */
public final class dhqi extends dsqw<dhqi, dhqh> implements dssk {
    public static final dhqi e;
    private static volatile dssr<dhqi> g;
    public int a;
    public dpov b;
    public dnqh d;
    private byte f = 2;
    public dsrj<dppl> c = dssu.b;

    static {
        dhqi dhqiVar = new dhqi();
        e = dhqiVar;
        dsqw.cc(dhqi.class, dhqiVar);
    }

    private dhqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001b\u0003ᐉ\u0001", new Object[]{"a", "b", "c", dppl.class, "d"});
            }
            if (i2 == 3) {
                return new dhqi();
            }
            if (i2 == 4) {
                return new dhqh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhqi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhqi.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
