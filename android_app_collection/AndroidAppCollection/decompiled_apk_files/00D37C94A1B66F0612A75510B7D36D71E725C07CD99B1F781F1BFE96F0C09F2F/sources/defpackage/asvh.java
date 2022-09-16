package defpackage;
/* compiled from: PG */
/* renamed from: asvh  reason: default package */
/* loaded from: classes2.dex */
public final class asvh extends aopi implements aoqv {
    public static final asvh a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public aunb d;
    public aunb e;
    public aunb f;
    public arag h;
    public aunb i;
    private byte k = 2;
    public aopu g = emptyProtobufList();

    static {
        asvh asvhVar = new asvh();
        a = asvhVar;
        aopi.registerDefaultInstance(asvh.class, asvhVar);
    }

    private asvh() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0007\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", aunb.class, "h", "i"});
            case 3:
                return new asvh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asvh.class) {
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
