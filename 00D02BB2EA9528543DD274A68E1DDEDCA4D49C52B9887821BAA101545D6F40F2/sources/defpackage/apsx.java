package defpackage;
/* compiled from: PG */
/* renamed from: apsx  reason: default package */
/* loaded from: classes2.dex */
public final class apsx extends dsqw<apsx, apsw> implements dssk {
    public static final apsx e;
    private static volatile dssr<apsx> f;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        apsx apsxVar = new apsx();
        e = apsxVar;
        dsqw.cc(apsx.class, apsxVar);
    }

    private apsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new apsx();
            }
            if (i2 == 4) {
                return new apsw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<apsx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (apsx.class) {
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
