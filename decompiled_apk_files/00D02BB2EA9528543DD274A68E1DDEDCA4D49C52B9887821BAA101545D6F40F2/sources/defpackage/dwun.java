package defpackage;
/* compiled from: PG */
/* renamed from: dwun  reason: default package */
/* loaded from: classes6.dex */
public final class dwun extends dsqs<dwun, dwum> implements dsqt {
    public static final dwun w;
    private static volatile dssr<dwun> z;
    public int a;
    public long c;
    public dnqh e;
    public boolean h;
    public boolean i;
    public boolean j;
    public ddmk l;
    public ddna m;
    public dvnq n;
    public dvkw o;
    public dwwv p;
    public dofv q;
    public dvfy r;
    public dnop t;
    public dvra u;
    public eacd v;
    private dvui x;
    private byte y = 2;
    public dsrj<dtaq> b = dssu.b;
    public String d = "";
    public dsrj<dwxd> f = dssu.b;
    public dsrj<ddhk> g = dssu.b;
    public dsrj<duss> k = dssu.b;
    public dsrj<doem> s = dssu.b;

    static {
        dwun dwunVar = new dwun();
        w = dwunVar;
        dsqw.cc(dwun.class, dwunVar);
    }

    private dwun() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(w, "\u0001\u0016\u0000\u0001\u0001!\u0016\u0000\u0005\b\u0001\u001b\u0002ဂ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0007\u0005ဈ\u0001\u0006Л\u0011ဉ\b\u0012ဉ\t\u0013ဉ\n\u0014ᐉ\u000b\u0015ဉ\f\u0016ᐉ\r\u0017\u001b\u0018ဉ\u000f\u0019ᐉ\u0010\u001aဇ\u0003\u001bဉ\u000e\u001dЛ\u001eဇ\u0005\u001fဇ\u0004 Л!ဉ\u0006", new Object[]{"a", "b", dtaq.class, "c", "e", "m", "d", "g", ddhk.class, "n", "x", "o", "p", "q", "r", "s", doem.class, "u", "v", "h", "t", "f", dwxd.class, "j", "i", "k", duss.class, "l"});
            }
            if (i2 == 3) {
                return new dwun();
            }
            if (i2 == 4) {
                return new dwum();
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<dwun> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dwun.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(w);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }
}
