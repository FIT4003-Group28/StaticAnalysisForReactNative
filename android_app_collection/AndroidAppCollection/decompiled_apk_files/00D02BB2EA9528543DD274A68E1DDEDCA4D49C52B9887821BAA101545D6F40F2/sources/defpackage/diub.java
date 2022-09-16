package defpackage;
/* compiled from: PG */
/* renamed from: diub  reason: default package */
/* loaded from: classes6.dex */
public final class diub extends dsqw<diub, diua> implements dssk {
    public static final diub e;
    private static volatile dssr<diub> h;
    private int f;
    private byte g = 2;
    public String a = "";
    public String b = "";
    public dsrj<ditz> c = dssu.b;
    public String d = "";

    static {
        diub diubVar = new diub();
        e = diubVar;
        dsqw.cc(diub.class, diubVar);
    }

    private diub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0005ဈ\u0003", new Object[]{"f", "a", "b", "c", ditz.class, "d"});
            }
            if (i2 == 3) {
                return new diub();
            }
            if (i2 == 4) {
                return new diua();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<diub> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diub.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
