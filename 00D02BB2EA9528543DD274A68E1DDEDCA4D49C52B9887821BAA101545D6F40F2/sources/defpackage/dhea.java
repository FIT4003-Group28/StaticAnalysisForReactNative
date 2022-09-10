package defpackage;
/* compiled from: PG */
/* renamed from: dhea  reason: default package */
/* loaded from: classes6.dex */
public final class dhea extends dsqw<dhea, dhdz> implements dssk {
    public static final dhea e;
    private static volatile dssr<dhea> f;
    public String a = "";
    public dsrj<dufi> b;
    public dsrj<duet> c;
    public dayp d;

    static {
        dhea dheaVar = new dhea();
        e = dheaVar;
        dsqw.cc(dhea.class, dheaVar);
    }

    private dhea() {
        dssu<Object> dssuVar = dssu.b;
        this.b = dssu.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0002\u0000\u0001Ȉ\u0003\u001b\u0004\u001b\u0005\t", new Object[]{"a", "b", dufi.class, "c", duet.class, "d"});
            }
            if (i2 == 3) {
                return new dhea();
            }
            if (i2 == 4) {
                return new dhdz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhea> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhea.class) {
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
