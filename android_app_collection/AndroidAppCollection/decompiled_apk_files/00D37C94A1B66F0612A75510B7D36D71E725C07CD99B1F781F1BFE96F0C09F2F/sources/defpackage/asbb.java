package defpackage;
/* compiled from: PG */
/* renamed from: asbb  reason: default package */
/* loaded from: classes2.dex */
public final class asbb extends aopi implements aoqv {
    public static final asbb a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public boolean e;
    private byte g = 2;
    public aopu d = aopi.emptyProtobufList();

    static {
        asbb asbbVar = new asbb();
        a = asbbVar;
        aopi.registerDefaultInstance(asbb.class, asbbVar);
    }

    private asbb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asbb();
            case 4:
                return new aopa((char[][][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asbb.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
