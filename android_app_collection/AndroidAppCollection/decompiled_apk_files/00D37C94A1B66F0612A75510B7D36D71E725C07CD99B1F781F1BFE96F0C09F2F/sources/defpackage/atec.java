package defpackage;
/* compiled from: PG */
/* renamed from: atec  reason: default package */
/* loaded from: classes2.dex */
public final class atec extends aopi implements aoqv {
    public static final atec a;
    private static volatile aorb o;
    public int b;
    public avhn d;
    public avhn e;
    public arhs f;
    public arag g;
    public aopu h;
    public apok i;
    public apok j;
    public avhn k;
    public aunb l;
    public aunb m;
    public aoob n;
    private arag p;
    private apzg q;
    private aoux r;
    private byte s = 2;
    public aopu c = emptyProtobufList();

    static {
        atec atecVar = new atec();
        a = atecVar;
        aopi.registerDefaultInstance(atec.class, atecVar);
    }

    private atec() {
        emptyProtobufList();
        this.h = emptyProtobufList();
        this.n = aoob.b;
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\u000e\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u000b\tည\f\nᐉ\u0006\u000bЛ\fЛ\rᐉ\u0007\u000eᐉ\b\u000fᐉ\t\u0010ᐉ\n", new Object[]{"b", "p", "d", "e", "f", "g", "i", "r", "n", "j", "c", arag.class, "h", arag.class, "k", "l", "m", "q"});
            case 3:
                return new atec();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (atec.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
