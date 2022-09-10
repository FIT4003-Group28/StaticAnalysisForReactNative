package defpackage;
/* compiled from: PG */
/* renamed from: buff  reason: default package */
/* loaded from: classes4.dex */
public final class buff extends dsqw<buff, bufc> implements dssk {
    public static final buff b;
    private static volatile dssr<buff> c;
    public dsrj<bufe> a = dssu.b;

    static {
        buff buffVar = new buff();
        b = buffVar;
        dsqw.cc(buff.class, buffVar);
    }

    private buff() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bufe.class});
            }
            if (i2 == 3) {
                return new buff();
            }
            if (i2 == 4) {
                return new bufc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<buff> dssrVar = c;
            if (dssrVar == null) {
                synchronized (buff.class) {
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
