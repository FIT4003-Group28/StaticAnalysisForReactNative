package defpackage;
/* compiled from: PG */
/* renamed from: dkre  reason: default package */
/* loaded from: classes.dex */
public final class dkre extends dsqw<dkre, dkpt> implements dssk {
    public static final dkre y;
    private static volatile dssr<dkre> z;
    public int a;
    public int b;
    public int c;
    public dkpm d;
    public boolean e;
    public dkmn i;
    public dkql j;
    public dkqf k;
    public dkqn l;
    public dkqz m;
    public dkvn n;
    public dkqr o;
    public dkqt p;
    public dkrb q;
    public dkrd r;
    public dkpz s;
    public int t;
    public boolean u;
    public dkqj v;
    public boolean w;
    public dsrj<dkpv> f = dssu.b;
    public dsrf g = dsqz.b;
    public dsrj<dkqb> h = dssu.b;
    public dsrf x = dsqz.b;

    static {
        dkre dkreVar = new dkre();
        y = dkreVar;
        dsqw.cc(dkre.class, dkreVar);
    }

    private dkre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(y, "\u0001\u0016\u0000\u0002\u0001=\u0016\u0000\u0004\u0000\u0001ဉ\u0001\u0005ဉ\u0007\bဉ\n\nဉ\f\fဇ\u0002\r\u001b\u000fဉ\u000f\u0010\u0016\u0012ဉ\u0011\u0014ဉ\u0014\u0015ဉ\u0003\u0016င\u0000\u0017ဉ\u0015\u0018ဉ\u0016\u001aဉ\u0017\u001d\u001b!ဉ'#ဇ)$ဌ(9ဉ0;ဇ6=\u0016", new Object[]{"a", "b", "d", "j", "k", "l", "e", "h", dkqb.class, "m", "g", "n", "o", "i", "c", "p", "q", "r", "f", dkpv.class, "s", "u", "t", dkqc.a, "v", "w", "x"});
            }
            if (i2 == 3) {
                return new dkre();
            }
            if (i2 == 4) {
                return new dkpt();
            }
            if (i2 == 5) {
                return y;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkre> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dkre.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(y);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
