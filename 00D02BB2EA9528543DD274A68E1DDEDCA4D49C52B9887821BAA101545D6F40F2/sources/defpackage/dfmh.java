package defpackage;
/* compiled from: PG */
/* renamed from: dfmh  reason: default package */
/* loaded from: classes6.dex */
public final class dfmh extends dsqw<dfmh, dfmc> implements dssk {
    public static final dfmh h;
    private static volatile dssr<dfmh> j;
    public int a;
    public dgrh b;
    public float c;
    public float d;
    public float e;
    public float f;
    private byte i = 2;
    public dsrj<dfmg> g = dssu.b;

    static {
        dfmh dfmhVar = new dfmh();
        h = dfmhVar;
        dsqw.cc(dfmh.class, dfmhVar);
    }

    private dfmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0002\u0003ခ\u0003\u0004\u001b\u0005ခ\u0001\u0006ခ\u0004", new Object[]{"a", "b", "d", "e", "g", dfmg.class, "c", "f"});
            }
            if (i2 == 3) {
                return new dfmh();
            }
            if (i2 == 4) {
                return new dfmc();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dfmh> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dfmh.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
