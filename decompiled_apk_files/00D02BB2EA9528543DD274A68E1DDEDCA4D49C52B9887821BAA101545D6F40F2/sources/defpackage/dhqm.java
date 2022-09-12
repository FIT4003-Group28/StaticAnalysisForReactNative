package defpackage;
/* compiled from: PG */
/* renamed from: dhqm  reason: default package */
/* loaded from: classes6.dex */
public final class dhqm extends dsqw<dhqm, dhql> implements dssk {
    public static final dhqm g;
    private static volatile dssr<dhqm> i;
    public int a;
    public dpri c;
    public dnqh f;
    private byte h = 2;
    public int b = 1;
    public dsrj<dppz> d = dssu.b;
    public String e = "";

    static {
        dhqm dhqmVar = new dhqm();
        g = dhqmVar;
        dsqw.cc(dhqm.class, dhqmVar);
    }

    private dhqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0002\u0005ᐉ\u0005\bဉ\u0001", new Object[]{"a", "b", dpqj.c(), "d", dppz.class, "e", "f", "c"});
            }
            if (i3 == 3) {
                return new dhqm();
            }
            if (i3 == 4) {
                return new dhql();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dhqm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dhqm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
