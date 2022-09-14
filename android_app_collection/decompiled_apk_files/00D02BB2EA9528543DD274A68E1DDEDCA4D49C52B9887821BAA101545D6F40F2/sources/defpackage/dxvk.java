package defpackage;
/* compiled from: PG */
/* renamed from: dxvk  reason: default package */
/* loaded from: classes6.dex */
public final class dxvk extends dsqw<dxvk, dxvj> implements dssk {
    public static final dxvk b;
    private static volatile dssr<dxvk> c;
    public int a;

    static {
        dxvk dxvkVar = new dxvk();
        b = dxvkVar;
        dsqw.cc(dxvk.class, dxvkVar);
    }

    private dxvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxvk();
            }
            if (i2 == 4) {
                return new dxvj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxvk.class) {
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
