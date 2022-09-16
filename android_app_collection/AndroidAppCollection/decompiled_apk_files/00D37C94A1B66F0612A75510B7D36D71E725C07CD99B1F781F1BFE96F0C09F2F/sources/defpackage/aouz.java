package defpackage;
/* compiled from: PG */
/* renamed from: aouz  reason: default package */
/* loaded from: classes.dex */
public final class aouz extends aopi implements aoqv {
    public static final aouz a;
    private static volatile aorb e;
    private byte f = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        aouz aouzVar = new aouz();
        a = aouzVar;
        aopi.registerDefaultInstance(aouz.class, aouzVar);
    }

    private aouz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001Л\u0002\u001b\u0003\u001b", new Object[]{"b", aovb.class, "c", aouy.class, "d", aova.class});
            case 3:
                return new aouz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aouz.class) {
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
