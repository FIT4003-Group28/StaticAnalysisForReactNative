package defpackage;
/* compiled from: PG */
/* renamed from: dddt  reason: default package */
/* loaded from: classes5.dex */
public final class dddt extends dsqw<dddt, ddds> implements dssk {
    public static final dddt d;
    private static volatile dssr<dddt> e;
    public int a;
    public int b;
    public int c;

    static {
        dddt dddtVar = new dddt();
        d = dddtVar;
        dsqw.cc(dddt.class, dddtVar);
    }

    private dddt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dddt();
            }
            if (i2 == 4) {
                return new ddds();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dddt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dddt.class) {
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
