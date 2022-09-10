package defpackage;
/* compiled from: PG */
/* renamed from: doku  reason: default package */
/* loaded from: classes6.dex */
public final class doku extends dsqw<doku, dokt> implements dssk {
    public static final doku a;
    private static volatile dssr<doku> e;
    private int b;
    private dnte c;
    private byte d = 2;

    static {
        doku dokuVar = new doku();
        a = dokuVar;
        dsqw.cc(doku.class, dokuVar);
    }

    private doku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new doku();
            }
            if (i2 == 4) {
                return new dokt();
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
            dssr<doku> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doku.class) {
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
