package defpackage;
/* compiled from: PG */
/* renamed from: dtac  reason: default package */
/* loaded from: classes6.dex */
public final class dtac extends dsqw<dtac, dtab> implements dssk {
    public static final dtac a;
    private static volatile dssr<dtac> d;
    private dssd<String, dszz> b = dssd.b;
    private byte c = 2;

    static {
        dtac dtacVar = new dtac();
        a = dtacVar;
        dsqw.cc(dtac.class, dtacVar);
    }

    private dtac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002в", new Object[]{"b", dtaa.a});
            }
            if (i2 == 3) {
                return new dtac();
            }
            if (i2 == 4) {
                return new dtab();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.c = b;
                return null;
            }
            dssr<dtac> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtac.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
