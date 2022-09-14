package defpackage;
/* compiled from: PG */
/* renamed from: duux  reason: default package */
/* loaded from: classes.dex */
public final class duux extends dsqw<duux, duuq> implements dssk {
    public static final duux j;
    private static volatile dssr<duux> m;
    public boolean c;
    public boolean d;
    public boolean g;
    public duuu i;
    private int k;
    private int l;
    public String a = "gmm.iv";
    public dsrj<duuw> b = dssu.b;
    public String e = "";
    public String f = "https://maps.gstatic.com/mapfiles/annotations/icons/generic_2x.5.png";
    public int h = 3000;

    static {
        duux duuxVar = new duux();
        j = duuxVar;
        dsqw.cc(duux.class, duuxVar);
    }

    private duux() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0002\u0001$\t\u0000\u0001\u0000\u0001ဈ\u0000\u000e\u001b\u000fဇ\r\u0011ဇ\u000f\u001aဈ\u0015\u001fဈ\u001a ဇ\u001b!င\u001c$ဉ ", new Object[]{"k", "l", "a", "b", duuw.class, "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new duux();
            }
            if (i2 == 4) {
                return new duuq();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duux> dssrVar = m;
            if (dssrVar == null) {
                synchronized (duux.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
