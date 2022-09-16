package defpackage;
/* compiled from: PG */
/* renamed from: dxnk  reason: default package */
/* loaded from: classes6.dex */
public final class dxnk extends dsqw<dxnk, dxni> implements dssk {
    public static final dxnk j;
    private static volatile dssr<dxnk> k;
    public dxne b;
    public dxmy c;
    public dxms g;
    public dxof h;
    public dssd<String, dsok> d = dssd.b;
    public String a = "";
    public dsrj<dxnp> e = dssu.b;
    public dsrj<dxnp> f = dssu.b;
    public String i = "";

    static {
        dxnk dxnkVar = new dxnk();
        j = dxnkVar;
        dsqw.cc(dxnk.class, dxnkVar);
    }

    private dxnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0000\t\u0000\u0000\u0001\n\t\u0001\u0002\u0000\u0001Ȉ\u0002\t\u0003\t\u00042\u0006\u001b\u0007\u001b\b\t\t\t\nȈ", new Object[]{"a", "b", "c", "d", dxnj.a, "e", dxnp.class, "f", dxnp.class, "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dxnk();
            }
            if (i2 == 4) {
                return new dxni();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dxnk.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
