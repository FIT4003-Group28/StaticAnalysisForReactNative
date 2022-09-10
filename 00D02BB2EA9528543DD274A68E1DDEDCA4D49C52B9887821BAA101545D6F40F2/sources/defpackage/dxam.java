package defpackage;
/* compiled from: PG */
/* renamed from: dxam  reason: default package */
/* loaded from: classes.dex */
public final class dxam extends dsqw<dxam, dxaj> implements dssk {
    public static final dxam b;
    private static volatile dssr<dxam> d;
    private byte c = 2;
    public dsrj<dxal> a = dssu.b;

    static {
        dxam dxamVar = new dxam();
        b = dxamVar;
        dsqw.cc(dxam.class, dxamVar);
    }

    private dxam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001б", new Object[]{"a", dxal.class});
            }
            if (i2 == 3) {
                return new dxam();
            }
            if (i2 == 4) {
                return new dxaj();
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
            dssr<dxam> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxam.class) {
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
