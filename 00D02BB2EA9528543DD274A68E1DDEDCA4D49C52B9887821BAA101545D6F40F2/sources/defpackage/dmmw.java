package defpackage;
/* compiled from: PG */
/* renamed from: dmmw  reason: default package */
/* loaded from: classes.dex */
public final class dmmw extends dsqw<dmmw, dmmv> implements dssk {
    public static final dmmw b;
    private static volatile dssr<dmmw> d;
    private byte c = 2;
    public dsrj<dmmu> a = dssu.b;

    static {
        dmmw dmmwVar = new dmmw();
        b = dmmwVar;
        dsqw.cc(dmmw.class, dmmwVar);
    }

    private dmmw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmmu.class});
            }
            if (i2 == 3) {
                return new dmmw();
            }
            if (i2 == 4) {
                return new dmmv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dmmw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmmw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
