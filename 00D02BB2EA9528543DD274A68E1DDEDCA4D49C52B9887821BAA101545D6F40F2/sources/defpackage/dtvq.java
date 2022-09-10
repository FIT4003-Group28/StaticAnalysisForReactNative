package defpackage;
/* compiled from: PG */
/* renamed from: dtvq  reason: default package */
/* loaded from: classes6.dex */
public final class dtvq extends dsqw<dtvq, dtvp> implements dssk {
    public static final dtvq c;
    private static volatile dssr<dtvq> d;
    public String a = "";
    public String b = "";

    static {
        dtvq dtvqVar = new dtvq();
        c = dtvqVar;
        dsqw.cc(dtvq.class, dtvqVar);
    }

    private dtvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtvq();
            }
            if (i2 == 4) {
                return new dtvp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtvq.class) {
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
