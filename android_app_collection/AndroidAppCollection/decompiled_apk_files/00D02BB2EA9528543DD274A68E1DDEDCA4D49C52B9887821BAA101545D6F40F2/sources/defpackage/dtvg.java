package defpackage;
/* compiled from: PG */
/* renamed from: dtvg  reason: default package */
/* loaded from: classes6.dex */
public final class dtvg extends dsqw<dtvg, dtvd> implements dssk {
    public static final dtvg c;
    private static volatile dssr<dtvg> d;
    public dtvf a;
    public String b = "";

    static {
        dtvg dtvgVar = new dtvg();
        c = dtvgVar;
        dsqw.cc(dtvg.class, dtvgVar);
    }

    private dtvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtvg();
            }
            if (i2 == 4) {
                return new dtvd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtvg.class) {
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
