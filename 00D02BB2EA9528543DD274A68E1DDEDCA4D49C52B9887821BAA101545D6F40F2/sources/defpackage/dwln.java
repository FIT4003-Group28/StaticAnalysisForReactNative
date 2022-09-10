package defpackage;
/* compiled from: PG */
/* renamed from: dwln  reason: default package */
/* loaded from: classes6.dex */
public final class dwln extends dsqw<dwln, dwlm> implements dssk {
    public static final dwln d;
    private static volatile dssr<dwln> f;
    public dppt a;
    public drdg b;
    public dpvc c;
    private int e;

    static {
        dwln dwlnVar = new dwln();
        d = dwlnVar;
        dsqw.cc(dwln.class, dwlnVar);
    }

    private dwln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwln();
            }
            if (i2 == 4) {
                return new dwlm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwln> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwln.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
