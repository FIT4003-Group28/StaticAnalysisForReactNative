package defpackage;
/* compiled from: PG */
/* renamed from: dwjj  reason: default package */
/* loaded from: classes6.dex */
public final class dwjj extends dsqw<dwjj, dwji> implements dssk {
    public static final dwjj k;
    private static volatile dssr<dwjj> n;
    public int a;
    public dxbp b;
    public dwiv c;
    public dvuh e;
    public dwir f;
    public dvzj g;
    public dpjx h;
    public dhjx i;
    public dsrj<dwjj> j;
    private diji l;
    private byte m = 2;
    public dspd d = dspd.b;

    static {
        dwjj dwjjVar = new dwjj();
        k = dwjjVar;
        dsqw.cc(dwjj.class, dwjjVar);
    }

    private dwjj() {
        dssu<Object> dssuVar = dssu.b;
        this.j = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဉ\u0007\bဉ\b\nЛ\u000bᐉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", dwjj.class, "l"});
            }
            if (i2 == 3) {
                return new dwjj();
            }
            if (i2 == 4) {
                return new dwji();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dwjj> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dwjj.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
