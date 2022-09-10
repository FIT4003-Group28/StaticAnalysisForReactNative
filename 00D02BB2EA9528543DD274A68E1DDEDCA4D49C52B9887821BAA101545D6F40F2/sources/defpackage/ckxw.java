package defpackage;
/* compiled from: PG */
/* renamed from: ckxw  reason: default package */
/* loaded from: classes5.dex */
public final class ckxw extends dsqw<ckxw, ckxv> implements dssk {
    public static final ckxw c;
    private static volatile dssr<ckxw> d;
    public int a;
    public String b = "";

    static {
        ckxw ckxwVar = new ckxw();
        c = ckxwVar;
        dsqw.cc(ckxw.class, ckxwVar);
    }

    private ckxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckxw();
            }
            if (i2 == 4) {
                return new ckxv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckxw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
