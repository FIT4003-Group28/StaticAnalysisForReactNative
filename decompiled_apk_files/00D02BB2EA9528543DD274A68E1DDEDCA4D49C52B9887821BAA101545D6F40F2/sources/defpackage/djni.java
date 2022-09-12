package defpackage;
/* compiled from: PG */
/* renamed from: djni  reason: default package */
/* loaded from: classes6.dex */
public final class djni extends dsqw<djni, djnf> implements dssk {
    public static final djni d;
    private static volatile dssr<djni> e;
    public int a;
    public int b;
    public dsrj<djnh> c = dssu.b;

    static {
        djni djniVar = new djni();
        d = djniVar;
        dsqw.cc(djni.class, djniVar);
    }

    private djni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0003\u001b", new Object[]{"a", "b", "c", djnh.class});
            }
            if (i2 == 3) {
                return new djni();
            }
            if (i2 == 4) {
                return new djnf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djni> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djni.class) {
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
        dsrj<djnh> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
