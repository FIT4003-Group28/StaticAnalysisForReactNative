package defpackage;
/* compiled from: PG */
/* renamed from: aqmq  reason: default package */
/* loaded from: classes2.dex */
public final class aqmq extends aopi implements aoqv {
    public static final aqmq a;
    public static final aopg b;
    private static volatile aorb d;
    public apzg c;
    private int e;
    private byte f = 2;

    static {
        aqmq aqmqVar = new aqmq();
        a = aqmqVar;
        aopi.registerDefaultInstance(aqmq.class, aqmqVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aqmqVar, aqmqVar, null, 388636837, aosj.MESSAGE, aqmq.class);
    }

    private aqmq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"e", "c"});
            case 3:
                return new aqmq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqmq.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
