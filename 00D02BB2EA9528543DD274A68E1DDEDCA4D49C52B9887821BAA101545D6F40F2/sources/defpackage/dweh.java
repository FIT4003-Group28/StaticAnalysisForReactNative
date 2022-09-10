package defpackage;
/* compiled from: PG */
/* renamed from: dweh  reason: default package */
/* loaded from: classes6.dex */
public final class dweh extends dsqw<dweh, dweg> implements dssk {
    public static final dweh d;
    private static volatile dssr<dweh> e;
    public int a;
    public dsrj<dwef> b = dssu.b;
    public dhkd c;

    static {
        dweh dwehVar = new dweh();
        d = dwehVar;
        dsqw.cc(dweh.class, dwehVar);
    }

    private dweh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dwef.class, "c"});
            }
            if (i2 == 3) {
                return new dweh();
            }
            if (i2 == 4) {
                return new dweg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dweh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dweh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void c() {
        dsrj<dwef> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
