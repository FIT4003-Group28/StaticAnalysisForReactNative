package defpackage;
/* compiled from: PG */
/* renamed from: dujn  reason: default package */
/* loaded from: classes6.dex */
public final class dujn extends dsqw<dujn, dujm> implements dssk {
    public static final dujn d;
    private static volatile dssr<dujn> e;
    public Object b;
    public int a = 0;
    public dsrj<dujl> c = dssu.b;

    static {
        dujn dujnVar = new dujn();
        d = dujnVar;
        dsqw.cc(dujn.class, dujnVar);
    }

    private dujn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001း\u0000\u0003\u001b\u0004ဵ\u0000", new Object[]{"b", "a", "c", dujl.class});
            }
            if (i2 == 3) {
                return new dujn();
            }
            if (i2 == 4) {
                return new dujm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dujn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dujn.class) {
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
