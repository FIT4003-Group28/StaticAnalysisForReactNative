package defpackage;
/* compiled from: PG */
/* renamed from: dwjh  reason: default package */
/* loaded from: classes6.dex */
public final class dwjh extends dsqw<dwjh, dwjg> implements dssk {
    public static final dwjh c;
    private static volatile dssr<dwjh> f;
    private int d;
    private byte e = 2;
    public dsrj<dwjj> a = dssu.b;
    public String b = "";

    static {
        dwjh dwjhVar = new dwjh();
        c = dwjhVar;
        dsqw.cc(dwjh.class, dwjhVar);
    }

    private dwjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003ဈ\u0001", new Object[]{"d", "a", dwjj.class, "b"});
            }
            if (i2 == 3) {
                return new dwjh();
            }
            if (i2 == 4) {
                return new dwjg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dwjh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwjh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
