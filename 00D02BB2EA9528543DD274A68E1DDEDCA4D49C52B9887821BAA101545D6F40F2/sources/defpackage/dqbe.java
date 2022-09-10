package defpackage;
/* compiled from: PG */
/* renamed from: dqbe  reason: default package */
/* loaded from: classes6.dex */
public final class dqbe extends dsqw<dqbe, dqbd> implements dssk {
    public static final dqbe k;
    private static volatile dssr<dqbe> l;
    public int a;
    public int c;
    public dpsn i;
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public dsrj<dqba> g = dssu.b;
    public String h = "";
    public String j = "";

    static {
        dqbe dqbeVar = new dqbe();
        k = dqbeVar;
        dsqw.cc(dqbe.class, dqbeVar);
    }

    private dqbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0001\u0000\u0001ဌ\u0003\u0002ဈ\u0004\u0003ဈ\u0005\u0004ဈ\u0006\u0005\u001b\u0007ဈ\u0001\nဈ\u0007\fဉ\b\rဈ\t", new Object[]{"a", "c", dqbb.a, "d", "e", "f", "g", dqba.class, "b", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dqbe();
            }
            if (i2 == 4) {
                return new dqbd();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbe> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dqbe.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
