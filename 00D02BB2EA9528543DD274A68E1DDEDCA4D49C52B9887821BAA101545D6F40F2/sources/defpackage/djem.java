package defpackage;
/* compiled from: PG */
/* renamed from: djem  reason: default package */
/* loaded from: classes6.dex */
public final class djem extends dsqw<djem, djel> implements dssk {
    public static final djem a;
    private static volatile dssr<djem> c;
    private byte b = 2;

    static {
        djem djemVar = new djem();
        a = djemVar;
        dsqw.cc(djem.class, djemVar);
    }

    private djem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djem();
            }
            if (i2 == 4) {
                return new djel();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<djem> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djem.class) {
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