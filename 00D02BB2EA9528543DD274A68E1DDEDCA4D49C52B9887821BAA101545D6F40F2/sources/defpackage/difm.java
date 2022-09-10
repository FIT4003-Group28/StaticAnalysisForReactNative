package defpackage;
/* compiled from: PG */
/* renamed from: difm  reason: default package */
/* loaded from: classes6.dex */
public final class difm extends dsqw<difm, difl> implements dssk {
    public static final difm b;
    private static volatile dssr<difm> e;
    public docg a;
    private int c;
    private byte d = 2;

    static {
        difm difmVar = new difm();
        b = difmVar;
        dsqw.cc(difm.class, difmVar);
    }

    private difm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new difm();
            }
            if (i2 == 4) {
                return new difl();
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
            dssr<difm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (difm.class) {
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
