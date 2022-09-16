package defpackage;
/* compiled from: PG */
/* renamed from: dllp  reason: default package */
/* loaded from: classes6.dex */
public final class dllp extends dsqw<dllp, dllo> implements dssk {
    public static final dllp c;
    private static volatile dssr<dllp> e;
    public dpum a;
    public boolean b;
    private int d;

    static {
        dllp dllpVar = new dllp();
        c = dllpVar;
        dsqw.cc(dllp.class, dllpVar);
    }

    private dllp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dllp();
            }
            if (i2 == 4) {
                return new dllo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dllp.class) {
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
