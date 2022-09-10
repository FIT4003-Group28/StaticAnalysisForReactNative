package defpackage;
/* compiled from: PG */
/* renamed from: djud  reason: default package */
/* loaded from: classes6.dex */
public final class djud extends dsqw<djud, djuc> implements dssk {
    public static final djud e;
    private static volatile dssr<djud> h;
    public int a;
    private dnqh f;
    private byte g = 2;
    public dspd b = dspd.b;
    public String c = "";
    public String d = "";

    static {
        djud djudVar = new djud();
        e = djudVar;
        dsqw.cc(djud.class, djudVar);
    }

    private djud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0003\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "f", "c", "d"});
            }
            if (i2 == 3) {
                return new djud();
            }
            if (i2 == 4) {
                return new djuc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<djud> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djud.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
