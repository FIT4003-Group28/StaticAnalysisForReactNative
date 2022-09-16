package defpackage;
/* compiled from: PG */
/* renamed from: dhhk  reason: default package */
/* loaded from: classes6.dex */
public final class dhhk extends dsqs<dhhk, dhhj> implements dsqt {
    public static final dhhk a;
    public static final dsqv<dtro, dhhk> b;
    private static volatile dssr<dhhk> d;
    private byte c = 2;

    static {
        dhhk dhhkVar = new dhhk();
        a = dhhkVar;
        dsqw.cc(dhhk.class, dhhkVar);
        b = dsqw.newSingularGeneratedExtension(dtro.a, dhhkVar, dhhkVar, null, 41401449, dsur.MESSAGE, dhhk.class);
    }

    private dhhk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhhk();
            }
            if (i2 == 4) {
                return new dhhj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dhhk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhhk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
