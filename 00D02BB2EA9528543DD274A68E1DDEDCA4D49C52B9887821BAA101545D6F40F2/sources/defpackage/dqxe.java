package defpackage;
/* compiled from: PG */
/* renamed from: dqxe  reason: default package */
/* loaded from: classes6.dex */
public final class dqxe extends dsqw<dqxe, dqxd> implements dssk {
    public static final dqxe a;
    private static volatile dssr<dqxe> b;

    static {
        dqxe dqxeVar = new dqxe();
        a = dqxeVar;
        dsqw.cc(dqxe.class, dqxeVar);
    }

    private dqxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqxe();
            }
            if (i2 == 4) {
                return new dqxd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqxe.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
