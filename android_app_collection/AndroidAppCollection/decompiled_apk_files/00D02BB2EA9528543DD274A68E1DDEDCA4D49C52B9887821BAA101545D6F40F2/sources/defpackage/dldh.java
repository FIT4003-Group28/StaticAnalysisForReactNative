package defpackage;
/* compiled from: PG */
/* renamed from: dldh  reason: default package */
/* loaded from: classes6.dex */
public final class dldh extends dsqw<dldh, dldc> implements dssk {
    public static final dldh d;
    private static volatile dssr<dldh> g;
    private int e;
    private byte f = 2;
    public String a = "";
    public String b = "";
    public dsrj<dlde> c = dssu.b;

    static {
        dldh dldhVar = new dldh();
        d = dldhVar;
        dsqw.cc(dldh.class, dldhVar);
    }

    private dldh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"e", "c", dlde.class, "a", "b"});
            }
            if (i2 == 3) {
                return new dldh();
            }
            if (i2 == 4) {
                return new dldc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dldh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dldh.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
