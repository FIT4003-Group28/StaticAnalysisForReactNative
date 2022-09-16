package defpackage;
/* compiled from: PG */
/* renamed from: dwkq  reason: default package */
/* loaded from: classes6.dex */
public final class dwkq extends dsqw<dwkq, dwkp> implements dssk {
    public static final dwkq c;
    private static volatile dssr<dwkq> d;
    public int a;
    public drdi b;

    static {
        dwkq dwkqVar = new dwkq();
        c = dwkqVar;
        dsqw.cc(dwkq.class, dwkqVar);
    }

    private dwkq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwkq();
            }
            if (i2 == 4) {
                return new dwkp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwkq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwkq.class) {
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
