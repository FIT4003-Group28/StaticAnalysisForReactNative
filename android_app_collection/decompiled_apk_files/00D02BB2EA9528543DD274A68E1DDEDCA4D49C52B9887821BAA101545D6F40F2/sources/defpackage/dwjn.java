package defpackage;
/* compiled from: PG */
/* renamed from: dwjn  reason: default package */
/* loaded from: classes6.dex */
public final class dwjn extends dsqw<dwjn, dwjk> implements dssk {
    public static final dwjn p;
    private static volatile dssr<dwjn> s;
    public int a;
    public boolean c;
    public int d;
    public dhjx e;
    public dovx f;
    public int g;
    public dtaq h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    private dnqh q;
    private byte r = 2;
    public String b = "";

    static {
        dwjn dwjnVar = new dwjn();
        p = dwjnVar;
        dsqw.cc(dwjn.class, dwjnVar);
    }

    private dwjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(p, "\u0001\u000f\u0000\u0001\u0001\u001a\u000f\u0000\u0000\u0002\u0001ဈ\u0000\u0002င\u0002\u0003ဉ\u0003\u0004ᐉ\u0004\u0007ဌ\u0007\bဉ\b\tᐉ\t\u000bဇ\u000b\fဌ\u000e\rဇ\f\u0010ဇ\u0001\u0011ဇ\u000f\u0014ဇ\u0012\u0015ဇ\u0013\u001aဇ\u0018", new Object[]{"a", "b", "d", "e", "f", "g", dxbd.a, "h", "q", "i", "k", dwjm.c(), "j", "c", "l", "m", "n", "o"});
            }
            if (i2 == 3) {
                return new dwjn();
            }
            if (i2 == 4) {
                return new dwjk();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dwjn> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dwjn.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
