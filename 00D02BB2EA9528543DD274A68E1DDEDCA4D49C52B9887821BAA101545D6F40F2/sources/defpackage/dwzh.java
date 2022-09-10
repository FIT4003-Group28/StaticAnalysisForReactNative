package defpackage;
/* compiled from: PG */
/* renamed from: dwzh  reason: default package */
/* loaded from: classes6.dex */
public final class dwzh extends dsqw<dwzh, dwze> implements dssk {
    public static final dwzh a;
    private static volatile dssr<dwzh> e;
    private int b;
    private int c;
    private byte d = 2;

    static {
        dwzh dwzhVar = new dwzh();
        a = dwzhVar;
        dsqw.cc(dwzh.class, dwzhVar);
    }

    private dwzh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", dwzg.c()});
            }
            if (i2 == 3) {
                return new dwzh();
            }
            if (i2 == 4) {
                return new dwze();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dwzh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwzh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
