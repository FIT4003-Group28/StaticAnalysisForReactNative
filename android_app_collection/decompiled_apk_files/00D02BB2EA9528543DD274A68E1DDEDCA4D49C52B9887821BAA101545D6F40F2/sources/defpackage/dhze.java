package defpackage;
/* compiled from: PG */
/* renamed from: dhze  reason: default package */
/* loaded from: classes.dex */
public final class dhze extends dsqw<dhze, dhyz> implements dssk {
    public static final dhze m;
    private static volatile dssr<dhze> n;
    public int a;
    public dhzb b;
    public int c;
    public int d;
    public dreg h;
    public dhzd k;
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public dsrj<drek> l = dssu.b;

    static {
        dhze dhzeVar = new dhze();
        m = dhzeVar;
        dsqw.cc(dhze.class, dhzeVar);
    }

    private dhze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0007\bဉ\t\tဈ\b\n\u001b\u000bဈ\u0005\fဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "i", "k", "j", "l", drek.class, "g", "h"});
            }
            if (i2 == 3) {
                return new dhze();
            }
            if (i2 == 4) {
                return new dhyz();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhze> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dhze.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
