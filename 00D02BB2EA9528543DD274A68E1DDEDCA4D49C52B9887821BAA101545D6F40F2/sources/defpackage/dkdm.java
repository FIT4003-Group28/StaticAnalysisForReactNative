package defpackage;
/* compiled from: PG */
/* renamed from: dkdm  reason: default package */
/* loaded from: classes6.dex */
public final class dkdm extends dsqw<dkdm, dkdh> implements dssk {
    public static final dkdm e;
    private static volatile dssr<dkdm> g;
    public int a;
    private byte f = 2;
    public dsrj<dkdl> b = dssu.b;
    public String c = "";
    public String d = "";

    static {
        dkdm dkdmVar = new dkdm();
        e = dkdmVar;
        dsqw.cc(dkdm.class, dkdmVar);
    }

    private dkdm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0001\u0004ဈ\u0000", new Object[]{"a", "b", dkdl.class, "d", "c"});
            }
            if (i2 == 3) {
                return new dkdm();
            }
            if (i2 == 4) {
                return new dkdh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dkdm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkdm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
