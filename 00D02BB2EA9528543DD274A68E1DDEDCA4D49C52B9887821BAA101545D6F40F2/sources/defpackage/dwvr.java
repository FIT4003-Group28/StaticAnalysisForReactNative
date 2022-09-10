package defpackage;
/* compiled from: PG */
/* renamed from: dwvr  reason: default package */
/* loaded from: classes6.dex */
public final class dwvr extends dsqw<dwvr, dwvq> implements dssk {
    public static final dwvr e;
    private static volatile dssr<dwvr> h;
    public int a;
    public doro b;
    public dorq c;
    public dnwb d;
    private dnqh f;
    private byte g = 2;

    static {
        dwvr dwvrVar = new dwvr();
        e = dwvrVar;
        dsqw.cc(dwvr.class, dwvrVar);
    }

    private dwvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဉ\u0002\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "d", "f"});
            }
            if (i2 == 3) {
                return new dwvr();
            }
            if (i2 == 4) {
                return new dwvq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwvr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwvr.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
