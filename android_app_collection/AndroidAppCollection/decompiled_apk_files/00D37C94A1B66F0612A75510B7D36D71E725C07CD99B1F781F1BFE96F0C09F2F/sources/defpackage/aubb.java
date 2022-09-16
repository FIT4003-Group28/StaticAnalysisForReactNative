package defpackage;
/* compiled from: PG */
/* renamed from: aubb  reason: default package */
/* loaded from: classes2.dex */
public final class aubb extends aopi implements aoqv {
    public static final aubb a;
    private static volatile aorb d;
    public int b;
    public aubk c;
    private avpo e;
    private byte f = 2;

    static {
        aubb aubbVar = new aubb();
        a = aubbVar;
        aopi.registerDefaultInstance(aubb.class, aubbVar);
    }

    private aubb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uebb2ᭁ\uf5a0濼\u0002\u0000\u0000\u0002\uebb2ᭁᐉ\u0000\uf5a0濼ᐉ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new aubb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aubb.class) {
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
