package defpackage;
/* compiled from: PG */
/* renamed from: awxh  reason: default package */
/* loaded from: classes2.dex */
public final class awxh extends aopi implements aoqv {
    public static final awxh a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        awxh awxhVar = new awxh();
        a = awxhVar;
        aopi.registerDefaultInstance(awxh.class, awxhVar);
    }

    private awxh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"b", "c", "d", aono.class});
            case 3:
                return new awxh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awxh.class) {
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
