package defpackage;
/* compiled from: PG */
/* renamed from: awvk  reason: default package */
/* loaded from: classes2.dex */
public final class awvk extends aopi implements aoqv {
    public static final awvk a;
    private static volatile aorb c;
    public aopt b = emptyLongList();

    static {
        awvk awvkVar = new awvk();
        a = awvkVar;
        aopi.registerDefaultInstance(awvk.class, awvkVar);
    }

    private awvk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"b"});
            case 3:
                return new awvk();
            case 4:
                return new aopa((int[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awvk.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
