package defpackage;
/* compiled from: PG */
/* renamed from: dwbq  reason: default package */
/* loaded from: classes6.dex */
public final class dwbq extends dsqw<dwbq, dwbp> implements dssk {
    public static final dwbq e;
    private static volatile dssr<dwbq> g;
    public int a;
    public dnhm b;
    public dwao c;
    public dnwj d;
    private byte f = 2;

    static {
        dwbq dwbqVar = new dwbq();
        e = dwbqVar;
        dsqw.cc(dwbq.class, dwbqVar);
    }

    private dwbq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဉ\u0002\u0005ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dwbq();
            }
            if (i2 == 4) {
                return new dwbp();
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
            dssr<dwbq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwbq.class) {
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
