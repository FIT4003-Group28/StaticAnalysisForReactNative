package defpackage;
/* compiled from: PG */
/* renamed from: dlhk  reason: default package */
/* loaded from: classes6.dex */
public final class dlhk extends dsqw<dlhk, dlhj> implements dssk {
    public static final dlhk b;
    private static volatile dssr<dlhk> c;
    public dsrj<String> a = dssu.b;

    static {
        dlhk dlhkVar = new dlhk();
        b = dlhkVar;
        dsqw.cc(dlhk.class, dlhkVar);
    }

    private dlhk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dlhk();
            }
            if (i2 == 4) {
                return new dlhj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlhk.class) {
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
