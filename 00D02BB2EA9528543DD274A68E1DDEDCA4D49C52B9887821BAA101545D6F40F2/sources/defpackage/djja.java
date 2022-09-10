package defpackage;
/* compiled from: PG */
/* renamed from: djja  reason: default package */
/* loaded from: classes6.dex */
public final class djja extends dsqw<djja, djiv> implements dssk {
    public static final djja e;
    private static volatile dssr<djja> g;
    public dpum a;
    public String b = "";
    public dsrj<djix> c = dssu.b;
    public djiz d;
    private int f;

    static {
        djja djjaVar = new djja();
        e = djjaVar;
        dsqw.cc(djja.class, djjaVar);
    }

    private djja() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"f", "a", "b", "c", djix.class, "d"});
            }
            if (i2 == 3) {
                return new djja();
            }
            if (i2 == 4) {
                return new djiv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djja> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djja.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
