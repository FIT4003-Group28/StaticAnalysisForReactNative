package defpackage;
/* compiled from: PG */
/* renamed from: dpia  reason: default package */
/* loaded from: classes6.dex */
public final class dpia extends dsqw<dpia, dphz> implements dssk {
    public static final dpia b;
    private static volatile dssr<dpia> e;
    public douj a;
    private int c;
    private byte d = 2;

    static {
        dpia dpiaVar = new dpia();
        b = dpiaVar;
        dsqw.cc(dpia.class, dpiaVar);
    }

    private dpia() {
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
                return new dpia();
            }
            if (i2 == 4) {
                return new dphz();
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
            dssr<dpia> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpia.class) {
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
