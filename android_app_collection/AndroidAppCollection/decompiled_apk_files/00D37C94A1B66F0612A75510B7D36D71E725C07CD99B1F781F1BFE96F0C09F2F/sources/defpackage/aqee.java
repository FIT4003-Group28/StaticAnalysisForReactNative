package defpackage;
/* compiled from: PG */
/* renamed from: aqee  reason: default package */
/* loaded from: classes2.dex */
public final class aqee extends aopi implements aoqv {
    public static final aqee a;
    private static volatile aorb d;
    private int e;
    private arag f;
    private arag g;
    private aoux h;
    private byte i = 2;
    public aopu b = emptyProtobufList();
    public aoob c = aoob.b;

    static {
        aqee aqeeVar = new aqee();
        a = aqeeVar;
        aopi.registerDefaultInstance(aqee.class, aqeeVar);
    }

    private aqee() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0004\u0001Л\u0003ᐉ\u0002\u0004ည\u0003\u0006ᐉ\u0000\u0007ᐉ\u0001", new Object[]{"e", "b", aqed.class, "h", "c", "f", "g"});
            case 3:
                return new aqee();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqee.class) {
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
