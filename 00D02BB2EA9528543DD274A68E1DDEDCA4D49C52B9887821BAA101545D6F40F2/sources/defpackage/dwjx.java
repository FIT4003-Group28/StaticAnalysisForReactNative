package defpackage;
/* compiled from: PG */
/* renamed from: dwjx  reason: default package */
/* loaded from: classes6.dex */
public final class dwjx extends dsqw<dwjx, dwjw> implements dssk {
    public static final dwjx d;
    private static volatile dssr<dwjx> f;
    public int a;
    public int b;
    public djgl c;
    private byte e = 2;

    static {
        dwjx dwjxVar = new dwjx();
        d = dwjxVar;
        dsqw.cc(dwjx.class, dwjxVar);
    }

    private dwjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", dosl.a, "c"});
            }
            if (i2 == 3) {
                return new dwjx();
            }
            if (i2 == 4) {
                return new dwjw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dwjx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwjx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
