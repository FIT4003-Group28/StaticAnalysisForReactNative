package defpackage;
/* compiled from: PG */
/* renamed from: dvan  reason: default package */
/* loaded from: classes6.dex */
public final class dvan extends dsqw<dvan, dvam> implements dssk {
    public static final dvan d;
    private static volatile dssr<dvan> e;
    public int a;
    public dwfl b;
    public dqfz c;

    static {
        dvan dvanVar = new dvan();
        d = dvanVar;
        dsqw.cc(dvan.class, dvanVar);
    }

    private dvan() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvan();
            }
            if (i2 == 4) {
                return new dvam();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvan> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvan.class) {
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
