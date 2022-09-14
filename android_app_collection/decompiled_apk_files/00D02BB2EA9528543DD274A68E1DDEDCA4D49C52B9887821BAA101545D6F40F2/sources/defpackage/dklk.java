package defpackage;
/* compiled from: PG */
/* renamed from: dklk  reason: default package */
/* loaded from: classes.dex */
public final class dklk extends dsqw<dklk, dklh> implements dssk {
    public static final dklk c;
    private static volatile dssr<dklk> e;
    public boolean a;
    public int b;
    private int d;

    static {
        dklk dklkVar = new dklk();
        c = dklkVar;
        dsqw.cc(dklk.class, dklkVar);
    }

    private dklk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dkli.a});
            }
            if (i2 == 3) {
                return new dklk();
            }
            if (i2 == 4) {
                return new dklh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dklk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dklk.class) {
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
