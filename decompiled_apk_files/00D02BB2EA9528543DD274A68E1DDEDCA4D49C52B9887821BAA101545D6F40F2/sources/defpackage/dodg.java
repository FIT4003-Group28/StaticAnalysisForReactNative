package defpackage;
/* compiled from: PG */
/* renamed from: dodg  reason: default package */
/* loaded from: classes6.dex */
public final class dodg extends dsqw<dodg, dodf> implements dssk {
    public static final dodg c;
    private static volatile dssr<dodg> e;
    public int a;
    public dnzn b;
    private byte d = 2;

    static {
        dodg dodgVar = new dodg();
        c = dodgVar;
        dsqw.cc(dodg.class, dodgVar);
    }

    private dodg() {
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
                return new dodg();
            }
            if (i2 == 4) {
                return new dodf();
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
            dssr<dodg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dodg.class) {
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
