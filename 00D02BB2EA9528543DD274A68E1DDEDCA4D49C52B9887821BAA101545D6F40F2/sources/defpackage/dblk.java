package defpackage;
/* compiled from: PG */
/* renamed from: dblk  reason: default package */
/* loaded from: classes5.dex */
public final class dblk extends dsqw<dblk, dblj> implements dssk {
    public static final dblk a;
    private static volatile dssr<dblk> b;

    static {
        dblk dblkVar = new dblk();
        a = dblkVar;
        dsqw.cc(dblk.class, dblkVar);
    }

    private dblk() {
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
                return new dblk();
            }
            if (i2 == 4) {
                return new dblj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dblk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dblk.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
