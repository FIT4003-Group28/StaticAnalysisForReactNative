package defpackage;
/* compiled from: PG */
/* renamed from: dhra  reason: default package */
/* loaded from: classes6.dex */
public final class dhra extends dsqw<dhra, dhqx> implements dssk {
    public static final dhra f;
    private static volatile dssr<dhra> i;
    public int a;
    public dnwb e;
    private dnqh g;
    private byte h = 2;
    public String b = "";
    public String c = "";
    public dsrj<dhqz> d = dssu.b;

    static {
        dhra dhraVar = new dhra();
        f = dhraVar;
        dsqw.cc(dhra.class, dhraVar);
    }

    private dhra() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001b\u0004ᐉ\u0003\u0005ဉ\u0004\u0007ဈ\u0001", new Object[]{"a", "b", "d", dhqz.class, "g", "e", "c"});
            }
            if (i3 == 3) {
                return new dhra();
            }
            if (i3 == 4) {
                return new dhqx();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dhra> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dhra.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
