package defpackage;
/* compiled from: PG */
/* renamed from: dpjn  reason: default package */
/* loaded from: classes6.dex */
public final class dpjn extends dsqw<dpjn, dpjm> implements dssk {
    public static final dpjn m;
    private static volatile dssr<dpjn> o;
    public int a;
    public dpjx b;
    public dosw c;
    public dpjl d;
    public dhjx f;
    public int g;
    public dpbl h;
    public boolean j;
    public dnjf k;
    public dnwx l;
    private byte n = 2;
    public dsrj<dpca> e = dssu.b;
    public String i = "";

    static {
        dpjn dpjnVar = new dpjn();
        m = dpjnVar;
        dsqw.cc(dpjn.class, dpjnVar);
    }

    private dpjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u000bဉ\b\f\u001b\rဉ\t\u000eဌ\n\u0010ဈ\r\u0011ဉ\u000b\u0012ဇ\u000e\u0013ဉ\u000f\u0014ᐉ\u0010", new Object[]{"a", "b", "c", "d", "e", dpca.class, "f", "g", dntm.c(), "i", "h", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new dpjn();
            }
            if (i2 == 4) {
                return new dpjm();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<dpjn> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dpjn.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }
}
