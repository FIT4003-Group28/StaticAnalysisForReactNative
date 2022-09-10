package defpackage;
/* compiled from: PG */
/* renamed from: dvxh  reason: default package */
/* loaded from: classes.dex */
public final class dvxh extends dsqs<dvxh, dvxc> implements dsqt {
    public static final dvxh B;
    private static volatile dssr<dvxh> D;
    public dfyz A;
    public int a;
    public dpmv c;
    public doco d;
    public dvyy e;
    public boolean f;
    public dqio g;
    public dnpq h;
    public djqg i;
    public dnpq j;
    public dgsl k;
    public dgfs l;
    public dqii m;
    public dors o;
    public dnie p;
    public dwfl q;
    public boolean r;
    public dnzt s;
    public dnpq t;
    public dnpq u;
    public dvwi v;
    public dvxg x;
    public drdq y;
    public dvxe z;
    private byte C = 2;
    public dsrj<dgfy> b = dssu.b;
    public dsrj<dqii> n = dssu.b;
    public String w = "";

    static {
        dvxh dvxhVar = new dvxh();
        B = dvxhVar;
        dsqw.cc(dvxh.class, dvxhVar);
    }

    private dvxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(B, "\u0001\u001a\u0000\u0001\u0002(\u001a\u0000\u0002\u0001\u0002ᐉ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ဉ\u0006\u0007ဉ\t\tဉ\n\u000bဉ\u000e\fဉ\u000f\rဉ\u0010\u0011ဉ\u0013\u0015ဉ\u0016\u001a\u001b\u001bဇ\u0011\u001cဉ\b\u001dဉ\u0018\u001eဉ\r\u001fဈ\u0019 ဉ\u0005!ဉ\u001a\"ဉ\u001b#ဉ\u0017$ဉ\u0000%\u001b&ဉ\u001c'ဉ\u001d(ဉ\f", new Object[]{"a", "d", "e", "f", "h", "j", "k", "o", "p", "q", "s", "t", "n", dqii.class, "r", "i", "v", "m", "w", "g", "x", "y", "u", "c", "b", dgfy.class, "z", "A", "l"});
            }
            if (i2 == 3) {
                return new dvxh();
            }
            if (i2 == 4) {
                return new dvxc();
            }
            if (i2 == 5) {
                return B;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.C = b;
                return null;
            }
            dssr<dvxh> dssrVar = D;
            if (dssrVar == null) {
                synchronized (dvxh.class) {
                    dssrVar = D;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(B);
                        D = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.C);
    }
}
