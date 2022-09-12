package defpackage;
/* compiled from: PG */
/* renamed from: dnte  reason: default package */
/* loaded from: classes6.dex */
public final class dnte extends dsqw<dnte, dntd> implements dssk {
    public static final dnte a;
    private static volatile dssr<dnte> e;
    private int b;
    private docg c;
    private byte d = 2;

    static {
        dnte dnteVar = new dnte();
        a = dnteVar;
        dsqw.cc(dnte.class, dnteVar);
    }

    private dnte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\b", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dnte();
            }
            if (i2 == 4) {
                return new dntd();
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
            dssr<dnte> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnte.class) {
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
