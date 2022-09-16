package defpackage;
/* compiled from: PG */
/* renamed from: aubq  reason: default package */
/* loaded from: classes2.dex */
public final class aubq extends aopi implements aoqv {
    public static final aubq a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arhs d;
    public arhs e;
    public apzg f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        aubq aubqVar = new aubq();
        a = aubqVar;
        aopi.registerDefaultInstance(aubq.class, aubqVar);
    }

    private aubq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ည\u0004\u0003ᐉ\u0005\u0004ᐉ\u0003\u0005ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"b", "c", "g", "i", "f", "d", "e"});
            case 3:
                return new aubq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aubq.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
