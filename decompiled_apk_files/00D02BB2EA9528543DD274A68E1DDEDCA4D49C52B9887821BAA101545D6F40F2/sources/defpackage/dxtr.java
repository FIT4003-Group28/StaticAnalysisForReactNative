package defpackage;
/* compiled from: PG */
/* renamed from: dxtr  reason: default package */
/* loaded from: classes6.dex */
public final class dxtr extends dsqw<dxtr, dxtq> implements dssk {
    public static final dxtr a;
    private static volatile dssr<dxtr> b;

    static {
        dxtr dxtrVar = new dxtr();
        a = dxtrVar;
        dsqw.cc(dxtr.class, dxtrVar);
    }

    private dxtr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxtr();
            }
            if (i2 == 4) {
                return new dxtq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxtr.class) {
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
