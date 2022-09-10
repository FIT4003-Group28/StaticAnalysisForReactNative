package defpackage;
/* compiled from: PG */
/* renamed from: djfx  reason: default package */
/* loaded from: classes6.dex */
public final class djfx extends dsqw<djfx, djfu> implements dssk {
    public static final djfx e;
    private static volatile dssr<djfx> g;
    public int a;
    public int b;
    private byte f = 2;
    public dsrj<djvd> c = dssu.b;
    public dsrj<djev> d = dssu.b;

    static {
        djfx djfxVar = new djfx();
        e = djfxVar;
        dsqw.cc(djfx.class, djfxVar);
    }

    private djfx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဌ\u0000\u0002\u001b\u0003Л", new Object[]{"a", "b", djfv.a, "c", djvd.class, "d", djev.class});
            }
            if (i2 == 3) {
                return new djfx();
            }
            if (i2 == 4) {
                return new djfu();
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
            dssr<djfx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djfx.class) {
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

    public final void b() {
        dsrj<djev> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
