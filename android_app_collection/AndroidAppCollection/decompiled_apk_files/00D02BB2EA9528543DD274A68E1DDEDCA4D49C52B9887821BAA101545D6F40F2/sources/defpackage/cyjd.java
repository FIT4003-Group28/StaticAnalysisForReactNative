package defpackage;
/* compiled from: PG */
/* renamed from: cyjd  reason: default package */
/* loaded from: classes5.dex */
public final class cyjd extends dsqw<cyjd, cyjc> implements dssk {
    public static final cyjd b;
    private static volatile dssr<cyjd> c;
    public String a = "";

    static {
        cyjd cyjdVar = new cyjd();
        b = cyjdVar;
        dsqw.cc(cyjd.class, cyjdVar);
    }

    private cyjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cyjd();
            }
            if (i2 == 4) {
                return new cyjc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cyjd.class) {
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
