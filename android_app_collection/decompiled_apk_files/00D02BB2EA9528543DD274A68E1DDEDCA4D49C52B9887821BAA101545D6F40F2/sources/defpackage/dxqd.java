package defpackage;
/* compiled from: PG */
/* renamed from: dxqd  reason: default package */
/* loaded from: classes6.dex */
public final class dxqd extends dsqw<dxqd, dxqc> implements dssk {
    public static final dxqd a;
    private static volatile dssr<dxqd> b;

    static {
        dxqd dxqdVar = new dxqd();
        a = dxqdVar;
        dsqw.cc(dxqd.class, dxqdVar);
    }

    private dxqd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxqd();
            }
            if (i2 == 4) {
                return new dxqc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxqd.class) {
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
