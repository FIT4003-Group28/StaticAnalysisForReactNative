package defpackage;
/* compiled from: PG */
/* renamed from: avuq  reason: default package */
/* loaded from: classes2.dex */
public final class avuq extends aopi implements aoqv {
    public static final avuq a;
    public static final aopg b;
    private static volatile aorb f;
    public avup c;
    private int g;
    private byte h = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        avuq avuqVar = new avuq();
        a = avuqVar;
        aopi.registerDefaultInstance(avuq.class, avuqVar);
        b = aopi.newSingularGeneratedExtension(auna.a, avuqVar, avuqVar, null, 64128279, aosj.MESSAGE, avuq.class);
    }

    private avuq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003\u001b", new Object[]{"g", "c", "d", avus.class, "e", avur.class});
            case 3:
                return new avuq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avuq.class) {
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
