package defpackage;
/* compiled from: PG */
/* renamed from: avcg  reason: default package */
/* loaded from: classes2.dex */
public final class avcg extends aopi implements aoqv {
    public static final avcg a;
    public static final aopg b;
    private static volatile aorb e;
    public aopu c = aopi.emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        avcg avcgVar = new avcg();
        a = avcgVar;
        aopi.registerDefaultInstance(avcg.class, avcgVar);
        b = aopi.newSingularGeneratedExtension(avcj.a, avcgVar, avcgVar, null, 343899489, aosj.MESSAGE, avcg.class);
    }

    private avcg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"c", "d", aqvl.class});
            case 3:
                return new avcg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avcg.class) {
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
