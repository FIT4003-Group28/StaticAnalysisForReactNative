package defpackage;
/* compiled from: PG */
/* renamed from: avbq  reason: default package */
/* loaded from: classes2.dex */
public final class avbq extends aopi implements aoqv {
    public static final avbq a;
    private static volatile aorb g;
    public int b;
    public arag d;
    public long e;
    private aoux h;
    private apok i;
    private byte j = 2;
    public aoob c = aoob.b;
    public String f = "";

    static {
        avbq avbqVar = new avbq();
        a = avbqVar;
        aopi.registerDefaultInstance(avbq.class, avbqVar);
    }

    private avbq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"b", "h", "c", "d", "i", "e", "f"});
            case 3:
                return new avbq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avbq.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
