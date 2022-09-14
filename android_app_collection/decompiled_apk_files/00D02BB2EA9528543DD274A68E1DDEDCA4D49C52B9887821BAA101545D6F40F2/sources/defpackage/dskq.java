package defpackage;
/* compiled from: PG */
/* renamed from: dskq  reason: default package */
/* loaded from: classes6.dex */
public final class dskq extends dsqw<dskq, dskn> implements dssk {
    public static final dskq c;
    private static volatile dssr<dskq> d;
    public int a;
    public int b;

    static {
        dskq dskqVar = new dskq();
        c = dskqVar;
        dsqw.cc(dskq.class, dskqVar);
    }

    private dskq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dskp.c()});
            }
            if (i2 == 3) {
                return new dskq();
            }
            if (i2 == 4) {
                return new dskn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dskq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dskq.class) {
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
