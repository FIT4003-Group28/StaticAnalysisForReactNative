package defpackage;
/* compiled from: PG */
/* renamed from: dejk  reason: default package */
/* loaded from: classes6.dex */
public final class dejk extends dsqw<dejk, dejj> implements dssk {
    public static final dejk r;
    private static volatile dssr<dejk> s;
    public int a;
    public dejw b;
    public dejw d;
    public int e;
    public int g;
    public int h;
    public int i;
    public deju j;
    public int k;
    public dejs l;
    public int m;
    public dejq n;
    public dejo o;
    public dejm q;
    public String c = "";
    public String f = "";
    public String p = "";

    static {
        dejk dejkVar = new dejk();
        r = dejkVar;
        dsqw.cc(dejk.class, dejkVar);
    }

    private dejk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(r, "\u0000\u0011\u0000\u0000\u0001\u0014\u0011\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȉ\u0004\t\u0005\f\u0006Ȉ\u0007\f\b\u0004\t\f\n\t\u000b\u0004\f\t\r\f\u000e\t\u0010\t\u0011Ȉ\u0014\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            }
            if (i2 == 3) {
                return new dejk();
            }
            if (i2 == 4) {
                return new dejj();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejk> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dejk.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
