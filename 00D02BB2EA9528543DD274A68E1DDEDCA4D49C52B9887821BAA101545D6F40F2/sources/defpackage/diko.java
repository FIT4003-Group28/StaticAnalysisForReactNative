package defpackage;
/* compiled from: PG */
/* renamed from: diko  reason: default package */
/* loaded from: classes6.dex */
public final class diko extends dsqw<diko, dikn> implements dssk {
    public static final diko b;
    private static volatile dssr<diko> c;
    public dsrj<dqob> a = dssu.b;

    static {
        diko dikoVar = new diko();
        b = dikoVar;
        dsqw.cc(diko.class, dikoVar);
    }

    private diko() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqob.class});
            }
            if (i2 == 3) {
                return new diko();
            }
            if (i2 == 4) {
                return new dikn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diko> dssrVar = c;
            if (dssrVar == null) {
                synchronized (diko.class) {
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
