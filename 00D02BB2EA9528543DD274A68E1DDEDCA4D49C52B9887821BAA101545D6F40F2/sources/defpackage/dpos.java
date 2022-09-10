package defpackage;
/* compiled from: PG */
/* renamed from: dpos  reason: default package */
/* loaded from: classes6.dex */
public final class dpos extends dsqw<dpos, dpor> implements dssk {
    public static final dpos d;
    private static volatile dssr<dpos> e;
    public int a;
    public dpqp b;
    public dprg c;

    static {
        dpos dposVar = new dpos();
        d = dposVar;
        dsqw.cc(dpos.class, dposVar);
    }

    private dpos() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpos();
            }
            if (i2 == 4) {
                return new dpor();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpos> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpos.class) {
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
