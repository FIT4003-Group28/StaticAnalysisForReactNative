package defpackage;
/* compiled from: PG */
/* renamed from: dnwb  reason: default package */
/* loaded from: classes.dex */
public final class dnwb extends dsqw<dnwb, dnvy> implements dssk {
    public static final dnwb i;
    private static volatile dssr<dnwb> j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dspd e = dspd.b;
    public String f = "";
    public String g = "";
    public dsrj<dnwa> h = dssu.b;

    static {
        dnwb dnwbVar = new dnwb();
        i = dnwbVar;
        dsqw.cc(dnwb.class, dnwbVar);
    }

    private dnwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0011\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u000eည\f\u000fဈ\r\u0010ဈ\u000e\u0011\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", dnwa.class});
            }
            if (i3 == 3) {
                return new dnwb();
            }
            if (i3 == 4) {
                return new dnvy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnwb> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dnwb.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
