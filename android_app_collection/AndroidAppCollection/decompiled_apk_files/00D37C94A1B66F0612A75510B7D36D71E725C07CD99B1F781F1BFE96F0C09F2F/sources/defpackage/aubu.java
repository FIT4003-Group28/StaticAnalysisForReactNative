package defpackage;
/* compiled from: PG */
/* renamed from: aubu  reason: default package */
/* loaded from: classes2.dex */
public final class aubu extends aopi implements aoqv {
    public static final aubu a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aoob d = aoob.b;

    static {
        aubu aubuVar = new aubu();
        a = aubuVar;
        aopi.registerDefaultInstance(aubu.class, aubuVar);
    }

    private aubu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aubu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aubu.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
