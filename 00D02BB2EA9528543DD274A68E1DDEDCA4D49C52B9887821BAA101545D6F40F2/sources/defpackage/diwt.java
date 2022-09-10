package defpackage;
/* compiled from: PG */
/* renamed from: diwt  reason: default package */
/* loaded from: classes6.dex */
public final class diwt extends dsqw<diwt, diws> implements dssk {
    public static final diwt a;
    private static volatile dssr<diwt> c;
    private byte b = 2;

    static {
        diwt diwtVar = new diwt();
        a = diwtVar;
        dsqw.cc(diwt.class, diwtVar);
    }

    private diwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diwt();
            }
            if (i2 == 4) {
                return new diws();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<diwt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (diwt.class) {
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
