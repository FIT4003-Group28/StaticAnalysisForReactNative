package defpackage;
/* compiled from: PG */
/* renamed from: dxqo  reason: default package */
/* loaded from: classes6.dex */
public final class dxqo extends dsqw<dxqo, dxqn> implements dssk {
    public static final dxqo b;
    private static volatile dssr<dxqo> c;
    public dxnk a;

    static {
        dxqo dxqoVar = new dxqo();
        b = dxqoVar;
        dsqw.cc(dxqo.class, dxqoVar);
    }

    private dxqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxqo();
            }
            if (i2 == 4) {
                return new dxqn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxqo.class) {
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
