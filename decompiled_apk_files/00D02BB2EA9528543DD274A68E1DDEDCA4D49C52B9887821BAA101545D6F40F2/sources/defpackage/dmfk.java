package defpackage;
/* compiled from: PG */
/* renamed from: dmfk  reason: default package */
/* loaded from: classes6.dex */
public final class dmfk extends dsqw<dmfk, dmfj> implements dssk {
    public static final dmfk a;
    public static final dsqv<dmfs, dmfk> b;
    private static volatile dssr<dmfk> c;

    static {
        dmfk dmfkVar = new dmfk();
        a = dmfkVar;
        dsqw.cc(dmfk.class, dmfkVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmfkVar, dmfkVar, null, 1010, dsur.MESSAGE, dmfk.class);
    }

    private dmfk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmfk();
            }
            if (i2 == 4) {
                return new dmfj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmfk.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
