package defpackage;
/* compiled from: PG */
/* renamed from: ajjk  reason: default package */
/* loaded from: classes2.dex */
public final class ajjk extends dsqw<ajjk, ajjj> implements dssk {
    public static final ajjk b;
    private static volatile dssr<ajjk> c;
    public dsrj<ajji> a = dssu.b;

    static {
        ajjk ajjkVar = new ajjk();
        b = ajjkVar;
        dsqw.cc(ajjk.class, ajjkVar);
    }

    private ajjk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajji.class});
            }
            if (i2 == 3) {
                return new ajjk();
            }
            if (i2 == 4) {
                return new ajjj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajjk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ajjk.class) {
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
