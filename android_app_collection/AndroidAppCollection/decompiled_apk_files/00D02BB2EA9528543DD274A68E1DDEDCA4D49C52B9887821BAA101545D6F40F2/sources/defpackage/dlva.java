package defpackage;
/* compiled from: PG */
/* renamed from: dlva  reason: default package */
/* loaded from: classes6.dex */
public final class dlva extends dsqw<dlva, dluz> implements dssk {
    public static final dlva d;
    private static volatile dssr<dlva> e;
    public int a;
    public int b;
    public dsrj<dspd> c = dssu.b;

    static {
        dlva dlvaVar = new dlva();
        d = dlvaVar;
        dsqw.cc(dlva.class, dlvaVar);
    }

    private dlva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001c", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlva();
            }
            if (i2 == 4) {
                return new dluz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlva> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlva.class) {
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

    public final void b() {
        dsrj<dspd> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
