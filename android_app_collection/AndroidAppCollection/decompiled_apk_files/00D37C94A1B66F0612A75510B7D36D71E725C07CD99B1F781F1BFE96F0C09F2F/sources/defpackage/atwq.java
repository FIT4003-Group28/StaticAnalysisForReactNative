package defpackage;
/* compiled from: PG */
/* renamed from: atwq  reason: default package */
/* loaded from: classes2.dex */
public final class atwq extends aopi implements aoqv {
    public static final atwq a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag d;
    public atwp e;
    public atwp f;
    public apzg h;
    public arag i;
    private byte k = 2;
    public aopu g = emptyProtobufList();

    static {
        atwq atwqVar = new atwq();
        a = atwqVar;
        aopi.registerDefaultInstance(atwq.class, atwqVar);
    }

    private atwq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0001\u0007\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bЛ\tᐉ\u0005\nᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", atwr.class, "h", "i"});
            case 3:
                return new atwq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atwq.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
