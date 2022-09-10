package defpackage;
/* compiled from: PG */
/* renamed from: dqmr  reason: default package */
/* loaded from: classes6.dex */
public final class dqmr extends dsqw<dqmr, dqmo> implements dssk {
    public static final dqmr h;
    private static volatile dssr<dqmr> i;
    public int a;
    public boolean e;
    public String b = "";
    public String c = "";
    public dsrj<dqmq> d = dssu.b;
    public String f = "";
    public String g = "";

    static {
        dqmr dqmrVar = new dqmr();
        h = dqmrVar;
        dsqw.cc(dqmr.class, dqmrVar);
    }

    private dqmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", "c", "e", "d", dqmq.class, "f", "g"});
            }
            if (i3 == 3) {
                return new dqmr();
            }
            if (i3 == 4) {
                return new dqmo();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqmr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqmr.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
