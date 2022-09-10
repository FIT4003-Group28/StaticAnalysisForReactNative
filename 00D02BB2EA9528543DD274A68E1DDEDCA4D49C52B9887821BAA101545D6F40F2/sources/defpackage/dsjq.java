package defpackage;
/* compiled from: PG */
/* renamed from: dsjq  reason: default package */
/* loaded from: classes6.dex */
public final class dsjq extends dsqw<dsjq, dsjp> implements dssk {
    public static final dsjq c;
    private static volatile dssr<dsjq> e;
    public int a;
    public int b;
    private int d;

    static {
        dsjq dsjqVar = new dsjq();
        c = dsjqVar;
        dsqw.cc(dsjq.class, dsjqVar);
    }

    private dsjq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dsjr.a});
            }
            if (i2 == 3) {
                return new dsjq();
            }
            if (i2 == 4) {
                return new dsjp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsjq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsjq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
