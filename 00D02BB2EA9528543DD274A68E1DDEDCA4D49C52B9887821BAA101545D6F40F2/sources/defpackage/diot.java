package defpackage;
/* compiled from: PG */
/* renamed from: diot  reason: default package */
/* loaded from: classes6.dex */
public final class diot extends dsqw<diot, dios> implements dssk {
    public static final diot a;
    private static volatile dssr<diot> c;
    private byte b = 2;

    static {
        diot diotVar = new diot();
        a = diotVar;
        dsqw.cc(diot.class, diotVar);
    }

    private diot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diot();
            }
            if (i2 == 4) {
                return new dios();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<diot> dssrVar = c;
            if (dssrVar == null) {
                synchronized (diot.class) {
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
