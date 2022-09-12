package defpackage;
/* compiled from: PG */
/* renamed from: dupy  reason: default package */
/* loaded from: classes.dex */
public final class dupy extends dsqw<dupy, dupv> implements dssk {
    public static final dsrg<Integer, dprz> b = new dupu();
    public static final dupy o;
    private static volatile dssr<dupy> q;
    public dsrf a;
    public dsrj<drlr> c;
    public dsrj<dupx> d;
    public boolean e;
    public String f;
    public drlp g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    private int p;

    static {
        dupy dupyVar = new dupy();
        o = dupyVar;
        dsqw.cc(dupy.class, dupyVar);
    }

    private dupy() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
        this.a = dsqz.b;
        this.c = dssu.b;
        this.d = dssu.b;
        this.f = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0002\u0010\r\u0000\u0003\u0000\u0002ဇ\u0000\u0004ဈ\u0001\u0006ဉ\u0002\u0007ဇ\u0003\bဇ\u0004\t\u001e\n\u001b\u000bဇ\u0005\fဇ\u0006\rင\u0007\u000eင\b\u000fဇ\t\u0010\u001b", new Object[]{"p", "e", "f", "g", "h", "i", "a", dprz.c(), "c", drlr.class, "j", "k", "l", "m", "n", "d", dupx.class});
            }
            if (i2 == 3) {
                return new dupy();
            }
            if (i2 == 4) {
                return new dupv();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupy> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dupy.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
