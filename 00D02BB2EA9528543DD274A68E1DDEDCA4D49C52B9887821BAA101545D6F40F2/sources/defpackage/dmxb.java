package defpackage;
/* compiled from: PG */
/* renamed from: dmxb  reason: default package */
/* loaded from: classes6.dex */
public final class dmxb extends dsqw<dmxb, dmxa> implements dssk {
    public static final dmxb o;
    private static volatile dssr<dmxb> p;
    public int a;
    public float i;
    public dmyh l;
    public int m;
    public boolean n;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public dsrf j = dsqz.b;
    public dsrj<String> k = dssu.b;

    static {
        dmxb dmxbVar = new dmxb();
        o = dmxbVar;
        dsqw.cc(dmxb.class, dmxbVar);
    }

    private dmxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\bဈ\t\tခ\n\n\u0016\fဈ\u0006\u000eဉ\f\u000fဌ\r\u0016ဇ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "j", "g", "l", "m", dmwb.c(), "n"});
            }
            if (i2 == 3) {
                return new dmxb();
            }
            if (i2 == 4) {
                return new dmxa();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmxb> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dmxb.class) {
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
