package defpackage;
/* compiled from: PG */
/* renamed from: asdw  reason: default package */
/* loaded from: classes2.dex */
public final class asdw extends aopi implements aoqv {
    public static final asdw a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public aunb d;
    private apzg g;
    private aoux h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        asdw asdwVar = new asdw();
        a = asdwVar;
        aopi.registerDefaultInstance(asdw.class, asdwVar);
    }

    private asdw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004", new Object[]{"b", "c", "d", "g", "h", "e"});
            case 3:
                return new asdw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asdw.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
