package defpackage;
/* compiled from: PG */
/* renamed from: drgr  reason: default package */
/* loaded from: classes6.dex */
public final class drgr extends dsqw<drgr, drgq> implements dssk {
    public static final drgr d;
    private static volatile dssr<drgr> e;
    public int a;
    public int b;
    public dsrj<dpui> c = dssu.b;

    static {
        drgr drgrVar = new drgr();
        d = drgrVar;
        dsqw.cc(drgr.class, drgrVar);
    }

    private drgr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", dowa.c(), "c", dpui.class});
            }
            if (i2 == 3) {
                return new drgr();
            }
            if (i2 == 4) {
                return new drgq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drgr.class) {
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
