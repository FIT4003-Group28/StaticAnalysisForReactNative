package defpackage;
/* compiled from: PG */
/* renamed from: araj  reason: default package */
/* loaded from: classes2.dex */
public final class araj extends aopi implements aoqv {
    public static final araj a;
    private static volatile aorb e;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public aopu d = aopi.emptyProtobufList();

    static {
        araj arajVar = new araj();
        a = arajVar;
        aopi.registerDefaultInstance(araj.class, arajVar);
    }

    private araj() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\n\u0003\u0000\u0001\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\n\u001a", new Object[]{"c", "b", arak.class, aral.class, "d"});
            case 3:
                return new araj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (araj.class) {
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
