package defpackage;
/* compiled from: PG */
/* renamed from: diom  reason: default package */
/* loaded from: classes6.dex */
public final class diom extends dsqs<diom, diol> implements dsqt {
    public static final diom b;
    private static volatile dssr<diom> e;
    public dgfy a;
    private int c;
    private byte d = 2;

    static {
        diom diomVar = new diom();
        b = diomVar;
        dsqw.cc(diom.class, diomVar);
    }

    private diom() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diom();
            }
            if (i2 == 4) {
                return new diol();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<diom> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diom.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
