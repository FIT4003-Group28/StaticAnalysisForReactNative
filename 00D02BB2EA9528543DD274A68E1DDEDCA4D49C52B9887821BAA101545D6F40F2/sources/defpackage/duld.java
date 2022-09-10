package defpackage;
/* compiled from: PG */
/* renamed from: duld  reason: default package */
/* loaded from: classes6.dex */
public final class duld extends dsqw<duld, dulc> implements dssk {
    public static final duld f;
    private static volatile dssr<duld> u;
    public duvr a;
    public duvp b;
    public duvn c;
    public duvl d;
    public duuz e;
    private int g;
    private int h;
    private dvsd i;
    private duvf j;
    private duvb k;
    private dvss l;
    private dwxh m;
    private duox n;
    private duvd o;
    private dwiz p;
    private dunw q;
    private duvj r;
    private duvh s;
    private byte t = 2;

    static {
        duld duldVar = new duld();
        f = duldVar;
        dsqw.cc(duld.class, duldVar);
    }

    private duld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0010\u0000\u0002\u0001/\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0003ᐉ\u0002\u0006ᐉ\f\u000fᐉ\u0004\u0010ᐉ\u0013\u0012ᐉ\u0006\u0017ဉ\u0016\u0018ᐉ\u0018\u001aᐉ\u001c\u001eᐉ!!ဉ\u0017'ᐉ&+ᐉ*,ᐉ+-ᐉ,/ᐉ.", new Object[]{"g", "h", "i", "j", "m", "k", "n", "l", "a", "o", "p", "q", "b", "r", "c", "s", "d", "e"});
            }
            if (i2 == 3) {
                return new duld();
            }
            if (i2 == 4) {
                return new dulc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            }
            dssr<duld> dssrVar = u;
            if (dssrVar == null) {
                synchronized (duld.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.t);
    }
}
