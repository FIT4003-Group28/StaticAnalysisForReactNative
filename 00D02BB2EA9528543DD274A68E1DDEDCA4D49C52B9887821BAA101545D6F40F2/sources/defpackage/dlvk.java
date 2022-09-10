package defpackage;
/* compiled from: PG */
/* renamed from: dlvk  reason: default package */
/* loaded from: classes6.dex */
public final class dlvk extends dsqw<dlvk, dlvj> implements dssk {
    public static final dlvk b;
    private static volatile dssr<dlvk> c;
    public dsrj<dlvi> a = dssu.b;

    static {
        dlvk dlvkVar = new dlvk();
        b = dlvkVar;
        dsqw.cc(dlvk.class, dlvkVar);
    }

    private dlvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlvi.class});
            }
            if (i2 == 3) {
                return new dlvk();
            }
            if (i2 == 4) {
                return new dlvj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlvk.class) {
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
