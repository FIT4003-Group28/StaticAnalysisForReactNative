package defpackage;
/* compiled from: PG */
/* renamed from: dljr  reason: default package */
/* loaded from: classes6.dex */
public final class dljr extends dsqw<dljr, dljk> implements dssk {
    public static final dljr k;
    private static volatile dssr<dljr> l;
    public int a;
    public String b = "";
    public dsrj<dlet> c = dssu.b;
    public long d;
    public dlix e;
    public dleh f;
    public dljo g;
    public dljm h;
    public dsrj<dljq> i;
    public boolean j;

    static {
        dljr dljrVar = new dljr();
        k = dljrVar;
        dsqw.cc(dljr.class, dljrVar);
    }

    private dljr() {
        dsqz dsqzVar = dsqz.b;
        this.i = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0003\u0013\t\u0000\u0002\u0000\u0003ဈ\u0004\u0006\u001b\u0007ဂ\u0005\bဉ\u0006\u000eဉ\f\u000fဉ\r\u0010\u001b\u0011ဇ\u000e\u0013ဉ\u0007", new Object[]{"a", "b", "c", dlet.class, "d", "e", "g", "h", "i", dljq.class, "j", "f"});
            }
            if (i2 == 3) {
                return new dljr();
            }
            if (i2 == 4) {
                return new dljk();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljr> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dljr.class) {
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
