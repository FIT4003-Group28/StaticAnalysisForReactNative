package defpackage;
/* compiled from: PG */
/* renamed from: auwo  reason: default package */
/* loaded from: classes2.dex */
public final class auwo extends aopi implements aoqv {
    public static final auwo a;
    private static volatile aorb d;
    public aunb b;
    public aunb c;
    private int e;
    private aoux f;
    private aozz g;
    private byte h = 2;

    static {
        auwo auwoVar = new auwo();
        a = auwoVar;
        aopi.registerDefaultInstance(auwo.class, auwoVar);
    }

    private auwo() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004\tᐉ\u0006", new Object[]{"e", "b", "c", "f", "g"});
            case 3:
                return new auwo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auwo.class) {
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
