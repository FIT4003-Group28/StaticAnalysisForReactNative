package defpackage;
/* compiled from: PG */
/* renamed from: aoel  reason: default package */
/* loaded from: classes.dex */
public final class aoel extends aopi implements aoqv {
    public static final aoel a;
    private static volatile aorb f;
    public int b;
    public long c;
    public aopt d;
    public aopu e;

    static {
        aoel aoelVar = new aoel();
        a = aoelVar;
        aopi.registerDefaultInstance(aoel.class, aoelVar);
    }

    private aoel() {
        aopi.emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", aoek.class, "c", "d"});
            case 3:
                return new aoel();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aoel.class) {
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
