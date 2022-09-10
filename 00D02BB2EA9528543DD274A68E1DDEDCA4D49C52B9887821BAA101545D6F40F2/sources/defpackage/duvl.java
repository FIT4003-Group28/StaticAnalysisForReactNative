package defpackage;
/* compiled from: PG */
/* renamed from: duvl  reason: default package */
/* loaded from: classes6.dex */
public final class duvl extends dsqw<duvl, duvk> implements dssk {
    public static final duvl c;
    private static volatile dssr<duvl> e;
    public int a;
    public duyo b;
    private byte d = 2;

    static {
        duvl duvlVar = new duvl();
        c = duvlVar;
        dsqw.cc(duvl.class, duvlVar);
    }

    private duvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duvl();
            }
            if (i2 == 4) {
                return new duvk();
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
            dssr<duvl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duvl.class) {
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
