package defpackage;
/* compiled from: PG */
/* renamed from: difn  reason: default package */
/* loaded from: classes6.dex */
public final class difn extends dsqw<difn, difk> implements dssk {
    public static final difn b;
    private static volatile dssr<difn> d;
    private byte c = 2;
    public dsrj<difm> a = dssu.b;

    static {
        difn difnVar = new difn();
        b = difnVar;
        dsqw.cc(difn.class, difnVar);
    }

    private difn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", difm.class});
            }
            if (i2 == 3) {
                return new difn();
            }
            if (i2 == 4) {
                return new difk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<difn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (difn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
