package defpackage;
/* compiled from: PG */
/* renamed from: dlon  reason: default package */
/* loaded from: classes6.dex */
public final class dlon extends dsqw<dlon, dlom> implements dssk {
    public static final dlon g;
    private static volatile dssr<dlon> i;
    public int a;
    public dlsw d;
    public dlug e;
    public boolean f;
    private byte h = 2;
    public dspd b = dspd.b;
    public String c = "";

    static {
        dlon dlonVar = new dlon();
        g = dlonVar;
        dsqw.cc(dlon.class, dlonVar);
    }

    private dlon() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ည\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dlon();
            }
            if (i3 == 4) {
                return new dlom();
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
            dssr<dlon> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlon.class) {
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
