package defpackage;
/* compiled from: PG */
/* renamed from: dtwn  reason: default package */
/* loaded from: classes6.dex */
public final class dtwn extends dsqw<dtwn, dtwm> implements dssk {
    public static final dtwn d;
    private static volatile dssr<dtwn> e;
    public Object b;
    public int a = 0;
    public String c = "";

    static {
        dtwn dtwnVar = new dtwn();
        d = dtwnVar;
        dsqw.cc(dtwn.class, dtwnVar);
    }

    private dtwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"b", "a", "c", dtwl.class});
            }
            if (i2 == 3) {
                return new dtwn();
            }
            if (i2 == 4) {
                return new dtwm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtwn.class) {
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
