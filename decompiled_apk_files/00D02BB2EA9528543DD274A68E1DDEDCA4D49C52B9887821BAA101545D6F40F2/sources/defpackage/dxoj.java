package defpackage;
/* compiled from: PG */
/* renamed from: dxoj  reason: default package */
/* loaded from: classes6.dex */
public final class dxoj extends dsqw<dxoj, dxoi> implements dssk {
    public static final dxoj c;
    private static volatile dssr<dxoj> d;
    public String a = "";
    public int b;

    static {
        dxoj dxojVar = new dxoj();
        c = dxojVar;
        dsqw.cc(dxoj.class, dxojVar);
    }

    private dxoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxoj();
            }
            if (i2 == 4) {
                return new dxoi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxoj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxoj.class) {
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
