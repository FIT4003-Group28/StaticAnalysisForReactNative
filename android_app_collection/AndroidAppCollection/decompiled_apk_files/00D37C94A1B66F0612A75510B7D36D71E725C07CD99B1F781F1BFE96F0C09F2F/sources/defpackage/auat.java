package defpackage;
/* compiled from: PG */
/* renamed from: auat  reason: default package */
/* loaded from: classes2.dex */
public final class auat extends aopi implements aoqv {
    public static final auat a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private byte f = 2;

    static {
        auat auatVar = new auat();
        a = auatVar;
        aopi.registerDefaultInstance(auat.class, auatVar);
    }

    private auat() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new auat();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auat.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
