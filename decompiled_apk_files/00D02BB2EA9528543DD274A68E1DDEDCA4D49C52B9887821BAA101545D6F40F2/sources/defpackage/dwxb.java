package defpackage;
/* compiled from: PG */
/* renamed from: dwxb  reason: default package */
/* loaded from: classes6.dex */
public final class dwxb extends dsqw<dwxb, dwxa> implements dssk {
    public static final dwxb d;
    private static volatile dssr<dwxb> f;
    public int a;
    public ddxz b;
    public ddhm c;
    private byte e = 2;

    static {
        dwxb dwxbVar = new dwxb();
        d = dwxbVar;
        dsqw.cc(dwxb.class, dwxbVar);
    }

    private dwxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwxb();
            }
            if (i2 == 4) {
                return new dwxa();
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
            dssr<dwxb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwxb.class) {
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
