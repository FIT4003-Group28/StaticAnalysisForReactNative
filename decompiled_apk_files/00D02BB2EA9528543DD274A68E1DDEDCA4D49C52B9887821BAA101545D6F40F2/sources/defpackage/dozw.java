package defpackage;
/* compiled from: PG */
/* renamed from: dozw  reason: default package */
/* loaded from: classes6.dex */
public final class dozw extends dsqw<dozw, dozv> implements dssk {
    public static final dozw e;
    private static volatile dssr<dozw> g;
    public int a;
    public double d;
    private byte f = 2;
    public dsrj<dpce> b = dssu.b;
    public String c = "";

    static {
        dozw dozwVar = new dozw();
        e = dozwVar;
        dsqw.cc(dozw.class, dozwVar);
    }

    private dozw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0004က\u0002", new Object[]{"a", "b", dpce.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dozw();
            }
            if (i2 == 4) {
                return new dozv();
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
            dssr<dozw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dozw.class) {
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
