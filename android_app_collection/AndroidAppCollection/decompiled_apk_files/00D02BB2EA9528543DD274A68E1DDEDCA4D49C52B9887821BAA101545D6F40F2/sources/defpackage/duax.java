package defpackage;
/* compiled from: PG */
/* renamed from: duax  reason: default package */
/* loaded from: classes6.dex */
public final class duax extends dsqw<duax, duaa> implements dssk {
    public static final duax d;
    private static volatile dssr<duax> e;
    public int a = 0;
    public Object b;
    public dspt c;

    static {
        duax duaxVar = new duax();
        d = duaxVar;
        dsqw.cc(duax.class, duaxVar);
    }

    private duax() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", "c", duaw.class, duas.class, duac.class, duaq.class, duau.class});
            }
            if (i2 == 3) {
                return new duax();
            }
            if (i2 == 4) {
                return new duaa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duax> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duax.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
