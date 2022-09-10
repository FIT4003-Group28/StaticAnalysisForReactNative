package defpackage;
/* compiled from: PG */
/* renamed from: dzyc  reason: default package */
/* loaded from: classes6.dex */
public final class dzyc extends dsqw<dzyc, dzxz> implements dssk {
    public static final dzyc k;
    private static volatile dssr<dzyc> m;
    public int a;
    public int b;
    public long c;
    public dzze f;
    public int g;
    public long h;
    public dzyu i;
    public long j;
    private byte l = 2;
    public String d = "";
    public String e = "";

    static {
        dzyc dzycVar = new dzyc();
        k = dzycVar;
        dsqw.cc(dzyc.class, dzycVar);
    }

    private dzyc() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"a", "b", dzyb.c(), "g", dzyb.c(), "h", "i", "j", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dzyc();
            }
            if (i2 == 4) {
                return new dzxz();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dzyc> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dzyc.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
