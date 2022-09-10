package defpackage;
/* compiled from: PG */
/* renamed from: dwwv  reason: default package */
/* loaded from: classes6.dex */
public final class dwwv extends dsqw<dwwv, dwwu> implements dssk {
    public static final dwwv g;
    private static volatile dssr<dwwv> i;
    public int a;
    public dhjx b;
    public dpld c;
    public dpxk e;
    public int f;
    private byte h = 2;
    public dsrj<dnpo> d = dssu.b;

    static {
        dwwv dwwvVar = new dwwv();
        g = dwwvVar;
        dsqw.cc(dwwv.class, dwwvVar);
    }

    private dwwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0005ဉ\u0002\u0006င\u0003", new Object[]{"a", "b", "c", "d", dnpo.class, "e", "f"});
            }
            if (i3 == 3) {
                return new dwwv();
            }
            if (i3 == 4) {
                return new dwwu();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwwv> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwwv.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }

    public final void c() {
        dsrj<dnpo> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
