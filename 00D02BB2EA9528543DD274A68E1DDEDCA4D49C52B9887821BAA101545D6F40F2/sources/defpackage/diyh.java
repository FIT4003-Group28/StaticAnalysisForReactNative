package defpackage;
/* compiled from: PG */
/* renamed from: diyh  reason: default package */
/* loaded from: classes6.dex */
public final class diyh extends dsqw<diyh, diyg> implements dssk {
    public static final diyh c;
    private static volatile dssr<diyh> e;
    public int a;
    public dsrj<djul> b = dssu.b;
    private int d;

    static {
        diyh diyhVar = new diyh();
        c = diyhVar;
        dsqw.cc(diyh.class, diyhVar);
    }

    private diyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", dgfb.c(), "b", djul.class});
            }
            if (i2 == 3) {
                return new diyh();
            }
            if (i2 == 4) {
                return new diyg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diyh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diyh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
