package defpackage;
/* compiled from: PG */
/* renamed from: dofh  reason: default package */
/* loaded from: classes6.dex */
public final class dofh extends dsqw<dofh, dofg> implements dssk {
    public static final dofh b;
    private static volatile dssr<dofh> d;
    public String a = "";
    private int c;

    static {
        dofh dofhVar = new dofh();
        b = dofhVar;
        dsqw.cc(dofh.class, dofhVar);
    }

    private dofh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dofh();
            }
            if (i2 == 4) {
                return new dofg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dofh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dofh.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
