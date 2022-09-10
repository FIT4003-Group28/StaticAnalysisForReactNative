package defpackage;
/* compiled from: PG */
/* renamed from: dopk  reason: default package */
/* loaded from: classes.dex */
public final class dopk extends dsqw<dopk, dopb> implements dssk {
    public static final dopk x;
    private static volatile dssr<dopk> z;
    public int a;
    public dnoh g;
    public int i;
    public boolean j;
    public long o;
    public dpyn p;
    public doou q;
    public int v;
    private byte y = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public dsrj<doph> e = dssu.b;
    public dsrj<doom> f = dssu.b;
    public String h = "";
    public dsrj<dpgh> k = dssu.b;
    public dsrj<dozz> l = dssu.b;
    public String m = "";
    public String n = "";
    public dsrj<dode> r = dssu.b;
    public dsrj<doud> s = dssu.b;
    public dsrj<drij> t = dssu.b;
    public dsrj<dopj> u = dssu.b;
    public dsrj<dopf> w = dssu.b;

    static {
        dopk dopkVar = new dopk();
        x = dopkVar;
        dsqw.cc(dopk.class, dopkVar);
    }

    private dopk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0016\u0000\u0001\u0001\u001d\u0016\u0000\t\u0006\u0001ဈ\u0000\u0002Л\u0004ဇ\u0007\u0007\u001b\tဈ\u0002\u000bဉ\u0003\fЛ\u000eဈ\u0001\u000fဈ\f\u0010ဈ\u0004\u0011Л\u0012ဌ\u0006\u0013ဈ\r\u0014ဂ\u000e\u0016ဉ\u000f\u0017ᐉ\u0010\u0018Л\u0019\u001b\u001a\u001b\u001b\u001b\u001cင\u0011\u001dЛ", new Object[]{"a", "b", "f", doom.class, "j", "k", dpgh.class, "d", "g", "l", dozz.class, "c", "m", "h", "e", doph.class, "i", dpkg.a, "n", "o", "p", "q", "r", dode.class, "u", dopj.class, "s", doud.class, "t", drij.class, "v", "w", dopf.class});
            }
            if (i2 == 3) {
                return new dopk();
            }
            if (i2 == 4) {
                return new dopb();
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<dopk> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dopk.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(x);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }
}
