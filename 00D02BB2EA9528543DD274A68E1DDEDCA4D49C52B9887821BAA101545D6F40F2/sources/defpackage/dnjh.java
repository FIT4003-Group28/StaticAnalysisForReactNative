package defpackage;
/* compiled from: PG */
/* renamed from: dnjh  reason: default package */
/* loaded from: classes.dex */
public final class dnjh extends dsqw<dnjh, dnjg> implements dssk {
    public static final dnjh c;
    private static volatile dssr<dnjh> d;
    public int a;
    public String b = "";

    static {
        dnjh dnjhVar = new dnjh();
        c = dnjhVar;
        dsqw.cc(dnjh.class, dnjhVar);
    }

    private dnjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnjh();
            }
            if (i2 == 4) {
                return new dnjg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnjh.class) {
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
