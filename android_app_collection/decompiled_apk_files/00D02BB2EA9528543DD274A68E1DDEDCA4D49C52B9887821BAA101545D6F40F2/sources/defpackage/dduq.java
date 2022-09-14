package defpackage;
/* compiled from: PG */
/* renamed from: dduq  reason: default package */
/* loaded from: classes6.dex */
public final class dduq extends dsqw<dduq, ddup> implements dssk {
    public static final dduq s;
    private static volatile dssr<dduq> t;
    public int a;
    public int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public long g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public ddxc q;
    public int r;

    static {
        dduq dduqVar = new dduq();
        s = dduqVar;
        dsqw.cc(dduq.class, dduqVar);
    }

    private dduq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0001\u0011\u0000\u0001\u0001\u001c\u0011\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0005ဏ\u0003\u0006ဏ\u0004\u0007ဏ\u0006\bဏ\u0007\tဌ\b\nဇ\t\u000bဏ\n\fဏ\u000b\rဌ\f\u000eဏ\r\u000fဏ\u000e\u0010ဉ\u000f\u0011င\u0010\u001cဂ\u0005", new Object[]{"a", "b", ddvn.c(), "c", "d", "e", "f", "h", "i", "j", dqvj.d(), "k", "l", "m", "n", ddun.a, "o", "p", "q", "r", "g"});
            }
            if (i2 == 3) {
                return new dduq();
            }
            if (i2 == 4) {
                return new ddup();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dduq> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dduq.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
