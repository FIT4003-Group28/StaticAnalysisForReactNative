package defpackage;
/* compiled from: PG */
/* renamed from: avfo  reason: default package */
/* loaded from: classes2.dex */
public final class avfo extends aopi implements aoqv {
    public static final avfo a;
    private static volatile aorb o;
    public int b;
    public apzg d;
    public boolean f;
    public arhs g;
    public avfp h;
    public avfm i;
    public avfl j;
    public avfk k;
    public avfn m;
    private aoux p;
    private byte q = 2;
    public String c = "";
    public String e = "";
    public String l = "";
    public aoob n = aoob.b;

    static {
        avfo avfoVar = new avfo();
        a = avfoVar;
        aopi.registerDefaultInstance(avfo.class, avfoVar);
    }

    private avfo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0007\u0001ᐉ\u0001\u0002ဈ\u0002\u0003ဇ\u0003\u0004ᐉ\r\u0006ᐉ\u0005\u0007ᐉ\u000b\bᐉ\f\tဉ\t\nᐉ\u000f\u000bဈ\u0000\rᐉ\u0012\u000eည\u0013\u0010ဈ\u000e", new Object[]{"b", "d", "e", "f", "k", "g", "i", "j", "h", "m", "c", "p", "n", "l"});
            case 3:
                return new avfo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (avfo.class) {
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
