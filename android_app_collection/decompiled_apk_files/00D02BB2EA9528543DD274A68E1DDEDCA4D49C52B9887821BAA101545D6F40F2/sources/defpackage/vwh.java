package defpackage;
/* compiled from: PG */
/* renamed from: vwh  reason: default package */
/* loaded from: classes7.dex */
public final class vwh extends dsqw<vwh, vwa> implements dssk {
    public static final vwh n;
    private static volatile dssr<vwh> o;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public dsrf i = dsqz.b;
    public String j = "";
    public String k = "";
    public boolean l;
    public vwg m;

    static {
        vwh vwhVar = new vwh();
        n = vwhVar;
        dsqw.cc(vwh.class, vwhVar);
    }

    private vwh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\b\u001d\tဈ\u0007\nဈ\b\u000bဇ\t\fဉ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new vwh();
            }
            if (i2 == 4) {
                return new vwa();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vwh> dssrVar = o;
            if (dssrVar == null) {
                synchronized (vwh.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
