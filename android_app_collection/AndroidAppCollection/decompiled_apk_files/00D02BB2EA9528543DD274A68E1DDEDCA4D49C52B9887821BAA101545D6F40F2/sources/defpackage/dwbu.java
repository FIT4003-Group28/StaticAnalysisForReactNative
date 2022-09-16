package defpackage;
/* compiled from: PG */
/* renamed from: dwbu  reason: default package */
/* loaded from: classes6.dex */
public final class dwbu extends dsqw<dwbu, dwbt> implements dssk {
    public static final dwbu e;
    private static volatile dssr<dwbu> g;
    public int a;
    public dpfh b;
    private byte f = 2;
    public int c = -1;
    public dsrj<dozz> d = dssu.b;

    static {
        dwbu dwbuVar = new dwbu();
        e = dwbuVar;
        dsqw.cc(dwbu.class, dwbuVar);
    }

    private dwbu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002င\u0001\u0004Л", new Object[]{"a", "b", "c", "d", dozz.class});
            }
            if (i2 == 3) {
                return new dwbu();
            }
            if (i2 == 4) {
                return new dwbt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dwbu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwbu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
