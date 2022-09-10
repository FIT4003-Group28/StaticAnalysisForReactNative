package defpackage;
/* compiled from: PG */
/* renamed from: dksk  reason: default package */
/* loaded from: classes.dex */
public final class dksk extends dsqw<dksk, dksj> implements dssk {
    public static final dksk b;
    private static volatile dssr<dksk> c;
    public dsrj<dksm> a = dssu.b;

    static {
        dksk dkskVar = new dksk();
        b = dkskVar;
        dsqw.cc(dksk.class, dkskVar);
    }

    private dksk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dksm.class});
            }
            if (i2 == 3) {
                return new dksk();
            }
            if (i2 == 4) {
                return new dksj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dksk.class) {
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
