package defpackage;
/* compiled from: PG */
/* renamed from: auvj  reason: default package */
/* loaded from: classes2.dex */
public final class auvj extends aopi implements aoqv {
    public static final auvj a;
    public static final aopg b;
    private static volatile aorb d;
    public aunb c;
    private int e;
    private arag f;
    private byte g = 2;

    static {
        auvj auvjVar = new auvj();
        a = auvjVar;
        aopi.registerDefaultInstance(auvj.class, auvjVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, auvjVar, auvjVar, null, 387380578, aosj.MESSAGE, auvj.class);
    }

    private auvj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "c", "f"});
            case 3:
                return new auvj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auvj.class) {
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
