package defpackage;
/* compiled from: PG */
/* renamed from: dtuy  reason: default package */
/* loaded from: classes6.dex */
public final class dtuy extends dsqw<dtuy, dtux> implements dssk {
    public static final dtuy c;
    private static volatile dssr<dtuy> d;
    public String a = "";
    public String b = "";

    static {
        dtuy dtuyVar = new dtuy();
        c = dtuyVar;
        dsqw.cc(dtuy.class, dtuyVar);
    }

    private dtuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtuy();
            }
            if (i2 == 4) {
                return new dtux();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtuy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtuy.class) {
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
