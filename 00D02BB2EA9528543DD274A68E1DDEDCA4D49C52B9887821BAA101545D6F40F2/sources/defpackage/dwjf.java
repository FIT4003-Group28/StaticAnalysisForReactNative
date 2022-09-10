package defpackage;
/* compiled from: PG */
/* renamed from: dwjf  reason: default package */
/* loaded from: classes6.dex */
public final class dwjf extends dsqw<dwjf, dwje> implements dssk {
    public static final dwjf g;
    private static volatile dssr<dwjf> i;
    public int a;
    public dqfw f;
    private byte h = 2;
    public dsrj<dwjb> b = dssu.b;
    public String c = "";
    public dspd d = dspd.b;
    public dsrj<dvxl> e = dssu.b;

    static {
        dwjf dwjfVar = new dwjf();
        g = dwjfVar;
        dsqw.cc(dwjf.class, dwjfVar);
    }

    private dwjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0004\f\u0005\u0000\u0002\u0001\u0004ဈ\u0001\u0006Л\tည\u0003\n\u001b\fဉ\u0005", new Object[]{"a", "c", "b", dwjb.class, "d", "e", dvxl.class, "f"});
            }
            if (i3 == 3) {
                return new dwjf();
            }
            if (i3 == 4) {
                return new dwje();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwjf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwjf.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
