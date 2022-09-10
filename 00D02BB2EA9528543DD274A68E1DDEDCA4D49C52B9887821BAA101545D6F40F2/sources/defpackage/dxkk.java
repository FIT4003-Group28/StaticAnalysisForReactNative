package defpackage;
/* compiled from: PG */
/* renamed from: dxkk  reason: default package */
/* loaded from: classes6.dex */
public final class dxkk extends dsqw<dxkk, dxkj> implements dssk {
    public static final dxkk e;
    private static volatile dssr<dxkk> f;
    public dxwi a;
    public dspd b = dspd.b;
    public dsrf c = dsqz.b;
    public String d = "";

    static {
        dxkk dxkkVar = new dxkk();
        e = dxkkVar;
        dsqw.cc(dxkk.class, dxkkVar);
    }

    private dxkk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\n\u0003,\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxkk();
            }
            if (i2 == 4) {
                return new dxkj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxkk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxkk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
