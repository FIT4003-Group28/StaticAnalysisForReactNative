package defpackage;
/* compiled from: PG */
/* renamed from: dufy  reason: default package */
/* loaded from: classes6.dex */
public final class dufy extends dsqw<dufy, dufx> implements dssk {
    public static final dufy d;
    private static volatile dssr<dufy> f;
    public dufm a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dufy dufyVar = new dufy();
        d = dufyVar;
        dsqw.cc(dufy.class, dufyVar);
    }

    private dufy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0004", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dufy();
            }
            if (i2 == 4) {
                return new dufx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dufy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
