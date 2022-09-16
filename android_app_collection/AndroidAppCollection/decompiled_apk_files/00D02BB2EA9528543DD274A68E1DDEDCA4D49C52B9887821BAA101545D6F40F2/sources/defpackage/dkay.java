package defpackage;
/* compiled from: PG */
/* renamed from: dkay  reason: default package */
/* loaded from: classes6.dex */
public final class dkay extends dsqw<dkay, dkax> implements dssk {
    public static final dkay f;
    private static volatile dssr<dkay> h;
    public int a;
    public dgac c;
    public dqoj d;
    public dnqh e;
    private byte g = 2;
    public String b = "";

    static {
        dkay dkayVar = new dkay();
        f = dkayVar;
        dsqw.cc(dkay.class, dkayVar);
    }

    private dkay() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0005ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new dkay();
            }
            if (i2 == 4) {
                return new dkax();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dkay> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkay.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
