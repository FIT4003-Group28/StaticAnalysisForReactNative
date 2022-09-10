package defpackage;
/* compiled from: PG */
/* renamed from: dwul  reason: default package */
/* loaded from: classes6.dex */
public final class dwul extends dsqs<dwul, dwtn> implements dsqt {
    public static final dwul t;
    private static volatile dssr<dwul> v;
    public int a;
    public dori b;
    public dqwe c;
    public dwty f;
    public dwtu g;
    public dwui h;
    public boolean i;
    public dkfx k;
    public dwts l;
    public dpwf m;
    public dpvx n;
    public dpvt o;
    public dqkh p;
    public dqam q;
    private byte u = 2;
    public dsrj<dkcq> d = dssu.b;
    public String e = "";
    public String j = "";
    public dsrj<dwmk> r = dssu.b;
    public dsrj<dwue> s = dssu.b;

    static {
        dwul dwulVar = new dwul();
        t = dwulVar;
        dsqw.cc(dwul.class, dwulVar);
    }

    private dwul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(t, "\u0001\u0012\u0000\u0001\u0001\u0016\u0012\u0000\u0003\u0004\u0001ᐉ\u0000\u0002ဉ\u0001\u0003Л\u0004ဈ\u0002\u0007ဇ\b\tဉ\u0005\nဉ\u0007\u000bဈ\t\rဉ\u000b\u000eᐉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014Л\u0015\u001b\u0016ဉ\u0006", new Object[]{"a", "b", "c", "d", dkcq.class, "e", "i", "f", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", dwmk.class, "s", dwue.class, "g"});
            }
            if (i2 == 3) {
                return new dwul();
            }
            if (i2 == 4) {
                return new dwtn();
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            }
            dssr<dwul> dssrVar = v;
            if (dssrVar == null) {
                synchronized (dwul.class) {
                    dssrVar = v;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(t);
                        v = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.u);
    }
}
