package defpackage;
/* compiled from: PG */
/* renamed from: apty  reason: default package */
/* loaded from: classes2.dex */
public final class apty extends aopi implements aoqv {
    public static final apty a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aptz f;
    private apzg g;
    private arag h;
    private arag i;
    private byte j = 2;

    static {
        apty aptyVar = new apty();
        a = aptyVar;
        aopi.registerDefaultInstance(apty.class, aptyVar);
    }

    private apty() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apty();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apty.class) {
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
