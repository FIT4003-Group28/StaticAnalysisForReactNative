package defpackage;
/* compiled from: PG */
/* renamed from: dsic  reason: default package */
/* loaded from: classes6.dex */
public final class dsic extends dsqw<dsic, dsib> implements dssk {
    public static final dsic d;
    private static volatile dssr<dsic> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dsic dsicVar = new dsic();
        d = dsicVar;
        dsqw.cc(dsic.class, dsicVar);
    }

    private dsic() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsic();
            }
            if (i2 == 4) {
                return new dsib();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsic> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsic.class) {
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
