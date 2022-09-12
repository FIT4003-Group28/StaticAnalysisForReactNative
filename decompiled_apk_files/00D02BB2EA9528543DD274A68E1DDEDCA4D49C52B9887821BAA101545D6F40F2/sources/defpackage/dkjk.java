package defpackage;
/* compiled from: PG */
/* renamed from: dkjk  reason: default package */
/* loaded from: classes6.dex */
public final class dkjk extends dsqw<dkjk, dkjj> implements dssk {
    public static final dkjk b;
    private static volatile dssr<dkjk> c;
    public dsrj<String> a = dssu.b;

    static {
        dkjk dkjkVar = new dkjk();
        b = dkjkVar;
        dsqw.cc(dkjk.class, dkjkVar);
    }

    private dkjk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dkjk();
            }
            if (i2 == 4) {
                return new dkjj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkjk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkjk.class) {
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
