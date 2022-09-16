package defpackage;
/* compiled from: PG */
/* renamed from: eabl  reason: default package */
/* loaded from: classes.dex */
public final class eabl extends dsqw<eabl, eabk> implements dssk {
    public static final eabl k;
    private static volatile dssr<eabl> l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public dsrj<eabj> i = dssu.b;
    public int j;

    static {
        eabl eablVar = new eabl();
        k = eablVar;
        dsqw.cc(eabl.class, eablVar);
    }

    private eabl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\u0007\u0007င\u0002\bင\u0004\tင\u0005", new Object[]{"a", "b", "c", "e", "h", "i", eabj.class, "j", "d", "f", "g"});
            }
            if (i2 == 3) {
                return new eabl();
            }
            if (i2 == 4) {
                return new eabk();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eabl> dssrVar = l;
            if (dssrVar == null) {
                synchronized (eabl.class) {
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
