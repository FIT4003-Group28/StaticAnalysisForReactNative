package defpackage;
/* compiled from: PG */
/* renamed from: dlpt  reason: default package */
/* loaded from: classes6.dex */
public final class dlpt extends dsqw<dlpt, dlpo> implements dssk {
    public static final dlpt l;
    private static volatile dssr<dlpt> n;
    public int a;
    public int b;
    public int c;
    public dlrj d;
    public dlrj e;
    public int f;
    public int g;
    public int h;
    public dlts j;
    public dlsw k;
    private byte m = 2;
    public dsri i = dsrx.b;

    static {
        dlpt dlptVar = new dlpt();
        l = dlptVar;
        dsqw.cc(dlpt.class, dlptVar);
    }

    private dlpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0002\u0001ဌ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ဌ\u0001\u0006ဌ\u0005\u0007ဌ\u0006\b\u0014\tဉ\u0007\nင\u0004\rဉ\b", new Object[]{"a", "b", dlps.a, "d", "e", "c", dlpp.a, "g", dlpq.a, "h", dltz.c(), "i", "j", "f", "k"});
            }
            if (i2 == 3) {
                return new dlpt();
            }
            if (i2 == 4) {
                return new dlpo();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dlpt> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dlpt.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
