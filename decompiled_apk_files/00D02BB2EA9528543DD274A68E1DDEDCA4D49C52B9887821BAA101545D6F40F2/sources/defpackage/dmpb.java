package defpackage;
/* compiled from: PG */
/* renamed from: dmpb  reason: default package */
/* loaded from: classes6.dex */
public final class dmpb extends dsqw<dmpb, dmpa> implements dssk {
    public static final dmpb b;
    private static volatile dssr<dmpb> c;
    public dsrj<dmoz> a = dssu.b;

    static {
        dmpb dmpbVar = new dmpb();
        b = dmpbVar;
        dsqw.cc(dmpb.class, dmpbVar);
    }

    private dmpb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmoz.class});
            }
            if (i2 == 3) {
                return new dmpb();
            }
            if (i2 == 4) {
                return new dmpa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmpb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmpb.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
