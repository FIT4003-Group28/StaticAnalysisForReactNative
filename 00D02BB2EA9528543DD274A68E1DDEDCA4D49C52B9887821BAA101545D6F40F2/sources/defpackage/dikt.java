package defpackage;
/* compiled from: PG */
/* renamed from: dikt  reason: default package */
/* loaded from: classes6.dex */
public final class dikt extends dsqw<dikt, dikq> implements dssk {
    public static final dikt b;
    private static volatile dssr<dikt> c;
    public dsrj<diks> a = dssu.b;

    static {
        dikt diktVar = new dikt();
        b = diktVar;
        dsqw.cc(dikt.class, diktVar);
    }

    private dikt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", diks.class});
            }
            if (i2 == 3) {
                return new dikt();
            }
            if (i2 == 4) {
                return new dikq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dikt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dikt.class) {
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
