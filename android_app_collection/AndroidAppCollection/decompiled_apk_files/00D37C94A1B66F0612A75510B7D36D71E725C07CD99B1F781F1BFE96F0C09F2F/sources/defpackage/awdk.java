package defpackage;
/* compiled from: PG */
/* renamed from: awdk  reason: default package */
/* loaded from: classes2.dex */
public final class awdk extends aopi implements aoqv {
    public static final awdk a;
    private static volatile aorb p;
    public int b;
    public avhn c;
    public apzg d;
    public arag e;
    public arag f;
    public arag g;
    public apmg h;
    public awct j;
    public aunb k;
    public awcv m;
    public aovs n;
    private avss q;
    private aoux r;
    private byte s = 2;
    public aopu i = emptyProtobufList();
    public String l = "";
    public aoob o = aoob.b;

    static {
        awdk awdkVar = new awdk();
        a = awdkVar;
        aopi.registerDefaultInstance(awdk.class, awdkVar);
    }

    private awdk() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\f\u0007ည\r\bᐉ\u0006\tЛ\nᐉ\u0007\u000bᐉ\n\fဉ\u000b\rᐉ\u0005\u000eᐉ\b\u000fဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", "r", "o", "h", "i", avhc.class, "j", "m", "n", "q", "k", "l"});
            case 3:
                return new awdk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (awdk.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
