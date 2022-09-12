package defpackage;
/* compiled from: PG */
/* renamed from: bbvt  reason: default package */
/* loaded from: classes3.dex */
public final class bbvt extends dsqw<bbvt, bbvo> implements dssk {
    public static final bbvt b;
    private static volatile dssr<bbvt> c;
    public dsrj<bbvs> a = dssu.b;

    static {
        bbvt bbvtVar = new bbvt();
        b = bbvtVar;
        dsqw.cc(bbvt.class, bbvtVar);
    }

    private bbvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bbvs.class});
            }
            if (i2 == 3) {
                return new bbvt();
            }
            if (i2 == 4) {
                return new bbvo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bbvt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bbvt.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
