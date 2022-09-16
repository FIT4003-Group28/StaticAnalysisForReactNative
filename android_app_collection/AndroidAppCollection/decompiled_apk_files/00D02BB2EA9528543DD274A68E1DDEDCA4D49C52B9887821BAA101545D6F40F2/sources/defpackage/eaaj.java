package defpackage;
/* compiled from: PG */
/* renamed from: eaaj  reason: default package */
/* loaded from: classes.dex */
public final class eaaj extends dsqw<eaaj, eaah> implements dssk {
    public static final eaaj f;
    private static volatile dssr<eaaj> h;
    public int a;
    public long b;
    public int c;
    public eaar e;
    private byte g = 2;
    public dsrj<eaam> d = dssu.b;

    static {
        eaaj eaajVar = new eaaj();
        f = eaajVar;
        dsqw.cc(eaaj.class, eaajVar);
    }

    private eaaj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0006ဉ\u0004", new Object[]{"a", "b", "d", eaam.class, "c", eaai.a, "e"});
            }
            if (i2 == 3) {
                return new eaaj();
            }
            if (i2 == 4) {
                return new eaah();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<eaaj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (eaaj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }

    public final void c() {
        dsrj<eaam> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
