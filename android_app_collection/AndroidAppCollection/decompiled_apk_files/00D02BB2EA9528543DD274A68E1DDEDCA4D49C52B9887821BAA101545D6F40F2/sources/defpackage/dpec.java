package defpackage;
/* compiled from: PG */
/* renamed from: dpec  reason: default package */
/* loaded from: classes6.dex */
public final class dpec extends dsqw<dpec, dpeb> implements dssk {
    public static final dpec o;
    private static volatile dssr<dpec> q;
    public int a;
    public int b;
    public dowb d;
    public dgas e;
    public dpci f;
    public dpgy g;
    public doyf h;
    public boolean i;
    public doxd k;
    public doxr l;
    public dquh m;
    private byte p = 2;
    public String c = "";
    public dsrj<dozz> j = dssu.b;
    public dsrj<dpce> n = dssu.b;

    static {
        dpec dpecVar = new dpec();
        o = dpecVar;
        dsqw.cc(dpec.class, dpecVar);
    }

    private dpec() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0002\u0005\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဇ\u0007\nЛ\u000bᐉ\b\fဉ\n\u000eဉ\t\u000fЛ", new Object[]{"a", "b", dqvj.d(), "c", "d", "e", "f", "g", "h", "i", "j", dozz.class, "k", "m", "l", "n", dpce.class});
            }
            if (i2 == 3) {
                return new dpec();
            }
            if (i2 == 4) {
                return new dpeb();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            }
            dssr<dpec> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dpec.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.p);
    }
}
