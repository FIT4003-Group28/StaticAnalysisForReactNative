package defpackage;
/* compiled from: PG */
/* renamed from: didg  reason: default package */
/* loaded from: classes6.dex */
public final class didg extends dsqw<didg, didf> implements dssk {
    public static final didg e;
    private static volatile dssr<didg> h;
    public int a;
    public dqcu d;
    private dnqh f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        didg didgVar = new didg();
        e = didgVar;
        dsqw.cc(didg.class, didgVar);
    }

    private didg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003\u0005ဉ\u0002", new Object[]{"a", "b", "c", "f", "d"});
            }
            if (i2 == 3) {
                return new didg();
            }
            if (i2 == 4) {
                return new didf();
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
            dssr<didg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (didg.class) {
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
