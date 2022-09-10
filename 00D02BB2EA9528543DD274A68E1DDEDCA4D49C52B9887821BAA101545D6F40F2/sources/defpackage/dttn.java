package defpackage;
/* compiled from: PG */
/* renamed from: dttn  reason: default package */
/* loaded from: classes6.dex */
public final class dttn extends dsqw<dttn, dttm> implements dssk {
    public static final dttn b;
    private static volatile dssr<dttn> c;
    public dttp a;

    static {
        dttn dttnVar = new dttn();
        b = dttnVar;
        dsqw.cc(dttn.class, dttnVar);
    }

    private dttn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dttn();
            }
            if (i2 == 4) {
                return new dttm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dttn.class) {
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
