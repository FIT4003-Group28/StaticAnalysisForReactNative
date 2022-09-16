package defpackage;
/* compiled from: PG */
/* renamed from: ddqk  reason: default package */
/* loaded from: classes.dex */
public final class ddqk extends dsqw<ddqk, ddqc> implements dssk {
    public static final ddqk h;
    private static volatile dssr<ddqk> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ddqg g;

    static {
        ddqk ddqkVar = new ddqk();
        h = ddqkVar;
        dsqw.cc(ddqk.class, ddqkVar);
    }

    private ddqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0004\u0005ဌ\u0003\u0006ဉ\u0005", new Object[]{"a", "b", "c", ddqh.a, "d", ddqi.a, "f", ddqj.a, "e", ddqi.a, "g"});
            }
            if (i3 == 3) {
                return new ddqk();
            }
            if (i3 == 4) {
                return new ddqc();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddqk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ddqk.class) {
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
