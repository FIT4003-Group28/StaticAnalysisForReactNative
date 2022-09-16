package defpackage;
/* compiled from: PG */
/* renamed from: auvp  reason: default package */
/* loaded from: classes2.dex */
public final class auvp extends aopi implements aoqv {
    public static final auvp a;
    private static volatile aorb c;
    public aunb b;
    private int d;
    private aunb e;
    private byte f = 2;

    static {
        auvp auvpVar = new auvp();
        a = auvpVar;
        aopi.registerDefaultInstance(auvp.class, auvpVar);
    }

    private auvp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "e", "b"});
            case 3:
                return new auvp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auvp.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
