package defpackage;
/* compiled from: PG */
/* renamed from: dkam  reason: default package */
/* loaded from: classes6.dex */
public final class dkam extends dsqw<dkam, dkal> implements dssk {
    public static final dkam a;
    private static volatile dssr<dkam> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dkam dkamVar = new dkam();
        a = dkamVar;
        dsqw.cc(dkam.class, dkamVar);
    }

    private dkam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkam();
            }
            if (i2 == 4) {
                return new dkal();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dkam> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkam.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
