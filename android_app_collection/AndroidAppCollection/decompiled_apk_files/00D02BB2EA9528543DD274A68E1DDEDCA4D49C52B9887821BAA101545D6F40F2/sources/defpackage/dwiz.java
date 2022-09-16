package defpackage;
/* compiled from: PG */
/* renamed from: dwiz  reason: default package */
/* loaded from: classes6.dex */
public final class dwiz extends dsqw<dwiz, dwiy> implements dssk {
    public static final dwiz a;
    private static volatile dssr<dwiz> e;
    private int b;
    private dwir c;
    private byte d = 2;

    static {
        dwiz dwizVar = new dwiz();
        a = dwizVar;
        dsqw.cc(dwiz.class, dwizVar);
    }

    private dwiz() {
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
                return new dwiz();
            }
            if (i2 == 4) {
                return new dwiy();
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
            dssr<dwiz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwiz.class) {
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
