package defpackage;
/* compiled from: PG */
/* renamed from: dtyp  reason: default package */
/* loaded from: classes6.dex */
public final class dtyp extends dsqw<dtyp, dtyo> implements dssk {
    public static final dtyp d;
    private static volatile dssr<dtyp> e;
    public int a;
    public String b = "";
    public dsrj<dsok> c = dssu.b;

    static {
        dtyp dtypVar = new dtyp();
        d = dtypVar;
        dsqw.cc(dtyp.class, dtypVar);
    }

    private dtyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", "c", dsok.class});
            }
            if (i2 == 3) {
                return new dtyp();
            }
            if (i2 == 4) {
                return new dtyo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtyp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtyp.class) {
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
