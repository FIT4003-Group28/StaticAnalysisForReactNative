package defpackage;
/* compiled from: PG */
/* renamed from: dgyq  reason: default package */
/* loaded from: classes6.dex */
public final class dgyq extends dsqw<dgyq, dgyp> implements dssk {
    public static final dgyq c;
    private static volatile dssr<dgyq> d;
    public int a = 0;
    public Object b;

    static {
        dgyq dgyqVar = new dgyq();
        c = dgyqVar;
        dsqw.cc(dgyq.class, dgyqVar);
    }

    private dgyq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dgyq();
            }
            if (i2 == 4) {
                return new dgyp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgyq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgyq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
