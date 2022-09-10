package defpackage;
/* compiled from: PG */
/* renamed from: dole  reason: default package */
/* loaded from: classes6.dex */
public final class dole extends dsqw<dole, dold> implements dssk {
    public static final dole a;
    private static volatile dssr<dole> c;
    private byte b = 2;

    static {
        dole doleVar = new dole();
        a = doleVar;
        dsqw.cc(dole.class, doleVar);
    }

    private dole() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dole();
            }
            if (i2 == 4) {
                return new dold();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dole> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dole.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
