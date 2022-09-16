package defpackage;
/* compiled from: PG */
/* renamed from: dwsg  reason: default package */
/* loaded from: classes6.dex */
public final class dwsg extends dsqw<dwsg, dwsf> implements dssk {
    public static final dwsg d;
    private static volatile dssr<dwsg> e;
    public int a;
    public int b;
    public int c;

    static {
        dwsg dwsgVar = new dwsg();
        d = dwsgVar;
        dsqw.cc(dwsg.class, dwsgVar);
    }

    private dwsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dpyv.c(), "c", dqgh.c()});
            }
            if (i2 == 3) {
                return new dwsg();
            }
            if (i2 == 4) {
                return new dwsf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwsg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
