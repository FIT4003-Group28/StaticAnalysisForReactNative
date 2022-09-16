package defpackage;
/* compiled from: PG */
/* renamed from: atuq  reason: default package */
/* loaded from: classes2.dex */
public final class atuq extends aopi implements aoqv {
    public static final atuq a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public long d;
    public apzg e;
    public arhs f;
    public boolean g;
    private aoux j;
    private byte k = 2;
    public aoob h = aoob.b;

    static {
        atuq atuqVar = new atuq();
        a = atuqVar;
        aopi.registerDefaultInstance(atuq.class, atuqVar);
    }

    private atuq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h"});
            case 3:
                return new atuq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atuq.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
