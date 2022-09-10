package defpackage;
/* compiled from: PG */
/* renamed from: dsig  reason: default package */
/* loaded from: classes6.dex */
public final class dsig extends dsqw<dsig, dsid> implements dssk {
    public static final dsig d;
    private static volatile dssr<dsig> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dsig dsigVar = new dsig();
        d = dsigVar;
        dsqw.cc(dsig.class, dsigVar);
    }

    private dsig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dsie.a});
            }
            if (i2 == 3) {
                return new dsig();
            }
            if (i2 == 4) {
                return new dsid();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsig> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsig.class) {
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
