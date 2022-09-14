package defpackage;
/* compiled from: PG */
/* renamed from: dolq  reason: default package */
/* loaded from: classes6.dex */
public final class dolq extends dsqw<dolq, dolp> implements dssk {
    public static final dolq e;
    private static volatile dssr<dolq> f;
    public int a;
    public String b = "";
    public dolk c;
    public dojz d;

    static {
        dolq dolqVar = new dolq();
        e = dolqVar;
        dsqw.cc(dolq.class, dolqVar);
    }

    private dolq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dolq();
            }
            if (i2 == 4) {
                return new dolp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dolq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dolq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
