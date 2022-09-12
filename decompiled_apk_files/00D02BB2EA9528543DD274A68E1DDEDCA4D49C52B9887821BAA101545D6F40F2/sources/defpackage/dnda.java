package defpackage;
/* compiled from: PG */
/* renamed from: dnda  reason: default package */
/* loaded from: classes6.dex */
public final class dnda extends dsqw<dnda, dncz> implements dssk {
    public static final dnda a;
    private static volatile dssr<dnda> f;
    private int b;
    private dncn c;
    private dncn d;
    private byte e = 2;

    static {
        dnda dndaVar = new dnda();
        a = dndaVar;
        dsqw.cc(dnda.class, dndaVar);
    }

    private dnda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnda();
            }
            if (i2 == 4) {
                return new dncz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dnda> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnda.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
