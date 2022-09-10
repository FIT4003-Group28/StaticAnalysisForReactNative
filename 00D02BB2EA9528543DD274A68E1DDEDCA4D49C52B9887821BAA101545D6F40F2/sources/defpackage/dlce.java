package defpackage;
/* compiled from: PG */
/* renamed from: dlce  reason: default package */
/* loaded from: classes6.dex */
public final class dlce extends dsqw<dlce, dlcd> implements dssk {
    public static final dlce d;
    private static volatile dssr<dlce> g;
    public diyr b;
    private int e;
    private byte f = 2;
    public String a = "";
    public String c = "";

    static {
        dlce dlceVar = new dlce();
        d = dlceVar;
        dsqw.cc(dlce.class, dlceVar);
    }

    private dlce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlce();
            }
            if (i2 == 4) {
                return new dlcd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlce> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlce.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
