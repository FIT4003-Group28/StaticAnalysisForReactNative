package defpackage;
/* compiled from: PG */
/* renamed from: bjfs  reason: default package */
/* loaded from: classes3.dex */
public final class bjfs extends dsqw<bjfs, bjfr> implements dssk {
    public static final bjfs e;
    private static volatile dssr<bjfs> f;
    public int a;
    public bjfw b;
    public dsrj<bjfo> c = dssu.b;
    public String d = "";

    static {
        bjfs bjfsVar = new bjfs();
        e = bjfsVar;
        dsqw.cc(bjfs.class, bjfsVar);
    }

    private bjfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "c", bjfo.class, "d"});
            }
            if (i2 == 3) {
                return new bjfs();
            }
            if (i2 == 4) {
                return new bjfr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bjfs.class) {
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

    public final void b() {
        dsrj<bjfo> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
