package defpackage;
/* compiled from: PG */
/* renamed from: dwmk  reason: default package */
/* loaded from: classes6.dex */
public final class dwmk extends dsqw<dwmk, dwlb> implements dssk {
    public static final dwmk r;
    private static volatile dssr<dwmk> t;
    public int a;
    public dwlh c;
    public dpot d;
    public int f;
    public int g;
    public boolean h;
    public dqwy j;
    public dqwy k;
    public dosf l;
    public boolean q;
    private byte s = 2;
    public String b = "";
    public dsrj<dwmj> e = dssu.b;
    public String i = "";
    public dsrj<dosf> m = dssu.b;
    public String n = "";
    public String o = "";
    public dsrj<dwfl> p = dssu.b;

    static {
        dwmk dwmkVar = new dwmk();
        r = dwmkVar;
        dsqw.cc(dwmk.class, dwmkVar);
    }

    private dwmk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0003\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003င\u0003\u0004ဇ\u0005\u0006ဉ\t\bဈ\f\tဈ\u0006\u000bဈ\r\f\u001b\r\u001b\u000eЛ\u000fဇ\u000e\u0010င\u0004\u0011ဉ\u0002\u0013ဉ\u0007\u0014ဉ\b", new Object[]{"a", "b", "c", "f", "h", "l", "n", "i", "o", "p", dwfl.class, "m", dosf.class, "e", dwmj.class, "q", "g", "d", "j", "k"});
            }
            if (i2 == 3) {
                return new dwmk();
            }
            if (i2 == 4) {
                return new dwlb();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<dwmk> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dwmk.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }
}
