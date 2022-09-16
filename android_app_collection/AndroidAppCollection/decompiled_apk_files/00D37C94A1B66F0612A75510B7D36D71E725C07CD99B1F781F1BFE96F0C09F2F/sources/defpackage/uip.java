package defpackage;
/* compiled from: PG */
/* renamed from: uip  reason: default package */
/* loaded from: classes4.dex */
public final class uip extends aopi implements aoqv {
    public static final uip a;
    private static volatile aorb c;
    public aopu b = aopi.emptyProtobufList();

    static {
        uip uipVar = new uip();
        a = uipVar;
        aopi.registerDefaultInstance(uip.class, uipVar);
    }

    private uip() {
    }

    public final void a() {
        aopu aopuVar = this.b;
        if (!aopuVar.c()) {
            this.b = aopi.mutableCopy(aopuVar);
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
            case 3:
                return new uip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (uip.class) {
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
