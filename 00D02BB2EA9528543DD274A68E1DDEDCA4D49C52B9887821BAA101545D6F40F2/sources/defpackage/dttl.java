package defpackage;
/* compiled from: PG */
/* renamed from: dttl  reason: default package */
/* loaded from: classes6.dex */
public final class dttl extends dsqw<dttl, dttk> implements dssk {
    public static final dttl b;
    private static volatile dssr<dttl> c;
    public String a = "";

    static {
        dttl dttlVar = new dttl();
        b = dttlVar;
        dsqw.cc(dttl.class, dttlVar);
    }

    private dttl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dttl();
            }
            if (i2 == 4) {
                return new dttk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dttl.class) {
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
