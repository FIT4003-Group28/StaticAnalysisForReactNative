package defpackage;
/* compiled from: PG */
/* renamed from: dmof  reason: default package */
/* loaded from: classes6.dex */
public final class dmof extends dsqw<dmof, dmoe> implements dssk {
    public static final dmof k;
    private static volatile dssr<dmof> l;
    public int a;
    public int b;
    public float c;
    public float d;
    public dmlw e;
    public dmlw f;
    public dmlw g;
    public dmlw h;
    public dmlw i;
    public dmlw j;

    static {
        dmof dmofVar = new dmof();
        k = dmofVar;
        dsqw.cc(dmof.class, dmofVar);
    }

    private dmof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dmof();
            }
            if (i2 == 4) {
                return new dmoe();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmof> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dmof.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
