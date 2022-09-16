package defpackage;
/* compiled from: PG */
/* renamed from: dmez  reason: default package */
/* loaded from: classes6.dex */
public final class dmez extends dsqw<dmez, dmey> implements dssk {
    public static final dmez d;
    private static volatile dssr<dmez> e;
    public int a;
    public dmdp b;
    public dsrj<drco> c = dssu.b;

    static {
        dmez dmezVar = new dmez();
        d = dmezVar;
        dsqw.cc(dmez.class, dmezVar);
    }

    private dmez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", drco.class});
            }
            if (i2 == 3) {
                return new dmez();
            }
            if (i2 == 4) {
                return new dmey();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmez> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmez.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
