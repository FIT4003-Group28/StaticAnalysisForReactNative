package defpackage;
/* compiled from: PG */
/* renamed from: anva  reason: default package */
/* loaded from: classes.dex */
public final class anva extends aopi implements aoqv {
    public static final anva a;
    private static volatile aorb f;
    public int b;
    public aoob c = aoob.b;
    public aopu d = emptyProtobufList();
    public boolean e;

    static {
        anva anvaVar = new anva();
        a = anvaVar;
        aopi.registerDefaultInstance(anva.class, anvaVar);
    }

    private anva() {
    }

    public final void a() {
        aopu aopuVar = this.d;
        if (!aopuVar.c()) {
            this.d = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anva();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anva.class) {
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
