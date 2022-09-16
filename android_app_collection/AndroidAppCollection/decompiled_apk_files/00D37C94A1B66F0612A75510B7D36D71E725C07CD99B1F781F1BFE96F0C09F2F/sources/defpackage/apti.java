package defpackage;
/* compiled from: PG */
/* renamed from: apti  reason: default package */
/* loaded from: classes2.dex */
public final class apti extends aopi implements aoqv {
    public static final apti a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private apth e;
    private apzg f;
    private apok g;
    private arag h;
    private arag i;
    private byte j = 2;

    static {
        apti aptiVar = new apti();
        a = aptiVar;
        aopi.registerDefaultInstance(apti.class, aptiVar);
    }

    private apti() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apti();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apti.class) {
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
