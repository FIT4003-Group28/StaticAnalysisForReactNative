package defpackage;
/* compiled from: PG */
/* renamed from: dxqy  reason: default package */
/* loaded from: classes6.dex */
public final class dxqy extends dsqw<dxqy, dxqx> implements dssk {
    public static final dxqy d;
    private static volatile dssr<dxqy> e;
    public int b;
    public String a = "";
    public dsrj<dxro> c = dssu.b;

    static {
        dxqy dxqyVar = new dxqy();
        d = dxqyVar;
        dsqw.cc(dxqy.class, dxqyVar);
    }

    private dxqy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"a", "b", "c", dxro.class});
            }
            if (i2 == 3) {
                return new dxqy();
            }
            if (i2 == 4) {
                return new dxqx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxqy.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
