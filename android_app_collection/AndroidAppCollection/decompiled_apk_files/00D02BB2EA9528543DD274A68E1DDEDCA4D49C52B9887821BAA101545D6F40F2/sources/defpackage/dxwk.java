package defpackage;
/* compiled from: PG */
/* renamed from: dxwk  reason: default package */
/* loaded from: classes6.dex */
public final class dxwk extends dsqw<dxwk, dxwj> implements dssk {
    public static final dxwk b;
    private static volatile dssr<dxwk> c;
    public long a;

    static {
        dxwk dxwkVar = new dxwk();
        b = dxwkVar;
        dsqw.cc(dxwk.class, dxwkVar);
    }

    private dxwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxwk();
            }
            if (i2 == 4) {
                return new dxwj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxwk.class) {
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
