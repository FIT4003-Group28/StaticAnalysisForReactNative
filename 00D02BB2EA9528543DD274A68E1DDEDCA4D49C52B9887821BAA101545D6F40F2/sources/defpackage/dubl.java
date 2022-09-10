package defpackage;
/* compiled from: PG */
/* renamed from: dubl  reason: default package */
/* loaded from: classes6.dex */
public final class dubl extends dsqw<dubl, dubk> implements dssk {
    public static final dubl c;
    private static volatile dssr<dubl> d;
    public String a = "";
    public String b = "";

    static {
        dubl dublVar = new dubl();
        c = dublVar;
        dsqw.cc(dubl.class, dublVar);
    }

    private dubl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dubl();
            }
            if (i2 == 4) {
                return new dubk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dubl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
