package defpackage;
/* compiled from: PG */
/* renamed from: dkdl  reason: default package */
/* loaded from: classes6.dex */
public final class dkdl extends dsqw<dkdl, dkdi> implements dssk {
    public static final dkdl c;
    private static volatile dssr<dkdl> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dkdl dkdlVar = new dkdl();
        c = dkdlVar;
        dsqw.cc(dkdl.class, dkdlVar);
    }

    private dkdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", dkdk.class});
            }
            if (i2 == 3) {
                return new dkdl();
            }
            if (i2 == 4) {
                return new dkdi();
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
            dssr<dkdl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkdl.class) {
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
