package defpackage;
/* compiled from: PG */
/* renamed from: dwrq  reason: default package */
/* loaded from: classes6.dex */
public final class dwrq extends dsqw<dwrq, dwrk> implements dssk {
    public static final dwrq c;
    private static volatile dssr<dwrq> d;
    public dsrf a = dsqz.b;
    public dsrj<dwrp> b = dssu.b;

    static {
        dwrq dwrqVar = new dwrq();
        c = dwrqVar;
        dsqw.cc(dwrq.class, dwrqVar);
    }

    private dwrq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", dwrm.c(), "b", dwrp.class});
            }
            if (i2 == 3) {
                return new dwrq();
            }
            if (i2 == 4) {
                return new dwrk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwrq.class) {
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
