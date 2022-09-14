package defpackage;
/* compiled from: PG */
/* renamed from: dwjd  reason: default package */
/* loaded from: classes6.dex */
public final class dwjd extends dsqw<dwjd, dwjc> implements dssk {
    public static final dwjd i;
    private static volatile dssr<dwjd> l;
    public int a;
    public int c;
    public dvxt d;
    public dnqh e;
    public dnzj f;
    private boolean j;
    private byte k = 2;
    public int b = 10;
    public dspd g = dspd.b;
    public dsrf h = dsqz.b;

    static {
        dwjd dwjdVar = new dwjd();
        i = dwjdVar;
        dsqw.cc(dwjd.class, dwjdVar);
    }

    private dwjd() {
    }

    public static /* synthetic */ void c(dwjd dwjdVar) {
        dwjdVar.a |= 512;
        dwjdVar.j = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0001\u0002\u0002င\u0001\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bည\u0007\u000b\u001e\fင\u0002\u000eဇ\t", new Object[]{"a", "b", "d", "e", "f", "g", "h", dvxj.c(), "c", "j"});
            }
            if (i3 == 3) {
                return new dwjd();
            }
            if (i3 == 4) {
                return new dwjc();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dwjd> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dwjd.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
