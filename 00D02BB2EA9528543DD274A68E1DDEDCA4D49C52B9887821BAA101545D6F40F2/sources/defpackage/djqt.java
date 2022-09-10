package defpackage;
/* compiled from: PG */
/* renamed from: djqt  reason: default package */
/* loaded from: classes6.dex */
public final class djqt extends dsqw<djqt, djqs> implements dssk {
    public static final djqt c;
    private static volatile dssr<djqt> d;
    public dsrj<dpsn> a = dssu.b;
    public dsrj<djqv> b = dssu.b;

    static {
        djqt djqtVar = new djqt();
        c = djqtVar;
        dsqw.cc(djqt.class, djqtVar);
    }

    private djqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dpsn.class, "b", djqv.class});
            }
            if (i2 == 3) {
                return new djqt();
            }
            if (i2 == 4) {
                return new djqs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djqt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
