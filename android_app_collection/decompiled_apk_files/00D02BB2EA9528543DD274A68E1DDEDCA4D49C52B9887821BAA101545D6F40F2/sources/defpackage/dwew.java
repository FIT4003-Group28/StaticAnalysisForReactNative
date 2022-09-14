package defpackage;
/* compiled from: PG */
/* renamed from: dwew  reason: default package */
/* loaded from: classes.dex */
public final class dwew extends dsqw<dwew, dwev> implements dssk {
    public static final dwew e;
    private static volatile dssr<dwew> f;
    public int a;
    public dsrj<drcg> b = dssu.b;
    public boolean c;
    public boolean d;

    static {
        dwew dwewVar = new dwew();
        e = dwewVar;
        dsqw.cc(dwew.class, dwewVar);
    }

    private dwew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0004ဇ\u0001", new Object[]{"a", "b", drcg.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dwew();
            }
            if (i2 == 4) {
                return new dwev();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwew> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwew.class) {
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

    public final void c() {
        dsrj<drcg> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
