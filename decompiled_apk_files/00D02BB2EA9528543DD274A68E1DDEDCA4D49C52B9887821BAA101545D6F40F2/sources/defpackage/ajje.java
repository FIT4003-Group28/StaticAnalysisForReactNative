package defpackage;
/* compiled from: PG */
/* renamed from: ajje  reason: default package */
/* loaded from: classes2.dex */
public final class ajje extends dsqw<ajje, ajjd> implements dssk {
    public static final ajje o;
    private static volatile dssr<ajje> p;
    public int a;
    public doep b;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public ajjc h;
    public long j;
    public dsrj<dqzv> c = dssu.b;
    public String i = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        ajje ajjeVar = new ajje();
        o = ajjeVar;
        dsqw.cc(ajje.class, ajjeVar);
    }

    private ajje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဂ\u0002\u0004ဈ\n\u0005ဈ\u000b\u0006ဈ\f\tဈ\b\nဂ\u0003\u000bဂ\t\fဂ\u0004\rဈ\r\u000eဉ\u0005\u000fဇ\u0001", new Object[]{"a", "b", "c", dqzv.class, "e", "k", "l", "m", "i", "f", "j", "g", "n", "h", "d"});
            }
            if (i2 == 3) {
                return new ajje();
            }
            if (i2 == 4) {
                return new ajjd();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajje> dssrVar = p;
            if (dssrVar == null) {
                synchronized (ajje.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
