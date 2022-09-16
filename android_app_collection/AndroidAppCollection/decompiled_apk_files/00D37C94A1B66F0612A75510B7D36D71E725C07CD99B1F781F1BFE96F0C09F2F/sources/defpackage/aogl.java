package defpackage;
/* compiled from: PG */
/* renamed from: aogl  reason: default package */
/* loaded from: classes.dex */
public final class aogl extends aopi implements aoqv {
    public static final aogl a;
    private static volatile aorb e;
    public int b;
    public boolean c;
    public aogi d;
    private aogm f;
    private byte g = 2;

    static {
        aogl aoglVar = new aogl();
        a = aoglVar;
        aopi.registerDefaultInstance(aogl.class, aoglVar);
    }

    private aogl() {
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u001e\u0003\u0000\u0000\u0001\u0003ဇ\u0002\u001cဉ\u0013\u001eᐉ\u0015", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new aogl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aogl.class) {
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
