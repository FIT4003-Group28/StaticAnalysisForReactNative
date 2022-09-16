package defpackage;
/* compiled from: PG */
/* renamed from: aoek  reason: default package */
/* loaded from: classes.dex */
public final class aoek extends aopi implements aoqv {
    public static final aoek a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public aoej d;

    static {
        aoek aoekVar = new aoek();
        a = aoekVar;
        aopi.registerDefaultInstance(aoek.class, aoekVar);
    }

    private aoek() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", aoei.class, "d"});
            case 3:
                return new aoek();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoek.class) {
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
