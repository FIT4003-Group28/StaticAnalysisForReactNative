package defpackage;
/* compiled from: PG */
/* renamed from: dwco  reason: default package */
/* loaded from: classes6.dex */
public final class dwco extends dsqw<dwco, dwcn> implements dssk {
    public static final dwco f;
    private static volatile dssr<dwco> i;
    public int a;
    public dniu b;
    public dpky c;
    public dqjw e;
    private dnqh g;
    private byte h = 2;
    public String d = "";

    static {
        dwco dwcoVar = new dwco();
        f = dwcoVar;
        dsqw.cc(dwco.class, dwcoVar);
    }

    private dwco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005ဉ\u0004\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "d", "e", "g"});
            }
            if (i3 == 3) {
                return new dwco();
            }
            if (i3 == 4) {
                return new dwcn();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwco> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwco.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
