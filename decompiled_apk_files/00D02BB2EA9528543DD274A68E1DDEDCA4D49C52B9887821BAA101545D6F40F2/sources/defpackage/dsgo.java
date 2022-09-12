package defpackage;
/* compiled from: PG */
/* renamed from: dsgo  reason: default package */
/* loaded from: classes6.dex */
public final class dsgo extends dsqw<dsgo, dsgn> implements dssk {
    public static final dsgo d;
    private static volatile dssr<dsgo> e;
    public int a;
    public daxu b;
    public boolean c;

    static {
        dsgo dsgoVar = new dsgo();
        d = dsgoVar;
        dsqw.cc(dsgo.class, dsgoVar);
    }

    private dsgo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsgo();
            }
            if (i2 == 4) {
                return new dsgn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsgo.class) {
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
