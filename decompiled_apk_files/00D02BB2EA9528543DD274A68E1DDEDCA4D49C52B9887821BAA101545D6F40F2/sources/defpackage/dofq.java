package defpackage;
/* compiled from: PG */
/* renamed from: dofq  reason: default package */
/* loaded from: classes6.dex */
public final class dofq extends dsqw<dofq, dofp> implements dssk {
    public static final dofq c;
    private static volatile dssr<dofq> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dofq dofqVar = new dofq();
        c = dofqVar;
        dsqw.cc(dofq.class, dofqVar);
    }

    private dofq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dofq();
            }
            if (i2 == 4) {
                return new dofp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dofq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dofq.class) {
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
