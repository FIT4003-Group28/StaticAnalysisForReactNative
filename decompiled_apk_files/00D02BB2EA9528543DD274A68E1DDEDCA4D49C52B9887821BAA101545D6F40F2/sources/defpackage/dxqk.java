package defpackage;
/* compiled from: PG */
/* renamed from: dxqk  reason: default package */
/* loaded from: classes6.dex */
public final class dxqk extends dsqw<dxqk, dxqj> implements dssk {
    public static final dxqk b;
    private static volatile dssr<dxqk> c;
    public int a;

    static {
        dxqk dxqkVar = new dxqk();
        b = dxqkVar;
        dsqw.cc(dxqk.class, dxqkVar);
    }

    private dxqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxqk();
            }
            if (i2 == 4) {
                return new dxqj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxqk.class) {
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
