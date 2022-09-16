package defpackage;
/* compiled from: PG */
/* renamed from: dogq  reason: default package */
/* loaded from: classes6.dex */
public final class dogq extends dsqw<dogq, dogp> implements dssk {
    public static final dogq c;
    private static volatile dssr<dogq> e;
    public int a;
    public doga b;
    private int d;

    static {
        dogq dogqVar = new dogq();
        c = dogqVar;
        dsqw.cc(dogq.class, dogqVar);
    }

    private dogq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dogn.a, "b"});
            }
            if (i2 == 3) {
                return new dogq();
            }
            if (i2 == 4) {
                return new dogp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dogq.class) {
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
