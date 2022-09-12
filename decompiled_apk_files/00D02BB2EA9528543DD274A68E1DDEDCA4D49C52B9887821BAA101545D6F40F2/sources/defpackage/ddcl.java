package defpackage;
/* compiled from: PG */
/* renamed from: ddcl  reason: default package */
/* loaded from: classes5.dex */
public final class ddcl extends dsqw<ddcl, ddck> implements dssk {
    public static final ddcl c;
    private static volatile dssr<ddcl> e;
    public int a;
    public ddei b;
    private byte d = 2;

    static {
        ddcl ddclVar = new ddcl();
        c = ddclVar;
        dsqw.cc(ddcl.class, ddclVar);
    }

    private ddcl() {
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
                return new ddcl();
            }
            if (i2 == 4) {
                return new ddck();
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
            dssr<ddcl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddcl.class) {
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
