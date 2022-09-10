package defpackage;
/* compiled from: PG */
/* renamed from: djfi  reason: default package */
/* loaded from: classes6.dex */
public final class djfi extends dsqw<djfi, djfh> implements dssk {
    public static final djfi c;
    private static volatile dssr<djfi> e;
    public int a;
    public dwmx b;
    private byte d = 2;

    static {
        djfi djfiVar = new djfi();
        c = djfiVar;
        dsqw.cc(djfi.class, djfiVar);
    }

    private djfi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djfi();
            }
            if (i2 == 4) {
                return new djfh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<djfi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djfi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
