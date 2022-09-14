package defpackage;
/* compiled from: PG */
/* renamed from: dvrn  reason: default package */
/* loaded from: classes6.dex */
public final class dvrn extends dsqw<dvrn, dvrk> implements dssk {
    public static final dvrn c;
    private static volatile dssr<dvrn> d;
    public int a;
    public int b;

    static {
        dvrn dvrnVar = new dvrn();
        c = dvrnVar;
        dsqw.cc(dvrn.class, dvrnVar);
    }

    private dvrn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dvrm.c()});
            }
            if (i2 == 3) {
                return new dvrn();
            }
            if (i2 == 4) {
                return new dvrk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvrn.class) {
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
