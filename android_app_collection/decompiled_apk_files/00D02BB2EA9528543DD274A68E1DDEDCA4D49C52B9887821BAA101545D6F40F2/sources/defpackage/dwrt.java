package defpackage;
/* compiled from: PG */
/* renamed from: dwrt  reason: default package */
/* loaded from: classes6.dex */
public final class dwrt extends dsqw<dwrt, dwrh> implements dssk {
    public static final dwrt e;
    private static volatile dssr<dwrt> f;
    public int a;
    public dwrq b;
    public dwrs c;
    public dwrj d;

    static {
        dwrt dwrtVar = new dwrt();
        e = dwrtVar;
        dsqw.cc(dwrt.class, dwrtVar);
    }

    private dwrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwrt();
            }
            if (i2 == 4) {
                return new dwrh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwrt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
