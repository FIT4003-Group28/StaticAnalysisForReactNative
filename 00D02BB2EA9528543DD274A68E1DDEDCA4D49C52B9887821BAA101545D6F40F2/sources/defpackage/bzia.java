package defpackage;
/* compiled from: PG */
/* renamed from: bzia  reason: default package */
/* loaded from: classes4.dex */
public final class bzia extends dsqw<bzia, bzhy> implements dssk {
    public static final bzia j;
    private static volatile dssr<bzia> l;
    public int a;
    public Object c;
    public bzju d;
    public int i;
    public int b = 0;
    private byte k = 2;
    public String e = "";
    public String f = "";
    public dsrj<bzjd> g = dssu.b;
    public String h = "";

    static {
        bzia bziaVar = new bzia();
        j = bziaVar;
        dsqw.cc(bzia.class, bziaVar);
    }

    private bzia() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0001\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001b\u0007ဈ\u0005\nင\u0007", new Object[]{"c", "b", "a", bzjh.class, bzjl.class, "d", "e", "f", "g", bzjd.class, "h", "i"});
            }
            if (i2 == 3) {
                return new bzia();
            }
            if (i2 == 4) {
                return new bzhy();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<bzia> dssrVar = l;
            if (dssrVar == null) {
                synchronized (bzia.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }

    public final void b() {
        dsrj<bzjd> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
