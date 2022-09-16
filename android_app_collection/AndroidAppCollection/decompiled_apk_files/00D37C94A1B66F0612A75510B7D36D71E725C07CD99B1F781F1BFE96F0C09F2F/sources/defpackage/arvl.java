package defpackage;
/* compiled from: PG */
/* renamed from: arvl  reason: default package */
/* loaded from: classes2.dex */
public final class arvl extends aopi implements aoqv {
    public static final arvl a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public aopu d;
    public apzg e;
    private byte g = 2;

    static {
        arvl arvlVar = new arvl();
        a = arvlVar;
        aopi.registerDefaultInstance(arvl.class, arvlVar);
    }

    private arvl() {
        emptyProtobufList();
        this.d = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0004Л\u0005ᐉ\u0001", new Object[]{"b", "c", "d", apzg.class, "e"});
            case 3:
                return new arvl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arvl.class) {
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
