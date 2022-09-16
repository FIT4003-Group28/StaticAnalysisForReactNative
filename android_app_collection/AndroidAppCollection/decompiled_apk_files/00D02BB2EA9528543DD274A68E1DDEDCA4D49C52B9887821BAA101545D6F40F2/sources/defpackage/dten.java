package defpackage;
/* compiled from: PG */
/* renamed from: dten  reason: default package */
/* loaded from: classes6.dex */
public final class dten extends dsqw<dten, dtem> implements dssk {
    public static final dten a;
    private static volatile dssr<dten> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dten dtenVar = new dten();
        a = dtenVar;
        dsqw.cc(dten.class, dtenVar);
    }

    private dten() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dten();
            }
            if (i2 == 4) {
                return new dtem();
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
            dssr<dten> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dten.class) {
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
