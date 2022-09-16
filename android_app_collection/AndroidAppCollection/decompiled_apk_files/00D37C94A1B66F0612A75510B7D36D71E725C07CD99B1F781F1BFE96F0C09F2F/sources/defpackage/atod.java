package defpackage;
/* compiled from: PG */
/* renamed from: atod  reason: default package */
/* loaded from: classes2.dex */
public final class atod extends aopi implements aoqv {
    public static final atod a;
    private static volatile aorb b;
    private int c;
    private atoc d;
    private atob e;
    private byte f = 2;

    static {
        atod atodVar = new atod();
        a = atodVar;
        aopi.registerDefaultInstance(atod.class, atodVar);
    }

    private atod() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uec51ᡎ\ue86c᱒\u0002\u0000\u0000\u0002\uec51ᡎᐉ\u0000\ue86c᱒ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new atod();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atod.class) {
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
