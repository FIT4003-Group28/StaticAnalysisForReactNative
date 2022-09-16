package defpackage;
/* compiled from: PG */
/* renamed from: awgw  reason: default package */
/* loaded from: classes2.dex */
public final class awgw extends aopi implements aoqv {
    public static final awgw a;
    private static volatile aorb q;
    public int b;
    public long c;
    public int d;
    public int e;
    public int g;
    public long h;
    public boolean i;
    public arag j;
    public apok k;
    public arag l;
    public arag m;
    public apzg n;
    public aopu o;
    public apzg p;
    private apok r;
    private byte s = 2;
    public int f = 10000;

    static {
        awgw awgwVar = new awgw();
        a = awgwVar;
        aopi.registerDefaultInstance(awgw.class, awgwVar);
    }

    private awgw() {
        emptyProtobufList();
        this.o = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\b\u0001ဂ\u0000\u0003ᐉ\n\u0004ᐉ\u000b\u0005ဋ\u0003\u0006ᐉ\f\u0007ᐉ\u000e\nᐉ\r\u000bင\u0001\rЛ\u000eဌ\u0004\u000fဂ\u0005\u0011ᐉ\u0010\u0012ဇ\u0007\u0013ဋ\u0002\u0014ᐉ\u000f", new Object[]{"b", "c", "j", "k", "f", "l", "m", "r", "d", "o", apzg.class, "g", awgv.a(), "h", "p", "i", "e", "n"});
            case 3:
                return new awgw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (awgw.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
