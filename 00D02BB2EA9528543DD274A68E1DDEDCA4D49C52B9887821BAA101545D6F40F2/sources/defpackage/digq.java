package defpackage;
/* compiled from: PG */
/* renamed from: digq  reason: default package */
/* loaded from: classes6.dex */
public final class digq extends dsqw<digq, digp> implements dssk {
    public static final digq h;
    private static volatile dssr<digq> i;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public drqz g;

    static {
        digq digqVar = new digq();
        h = digqVar;
        dsqw.cc(digq.class, digqVar);
    }

    private digq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0005\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            }
            if (i3 == 3) {
                return new digq();
            }
            if (i3 == 4) {
                return new digp();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<digq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (digq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
