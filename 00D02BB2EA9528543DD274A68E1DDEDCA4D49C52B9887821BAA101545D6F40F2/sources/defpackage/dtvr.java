package defpackage;
/* compiled from: PG */
/* renamed from: dtvr  reason: default package */
/* loaded from: classes6.dex */
public final class dtvr extends dsqw<dtvr, dtvo> implements dssk {
    public static final dtvr b;
    private static volatile dssr<dtvr> c;
    public dsrj<dtvq> a = dssu.b;

    static {
        dtvr dtvrVar = new dtvr();
        b = dtvrVar;
        dsqw.cc(dtvr.class, dtvrVar);
    }

    private dtvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtvq.class});
            }
            if (i2 == 3) {
                return new dtvr();
            }
            if (i2 == 4) {
                return new dtvo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtvr.class) {
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
