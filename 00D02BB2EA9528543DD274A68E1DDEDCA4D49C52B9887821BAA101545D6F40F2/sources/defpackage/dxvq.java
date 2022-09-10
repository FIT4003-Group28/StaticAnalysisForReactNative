package defpackage;
/* compiled from: PG */
/* renamed from: dxvq  reason: default package */
/* loaded from: classes6.dex */
public final class dxvq extends dsqw<dxvq, dxvp> implements dssk {
    public static final dxvq c;
    private static volatile dssr<dxvq> d;
    public int a;
    public String b = "";

    static {
        dxvq dxvqVar = new dxvq();
        c = dxvqVar;
        dsqw.cc(dxvq.class, dxvqVar);
    }

    private dxvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxvq();
            }
            if (i2 == 4) {
                return new dxvp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxvq.class) {
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
