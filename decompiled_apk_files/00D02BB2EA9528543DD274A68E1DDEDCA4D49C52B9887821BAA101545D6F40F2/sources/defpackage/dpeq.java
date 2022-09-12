package defpackage;
/* compiled from: PG */
/* renamed from: dpeq  reason: default package */
/* loaded from: classes6.dex */
public final class dpeq extends dsqs<dpeq, dpeh> implements dsqt {
    public static final dpeq m;
    private static volatile dssr<dpeq> o;
    public int a;
    public boolean c;
    public dozz g;
    public dpfx i;
    public dpep k;
    public int l;
    private byte n = 2;
    public dsrj<dpco> b = dssu.b;
    public dsrj<dozz> d = dssu.b;
    public dsrj<dozz> e = dssu.b;
    public dsrj<dozz> f = dssu.b;
    public dsrj<dozz> h = dssu.b;
    public dsrj<dozz> j = dssu.b;

    static {
        dpeq dpeqVar = new dpeq();
        m = dpeqVar;
        dsqw.cc(dpeq.class, dpeqVar);
    }

    private dpeq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0006\u0006\u0001\u001b\u0002Л\u0003ဌ\u0005\u0004Л\u0005ဇ\u0001\u0006ဉ\u0004\bЛ\tᐉ\u0002\nဉ\u0003\u000bЛ\fЛ", new Object[]{"a", "b", dpco.class, "d", dozz.class, "l", dpej.c(), "e", dozz.class, "c", "k", "f", dozz.class, "g", "i", "h", dozz.class, "j", dozz.class});
            }
            if (i2 == 3) {
                return new dpeq();
            }
            if (i2 == 4) {
                return new dpeh();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<dpeq> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dpeq.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }

    public final void b() {
        dsrj<dpco> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
