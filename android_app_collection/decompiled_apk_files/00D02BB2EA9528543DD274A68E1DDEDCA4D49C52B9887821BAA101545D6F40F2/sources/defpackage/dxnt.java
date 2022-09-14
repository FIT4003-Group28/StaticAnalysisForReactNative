package defpackage;
/* compiled from: PG */
/* renamed from: dxnt  reason: default package */
/* loaded from: classes6.dex */
public final class dxnt extends dsqw<dxnt, dxns> implements dssk {
    public static final dxnt b;
    private static volatile dssr<dxnt> c;
    public dsrj<dxnc> a = dssu.b;

    static {
        dxnt dxntVar = new dxnt();
        b = dxntVar;
        dsqw.cc(dxnt.class, dxntVar);
    }

    private dxnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxnc.class});
            }
            if (i2 == 3) {
                return new dxnt();
            }
            if (i2 == 4) {
                return new dxns();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxnt.class) {
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
