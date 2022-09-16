package defpackage;
/* compiled from: PG */
/* renamed from: cyjs  reason: default package */
/* loaded from: classes5.dex */
public final class cyjs extends dsqw<cyjs, cyjr> implements dssk {
    public static final cyjs c;
    private static volatile dssr<cyjs> d;
    public String a = "";
    public int b;

    static {
        cyjs cyjsVar = new cyjs();
        c = cyjsVar;
        dsqw.cc(cyjs.class, cyjsVar);
    }

    private cyjs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cyjs();
            }
            if (i2 == 4) {
                return new cyjr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyjs.class) {
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
