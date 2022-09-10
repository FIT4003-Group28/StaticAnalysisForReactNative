package defpackage;
/* compiled from: PG */
/* renamed from: djso  reason: default package */
/* loaded from: classes6.dex */
public final class djso extends dsqw<djso, djsn> implements dssk {
    public static final djso e;
    private static volatile dssr<djso> f;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<String> d = dssu.b;

    static {
        djso djsoVar = new djso();
        e = djsoVar;
        dsqw.cc(djso.class, djsoVar);
    }

    private djso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဈ\u0000\u0003\u001a", new Object[]{"a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new djso();
            }
            if (i2 == 4) {
                return new djsn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djso> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djso.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
