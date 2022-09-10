package defpackage;
/* compiled from: PG */
/* renamed from: dxmg  reason: default package */
/* loaded from: classes6.dex */
public final class dxmg extends dsqw<dxmg, dxmf> implements dssk {
    public static final dxmg c;
    private static volatile dssr<dxmg> d;
    public dxnx a;
    public String b = "";

    static {
        dxmg dxmgVar = new dxmg();
        c = dxmgVar;
        dsqw.cc(dxmg.class, dxmgVar);
    }

    private dxmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxmg();
            }
            if (i2 == 4) {
                return new dxmf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxmg.class) {
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
