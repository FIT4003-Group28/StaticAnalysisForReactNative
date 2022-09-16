package defpackage;
/* compiled from: PG */
/* renamed from: dmlk  reason: default package */
/* loaded from: classes6.dex */
public final class dmlk extends dsqs<dmlk, dmlj> implements dsqt {
    public static final dmlk a;
    private static volatile dssr<dmlk> c;
    private byte b = 2;

    static {
        dmlk dmlkVar = new dmlk();
        a = dmlkVar;
        dsqw.cc(dmlk.class, dmlkVar);
    }

    private dmlk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmlk();
            }
            if (i2 == 4) {
                return new dmlj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dmlk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmlk.class) {
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
