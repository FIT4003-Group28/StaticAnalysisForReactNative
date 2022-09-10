package defpackage;
/* compiled from: PG */
/* renamed from: duco  reason: default package */
/* loaded from: classes.dex */
public final class duco extends dsqw<duco, ducn> implements dssk {
    public static final duco d;
    private static volatile dssr<duco> e;
    public Object b;
    public int a = 0;
    public String c = "";

    static {
        duco ducoVar = new duco();
        d = ducoVar;
        dsqw.cc(duco.class, ducoVar);
    }

    private duco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"b", "a", "c", ducm.class});
            }
            if (i2 == 3) {
                return new duco();
            }
            if (i2 == 4) {
                return new ducn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duco> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duco.class) {
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
