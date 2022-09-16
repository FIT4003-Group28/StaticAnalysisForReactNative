package defpackage;
/* compiled from: PG */
/* renamed from: aqbw  reason: default package */
/* loaded from: classes2.dex */
public final class aqbw extends aopi implements aoqv {
    public static final aqbw a;
    private static volatile aorb m;
    public int b;
    public aqax c;
    public aunb d;
    public aunb e;
    public aqbo f;
    public aqbh g;
    public aqbv i;
    public boolean j;
    public int k;
    public boolean l;
    private aunb n;
    private aunb o;
    private arag p;
    private arag q;
    private aoux r;
    private arag s;
    private aqby t;
    private aqbl u;
    private arag v;
    private byte w = 2;
    public aoob h = aoob.b;

    static {
        aqbw aqbwVar = new aqbw();
        a = aqbwVar;
        aopi.registerDefaultInstance(aqbw.class, aqbwVar);
    }

    private aqbw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0017\u0013\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0005\u0003ᐉ\u0007\u0004ᐉ\b\u0006ည\t\u0007ᐉ\n\bᐉ\f\tဉ\r\nဇ\u000e\u000bᐉ\u000f\fᐉ\u0006\rဌ\u0010\u000fᐉ\u0012\u0010ᐉ\u0002\u0011ᐉ\u0001\u0013ᐉ\u0004\u0014ᐉ\u0014\u0015ᐉ\u0003\u0017ဇ\u0016", new Object[]{"b", "c", "f", "p", "q", "h", "r", "s", "i", "j", "t", "g", "k", apvq.n, "u", "e", "d", "o", "v", "n", "l"});
            case 3:
                return new aqbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqbw.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
