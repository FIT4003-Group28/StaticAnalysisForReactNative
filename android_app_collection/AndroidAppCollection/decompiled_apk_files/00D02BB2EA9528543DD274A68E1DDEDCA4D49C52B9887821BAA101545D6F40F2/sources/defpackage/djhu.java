package defpackage;
/* compiled from: PG */
/* renamed from: djhu  reason: default package */
/* loaded from: classes6.dex */
public final class djhu extends dsqw<djhu, djht> implements dssk {
    public static final djhu f;
    private static volatile dssr<djhu> h;
    public int a;
    public djdm b;
    public djfl c;
    public djgh d;
    private byte g = 2;
    public boolean e = true;

    static {
        djhu djhuVar = new djhu();
        f = djhuVar;
        dsqw.cc(djhu.class, djhuVar);
    }

    private djhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new djhu();
            }
            if (i2 == 4) {
                return new djht();
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
            dssr<djhu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djhu.class) {
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
