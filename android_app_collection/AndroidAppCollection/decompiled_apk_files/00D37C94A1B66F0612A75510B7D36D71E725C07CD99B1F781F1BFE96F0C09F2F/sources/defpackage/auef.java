package defpackage;
/* compiled from: PG */
/* renamed from: auef  reason: default package */
/* loaded from: classes2.dex */
public final class auef extends aopi implements aoqv {
    public static final auef a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private arag e;
    private arag f;
    private arag g;
    private aunb h;
    private byte i = 2;

    static {
        auef auefVar = new auef();
        a = auefVar;
        aopi.registerDefaultInstance(auef.class, auefVar);
    }

    private auef() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"c", "d", "e", "h", "f", "g"});
            case 3:
                return new auef();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auef.class) {
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
