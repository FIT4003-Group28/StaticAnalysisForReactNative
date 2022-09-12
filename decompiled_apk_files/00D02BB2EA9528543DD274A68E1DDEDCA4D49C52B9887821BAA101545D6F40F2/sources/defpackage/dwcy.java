package defpackage;
/* compiled from: PG */
/* renamed from: dwcy  reason: default package */
/* loaded from: classes6.dex */
public final class dwcy extends dsqw<dwcy, dwcx> implements dssk {
    public static final dwcy e;
    private static volatile dssr<dwcy> g;
    public int a;
    public dvyw b;
    public boolean d;
    private byte f = 2;
    public dsrj<dvxl> c = dssu.b;

    static {
        dwcy dwcyVar = new dwcy();
        e = dwcyVar;
        dsqw.cc(dwcy.class, dwcyVar);
    }

    private dwcy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", "c", dvxl.class, "d"});
            }
            if (i2 == 3) {
                return new dwcy();
            }
            if (i2 == 4) {
                return new dwcx();
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
            dssr<dwcy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwcy.class) {
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
