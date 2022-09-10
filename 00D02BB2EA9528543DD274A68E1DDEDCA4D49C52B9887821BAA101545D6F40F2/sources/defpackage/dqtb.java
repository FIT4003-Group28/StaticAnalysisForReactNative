package defpackage;
/* compiled from: PG */
/* renamed from: dqtb  reason: default package */
/* loaded from: classes6.dex */
public final class dqtb extends dsqw<dqtb, dqta> implements dssk {
    public static final dqtb d;
    private static volatile dssr<dqtb> e;
    public int a;
    public dgly b;
    public int c;

    static {
        dqtb dqtbVar = new dqtb();
        d = dqtbVar;
        dsqw.cc(dqtb.class, dqtbVar);
    }

    private dqtb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqtb();
            }
            if (i2 == 4) {
                return new dqta();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqtb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
