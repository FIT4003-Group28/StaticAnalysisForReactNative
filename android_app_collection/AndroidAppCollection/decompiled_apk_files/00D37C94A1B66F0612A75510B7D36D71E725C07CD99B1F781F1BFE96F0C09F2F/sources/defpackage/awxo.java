package defpackage;
/* compiled from: PG */
/* renamed from: awxo  reason: default package */
/* loaded from: classes2.dex */
public final class awxo extends aopi implements aoqv {
    public static final awxo a;
    private static volatile aorb d;
    public String b = "";
    public aopu c = emptyProtobufList();
    private int e;

    static {
        awxo awxoVar = new awxo();
        a = awxoVar;
        aopi.registerDefaultInstance(awxo.class, awxoVar);
    }

    private awxo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", awxn.class});
            case 3:
                return new awxo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awxo.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
