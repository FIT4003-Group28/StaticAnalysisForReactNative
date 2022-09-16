package defpackage;
/* compiled from: PG */
/* renamed from: auec  reason: default package */
/* loaded from: classes2.dex */
public final class auec extends aopi implements aoqv {
    public static final auec a;
    private static volatile aorb e;
    public int b;
    public audx c;
    public audw d;
    private audu f;
    private audt g;
    private byte h = 2;

    static {
        auec auecVar = new auec();
        a = auecVar;
        aopi.registerDefaultInstance(auec.class, auecVar);
    }

    private auec() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb90▦\ue8d8\u2baf\u0004\u0000\u0000\u0004\ueb90▦ᐉ\u0000ﶯ✂ᐉ\u0001祉\u2b8eᐉ\u0003\ue8d8\u2bafᐉ\u0002", new Object[]{"b", "f", "g", "d", "c"});
            case 3:
                return new auec();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auec.class) {
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
