package defpackage;
/* compiled from: PG */
/* renamed from: dstn  reason: default package */
/* loaded from: classes6.dex */
public final class dstn extends dsqw<dstn, dstm> implements dssk {
    public static final dstn b;
    private static volatile dssr<dstn> c;
    public String a = "";

    static {
        dstn dstnVar = new dstn();
        b = dstnVar;
        dsqw.cc(dstn.class, dstnVar);
    }

    private dstn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dstn();
            }
            if (i2 == 4) {
                return new dstm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dstn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dstn.class) {
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
