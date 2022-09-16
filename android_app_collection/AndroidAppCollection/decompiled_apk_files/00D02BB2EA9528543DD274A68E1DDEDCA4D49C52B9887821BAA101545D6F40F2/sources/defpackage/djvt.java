package defpackage;
/* compiled from: PG */
/* renamed from: djvt  reason: default package */
/* loaded from: classes6.dex */
public final class djvt extends dsqw<djvt, djvo> implements dssk {
    public static final djvt b;
    private static volatile dssr<djvt> c;
    public dsrj<djvs> a = dssu.b;

    static {
        djvt djvtVar = new djvt();
        b = djvtVar;
        dsqw.cc(djvt.class, djvtVar);
    }

    private djvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djvs.class});
            }
            if (i2 == 3) {
                return new djvt();
            }
            if (i2 == 4) {
                return new djvo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djvt.class) {
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
