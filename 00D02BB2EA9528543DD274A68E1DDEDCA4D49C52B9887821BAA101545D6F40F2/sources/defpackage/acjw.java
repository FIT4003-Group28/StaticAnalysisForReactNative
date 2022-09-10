package defpackage;
/* compiled from: PG */
/* renamed from: acjw  reason: default package */
/* loaded from: classes2.dex */
public final class acjw extends dsqw<acjw, acjv> implements dssk {
    public static final dsrg<Integer, acjq> g = new acju();
    public static final acjw m;
    private static volatile dssr<acjw> n;
    public int a;
    public Object c;
    public dpum d;
    public float e;
    public long h;
    public int i;
    public int j;
    public int k;
    public int b = 0;
    public dsrf f = dsqz.b;
    public String l = "";

    static {
        acjw acjwVar = new acjw();
        m = acjwVar;
        dsqw.cc(acjw.class, acjwVar);
    }

    private acjw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003\u001e\u0004ဂ\u0002\u0005င\u0003\u0006င\u0004\u0007ဌ\u0005\bြ\u0000\tဈ\u0007", new Object[]{"c", "b", "a", "d", "e", "f", acjq.c(), "h", "i", "j", "k", acjs.a, acke.class, "l"});
            }
            if (i2 == 3) {
                return new acjw();
            }
            if (i2 == 4) {
                return new acjv();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<acjw> dssrVar = n;
            if (dssrVar == null) {
                synchronized (acjw.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
