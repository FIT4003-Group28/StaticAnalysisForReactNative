package defpackage;
/* compiled from: PG */
/* renamed from: uav  reason: default package */
/* loaded from: classes4.dex */
public final class uav extends aopi implements aoqv {
    public static final uav a;
    private static volatile aorb d;
    public aogp b;
    public uau c;
    private int e;
    private byte f = 2;

    static {
        uav uavVar = new uav();
        a = uavVar;
        aopi.registerDefaultInstance(uav.class, uavVar);
    }

    private uav() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new uav();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (uav.class) {
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
