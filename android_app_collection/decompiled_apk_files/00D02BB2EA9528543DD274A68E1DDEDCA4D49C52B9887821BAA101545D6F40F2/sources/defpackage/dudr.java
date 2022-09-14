package defpackage;
/* compiled from: PG */
/* renamed from: dudr  reason: default package */
/* loaded from: classes6.dex */
public final class dudr extends dsqw<dudr, dudq> implements dssk {
    public static final dudr c;
    private static volatile dssr<dudr> e;
    public boolean a;
    public double b;
    private int d;

    static {
        dudr dudrVar = new dudr();
        c = dudrVar;
        dsqw.cc(dudr.class, dudrVar);
    }

    private dudr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dudr();
            }
            if (i2 == 4) {
                return new dudq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dudr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dudr.class) {
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
