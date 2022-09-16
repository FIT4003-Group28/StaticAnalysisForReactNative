package defpackage;
/* compiled from: PG */
/* renamed from: dnxn  reason: default package */
/* loaded from: classes6.dex */
public final class dnxn extends dsqw<dnxn, dnxm> implements dssk {
    public static final dnxn f;
    private static volatile dssr<dnxn> i;
    public int a;
    public dnnn c;
    public dqtn d;
    public dhjx e;
    private dnqh g;
    private byte h = 2;
    public dsrj<String> b = dssu.b;

    static {
        dnxn dnxnVar = new dnxn();
        f = dnxnVar;
        dsqw.cc(dnxn.class, dnxnVar);
    }

    private dnxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001\u001a\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0004\u0007ဉ\u0002", new Object[]{"a", "b", "c", "g", "e", "d"});
            }
            if (i3 == 3) {
                return new dnxn();
            }
            if (i3 == 4) {
                return new dnxm();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dnxn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnxn.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
