package defpackage;
/* compiled from: PG */
/* renamed from: dmae  reason: default package */
/* loaded from: classes6.dex */
public final class dmae extends dsqw<dmae, dmad> implements dssk {
    public static final dmae c;
    private static volatile dssr<dmae> d;
    public int a;
    public dpum b;

    static {
        dmae dmaeVar = new dmae();
        c = dmaeVar;
        dsqw.cc(dmae.class, dmaeVar);
    }

    private dmae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmae();
            }
            if (i2 == 4) {
                return new dmad();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmae> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmae.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
