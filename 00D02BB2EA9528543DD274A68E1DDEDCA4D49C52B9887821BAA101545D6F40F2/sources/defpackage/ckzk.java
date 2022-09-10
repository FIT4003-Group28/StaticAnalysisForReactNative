package defpackage;
/* compiled from: PG */
/* renamed from: ckzk  reason: default package */
/* loaded from: classes5.dex */
public final class ckzk extends dsqw<ckzk, ckzj> implements dssk {
    public static final ckzk a;
    private static volatile dssr<ckzk> b;

    static {
        ckzk ckzkVar = new ckzk();
        a = ckzkVar;
        dsqw.cc(ckzk.class, ckzkVar);
    }

    private ckzk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ckzk();
            }
            if (i2 == 4) {
                return new ckzj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ckzk.class) {
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
