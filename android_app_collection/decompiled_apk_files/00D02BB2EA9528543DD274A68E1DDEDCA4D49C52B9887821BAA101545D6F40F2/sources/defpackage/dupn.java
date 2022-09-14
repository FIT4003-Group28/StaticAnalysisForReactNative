package defpackage;
/* compiled from: PG */
/* renamed from: dupn  reason: default package */
/* loaded from: classes.dex */
public final class dupn extends dsqw<dupn, dupm> implements dssk {
    public static final dupn e;
    private static volatile dssr<dupn> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        dupn dupnVar = new dupn();
        e = dupnVar;
        dsqw.cc(dupn.class, dupnVar);
    }

    private dupn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dupn();
            }
            if (i2 == 4) {
                return new dupm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dupn.class) {
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
