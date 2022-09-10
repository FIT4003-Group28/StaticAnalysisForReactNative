package defpackage;
/* compiled from: PG */
/* renamed from: acjz  reason: default package */
/* loaded from: classes2.dex */
public final class acjz extends dsqw<acjz, acjy> implements dssk {
    public static final dsrg<Integer, acjq> g = new acjx();
    public static final acjz m;
    private static volatile dssr<acjz> n;
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
        acjz acjzVar = new acjz();
        m = acjzVar;
        dsqw.cc(acjz.class, acjzVar);
    }

    private acjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\t\u0001\u0001\u0001\f\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003\u001e\u0005ဂ\u0002\u0006င\u0003\u0007င\u0004\bဌ\u0005\tြ\u0000\fဈ\t", new Object[]{"c", "b", "a", "d", "e", "f", acjq.c(), "h", "i", "j", "k", acjs.a, acke.class, "l"});
            }
            if (i2 == 3) {
                return new acjz();
            }
            if (i2 == 4) {
                return new acjy();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<acjz> dssrVar = n;
            if (dssrVar == null) {
                synchronized (acjz.class) {
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
