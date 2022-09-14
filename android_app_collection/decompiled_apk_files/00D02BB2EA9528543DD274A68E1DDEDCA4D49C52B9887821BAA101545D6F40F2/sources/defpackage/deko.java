package defpackage;
/* compiled from: PG */
/* renamed from: deko  reason: default package */
/* loaded from: classes6.dex */
public final class deko extends dsqw<deko, dekm> implements dssk {
    public static final deko s;
    private static volatile dssr<deko> t;
    public deks a;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int j;
    public int l;
    public deks m;
    public long n;
    public boolean p;
    public long r;
    public String b = "";
    public String c = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public String o = "";
    public String q = "";

    static {
        deko dekoVar = new deko();
        s = dekoVar;
        dsqw.cc(deko.class, dekoVar);
    }

    private deko() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0000\u0012\u0000\u0000\u0002\u0018\u0012\u0000\u0000\u0000\u0002\t\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\r\f\u0010Ȉ\u0011\u0004\u0013\t\u0014\u0002\u0015Ȉ\u0016\u0007\u0017Ȉ\u0018\u0002", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            }
            if (i2 == 3) {
                return new deko();
            }
            if (i2 == 4) {
                return new dekm();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deko> dssrVar = t;
            if (dssrVar == null) {
                synchronized (deko.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
