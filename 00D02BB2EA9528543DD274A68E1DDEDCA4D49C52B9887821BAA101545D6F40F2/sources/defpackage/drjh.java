package defpackage;
/* compiled from: PG */
/* renamed from: drjh  reason: default package */
/* loaded from: classes6.dex */
public final class drjh extends dsqw<drjh, drjg> implements dssk {
    public static final drjh j;
    private static volatile dssr<drjh> k;
    public int a;
    public drir b;
    public drir c;
    public dqfu d;
    public dqfu e;
    public drjf f;
    public int g;
    public int h;
    public int i;

    static {
        drjh drjhVar = new drjh();
        j = drjhVar;
        dsqw.cc(drjh.class, drjhVar);
    }

    private drjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new drjh();
            }
            if (i2 == 4) {
                return new drjg();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjh> dssrVar = k;
            if (dssrVar == null) {
                synchronized (drjh.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
