package defpackage;
/* compiled from: PG */
/* renamed from: dxlm  reason: default package */
/* loaded from: classes6.dex */
public final class dxlm extends dsqw<dxlm, dxll> implements dssk {
    public static final dxlm c;
    private static volatile dssr<dxlm> d;
    public dxwi a;
    public long b;

    static {
        dxlm dxlmVar = new dxlm();
        c = dxlmVar;
        dsqw.cc(dxlm.class, dxlmVar);
    }

    private dxlm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxlm();
            }
            if (i2 == 4) {
                return new dxll();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxlm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxlm.class) {
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
