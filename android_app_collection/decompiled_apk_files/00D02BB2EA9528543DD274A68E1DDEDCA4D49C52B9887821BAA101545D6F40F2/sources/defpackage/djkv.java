package defpackage;
/* compiled from: PG */
/* renamed from: djkv  reason: default package */
/* loaded from: classes6.dex */
public final class djkv extends dsqw<djkv, djku> implements dssk {
    public static final djkv a;
    private static volatile dssr<djkv> b;

    static {
        djkv djkvVar = new djkv();
        a = djkvVar;
        dsqw.cc(djkv.class, djkvVar);
    }

    private djkv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djkv();
            }
            if (i2 == 4) {
                return new djku();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djkv.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
