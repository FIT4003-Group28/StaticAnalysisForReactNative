package defpackage;
/* compiled from: PG */
/* renamed from: apay  reason: default package */
/* loaded from: classes.dex */
public final class apay extends aopi implements aoqv {
    public static final apay a;
    private static volatile aorb e;
    private byte f = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        apay apayVar = new apay();
        a = apayVar;
        aopi.registerDefaultInstance(apay.class, apayVar);
    }

    private apay() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0003\u0001Л\u0002Л\u0003Л", new Object[]{"b", apzg.class, "c", apzg.class, "d", apzg.class});
            case 3:
                return new apay();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apay.class) {
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
