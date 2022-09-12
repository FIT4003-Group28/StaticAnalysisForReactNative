package defpackage;
/* compiled from: PG */
/* renamed from: dmrl  reason: default package */
/* loaded from: classes.dex */
public final class dmrl extends dsqw<dmrl, dmrk> implements dssk {
    public static final dmrl b;
    private static volatile dssr<dmrl> c;
    public dsrj<dmrj> a = dssu.b;

    static {
        dmrl dmrlVar = new dmrl();
        b = dmrlVar;
        dsqw.cc(dmrl.class, dmrlVar);
    }

    private dmrl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmrj.class});
            }
            if (i2 == 3) {
                return new dmrl();
            }
            if (i2 == 4) {
                return new dmrk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmrl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmrl.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
