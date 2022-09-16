package defpackage;
/* compiled from: PG */
/* renamed from: dnob  reason: default package */
/* loaded from: classes.dex */
public final class dnob extends dsqw<dnob, dnoa> implements dssk {
    public static final dnob j;
    private static volatile dssr<dnob> k;
    public int a;
    public int b;
    public dorg c;
    public String d = "";
    public String e = "";
    public int f;
    public dqxc g;
    public int h;
    public int i;

    static {
        dnob dnobVar = new dnob();
        j = dnobVar;
        dsqw.cc(dnob.class, dnobVar);
    }

    private dnob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဉ\u0002\u0003ဈ\u0003\u0007င\u0007\u000eဉ\u000b\u000fဈ\u0004\u0010င\f\u0011ဌ\r", new Object[]{"a", "b", donv.a, "c", "d", "f", "g", "e", "h", "i", dnnv.c()});
            }
            if (i2 == 3) {
                return new dnob();
            }
            if (i2 == 4) {
                return new dnoa();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnob> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dnob.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
