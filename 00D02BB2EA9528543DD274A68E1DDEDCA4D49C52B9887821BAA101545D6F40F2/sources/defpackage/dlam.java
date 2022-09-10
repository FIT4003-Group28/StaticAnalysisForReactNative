package defpackage;
/* compiled from: PG */
/* renamed from: dlam  reason: default package */
/* loaded from: classes6.dex */
public final class dlam extends dsqw<dlam, dkzx> implements dssk {
    public static final dlam d;
    private static volatile dssr<dlam> e;
    public Object b;
    public int a = 0;
    public dsrj<dlah> c = dssu.b;

    static {
        dlam dlamVar = new dlam();
        d = dlamVar;
        dsqw.cc(dlam.class, dlamVar);
    }

    private dlam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0001\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005\u001b\u0006ြ\u0000", new Object[]{"b", "a", dlaf.class, dlab.class, dlal.class, "c", dlah.class, dlaj.class});
            }
            if (i2 == 3) {
                return new dlam();
            }
            if (i2 == 4) {
                return new dkzx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlam> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlam.class) {
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
