package defpackage;
/* compiled from: PG */
/* renamed from: dskk  reason: default package */
/* loaded from: classes6.dex */
public final class dskk extends dsqw<dskk, dskj> implements dssk {
    public static final dskk d;
    private static volatile dssr<dskk> e;
    public int a;
    public int b;
    public int c;

    static {
        dskk dskkVar = new dskk();
        d = dskkVar;
        dsqw.cc(dskk.class, dskkVar);
    }

    private dskk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002", new Object[]{"a", "b", dsmh.c(), "c"});
            }
            if (i2 == 3) {
                return new dskk();
            }
            if (i2 == 4) {
                return new dskj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dskk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dskk.class) {
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
