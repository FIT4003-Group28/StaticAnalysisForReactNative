package defpackage;
/* compiled from: PG */
/* renamed from: auwd  reason: default package */
/* loaded from: classes2.dex */
public final class auwd extends aopi implements aoqv {
    public static final auwd a;
    private static volatile aorb c;
    public apaq b;
    private int d;
    private aoux e;
    private aozz f;
    private byte g = 2;

    static {
        auwd auwdVar = new auwd();
        a = auwdVar;
        aopi.registerDefaultInstance(auwd.class, auwdVar);
    }

    private auwd() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0002\u0005ᐉ\u0005", new Object[]{"d", "b", "e", "f"});
            case 3:
                return new auwd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auwd.class) {
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
