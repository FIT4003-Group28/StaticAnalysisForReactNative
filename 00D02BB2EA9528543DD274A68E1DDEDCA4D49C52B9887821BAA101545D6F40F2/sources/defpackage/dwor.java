package defpackage;
/* compiled from: PG */
/* renamed from: dwor  reason: default package */
/* loaded from: classes.dex */
public final class dwor extends dsqw<dwor, dwoq> implements dssk {
    public static final dwor b;
    private static volatile dssr<dwor> d;
    public String a = "";
    private int c;

    static {
        dwor dworVar = new dwor();
        b = dworVar;
        dsqw.cc(dwor.class, dworVar);
    }

    private dwor() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဈ\u0005", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwor();
            }
            if (i2 == 4) {
                return new dwoq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwor> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwor.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
