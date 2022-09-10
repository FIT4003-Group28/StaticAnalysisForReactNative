package defpackage;
/* compiled from: PG */
/* renamed from: clan  reason: default package */
/* loaded from: classes5.dex */
public final class clan extends dsqw<clan, clam> implements dssk {
    public static final clan c;
    private static volatile dssr<clan> f;
    public int a;
    public String b;
    private clal d;
    private byte e = 2;

    static {
        clan clanVar = new clan();
        c = clanVar;
        dsqw.cc(clan.class, clanVar);
    }

    private clan() {
        dspd dspdVar = dspd.b;
        this.b = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0017\u0002\u0000\u0000\u0001\u0002ဈ\u0001\u0017ᐉ\u0016", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new clan();
            }
            if (i2 == 4) {
                return new clam();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<clan> dssrVar = f;
            if (dssrVar == null) {
                synchronized (clan.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
