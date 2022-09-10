package defpackage;
/* compiled from: PG */
/* renamed from: dkpm  reason: default package */
/* loaded from: classes.dex */
public final class dkpm extends dsqw<dkpm, dkpj> implements dssk {
    public static final dkpm k;
    private static volatile dssr<dkpm> m;
    public boolean a;
    public dkpi b;
    public dkpi c;
    public dsrj<dkpl> d = dssu.b;
    public dkpi e;
    public dkpi f;
    public dkpi g;
    public dkpi h;
    public dkpi i;
    public dkpi j;
    private int l;

    static {
        dkpm dkpmVar = new dkpm();
        k = dkpmVar;
        dsqw.cc(dkpm.class, dkpmVar);
    }

    private dkpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\b\u001b\tဉ\u0007\u000bဉ\t\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e", new Object[]{"l", "a", "b", "c", "d", dkpl.class, "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dkpm();
            }
            if (i2 == 4) {
                return new dkpj();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpm> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dkpm.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
