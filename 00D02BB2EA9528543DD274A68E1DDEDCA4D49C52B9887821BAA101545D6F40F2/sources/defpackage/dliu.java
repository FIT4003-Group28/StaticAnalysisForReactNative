package defpackage;
/* compiled from: PG */
/* renamed from: dliu  reason: default package */
/* loaded from: classes6.dex */
public final class dliu extends dsqw<dliu, dlit> implements dssk {
    public static final dliu d;
    private static volatile dssr<dliu> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dliu dliuVar = new dliu();
        d = dliuVar;
        dsqw.cc(dliu.class, dliuVar);
    }

    private dliu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dliu();
            }
            if (i2 == 4) {
                return new dlit();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dliu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dliu.class) {
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
