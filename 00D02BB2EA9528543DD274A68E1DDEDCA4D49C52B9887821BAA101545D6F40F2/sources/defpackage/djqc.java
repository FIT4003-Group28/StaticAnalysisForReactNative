package defpackage;
/* compiled from: PG */
/* renamed from: djqc  reason: default package */
/* loaded from: classes6.dex */
public final class djqc extends dsqw<djqc, djqb> implements dssk {
    public static final djqc e;
    private static volatile dssr<djqc> g;
    public djqi c;
    private int f;
    public String a = "";
    public String b = "";
    public dsrj<djqe> d = dssu.b;

    static {
        djqc djqcVar = new djqc();
        e = djqcVar;
        dsqw.cc(djqc.class, djqcVar);
    }

    private djqc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"f", "a", "b", "c", "d", djqe.class});
            }
            if (i2 == 3) {
                return new djqc();
            }
            if (i2 == 4) {
                return new djqb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djqc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
