package defpackage;
/* compiled from: PG */
/* renamed from: doft  reason: default package */
/* loaded from: classes.dex */
public final class doft extends dsqw<doft, dofo> implements dssk {
    public static final doft h;
    private static volatile dssr<doft> i;
    public int a;
    public dnpq b;
    public dnfg c;
    public String d = "";
    public String e = "";
    public dsrj<dofs> f;
    public dofq g;

    static {
        doft doftVar = new doft();
        h = doftVar;
        dsqw.cc(doft.class, doftVar);
    }

    private doft() {
        dssu<Object> dssuVar = dssu.b;
        this.f = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0004\u0005\u001b\u0007ဉ\u0001\u000bဈ\u0002\fဉ\t", new Object[]{"a", "b", "e", "f", dofs.class, "c", "d", "g"});
            }
            if (i3 == 3) {
                return new doft();
            }
            if (i3 == 4) {
                return new dofo();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<doft> dssrVar = i;
            if (dssrVar == null) {
                synchronized (doft.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
