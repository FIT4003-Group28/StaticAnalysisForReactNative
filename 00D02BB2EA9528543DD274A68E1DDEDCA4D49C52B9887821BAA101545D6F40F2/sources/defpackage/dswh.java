package defpackage;
/* compiled from: PG */
/* renamed from: dswh  reason: default package */
/* loaded from: classes6.dex */
public final class dswh extends dsqw<dswh, dswe> implements dssk {
    public static final dswh b;
    private static volatile dssr<dswh> c;
    public dsrj<dswg> a = dssu.b;

    static {
        dswh dswhVar = new dswh();
        b = dswhVar;
        dsqw.cc(dswh.class, dswhVar);
    }

    private dswh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dswg.class});
            }
            if (i2 == 3) {
                return new dswh();
            }
            if (i2 == 4) {
                return new dswe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dswh.class) {
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
