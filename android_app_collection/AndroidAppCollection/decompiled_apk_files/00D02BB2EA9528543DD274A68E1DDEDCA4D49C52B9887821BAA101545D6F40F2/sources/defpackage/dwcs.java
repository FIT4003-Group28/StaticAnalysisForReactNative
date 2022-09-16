package defpackage;
/* compiled from: PG */
/* renamed from: dwcs  reason: default package */
/* loaded from: classes6.dex */
public final class dwcs extends dsqw<dwcs, dwcr> implements dssk {
    public static final dwcs e;
    private static volatile dssr<dwcs> g;
    public int a;
    public dnee c;
    public dnqh d;
    private byte f = 2;
    public dspd b = dspd.b;

    static {
        dwcs dwcsVar = new dwcs();
        e = dwcsVar;
        dsqw.cc(dwcs.class, dwcsVar);
    }

    private dwcs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ည\u0001\u0002ဉ\u0002\u0005ᐉ\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwcs();
            }
            if (i2 == 4) {
                return new dwcr();
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
            dssr<dwcs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwcs.class) {
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
