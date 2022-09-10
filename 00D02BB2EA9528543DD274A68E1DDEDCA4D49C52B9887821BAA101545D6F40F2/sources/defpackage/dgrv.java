package defpackage;
/* compiled from: PG */
/* renamed from: dgrv  reason: default package */
/* loaded from: classes6.dex */
public final class dgrv extends dsqw<dgrv, dgru> implements dssk {
    public static final dgrv a;
    private static volatile dssr<dgrv> h;
    private int b;
    private dgrh c;
    private dgrh d;
    private dgqx e;
    private dgqx f;
    private byte g = 2;

    static {
        dgrv dgrvVar = new dgrv();
        a = dgrvVar;
        dsqw.cc(dgrv.class, dgrvVar);
    }

    private dgrv() {
        dssu<Object> dssuVar = dssu.b;
        dsqk dsqkVar = dsqk.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0004\u0000\u0001\u0001\u0019\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0004ᐉ\u0003\u0018ᐉ\u0017\u0019ᐉ\u0018", new Object[]{"b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dgrv();
            }
            if (i2 == 4) {
                return new dgru();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dgrv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dgrv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
