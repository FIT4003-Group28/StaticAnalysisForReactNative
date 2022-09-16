package defpackage;
/* compiled from: PG */
/* renamed from: auzy  reason: default package */
/* loaded from: classes2.dex */
public final class auzy extends aopi implements aoqv {
    public static final auzy a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public aoob g = aoob.b;

    static {
        auzy auzyVar = new auzy();
        a = auzyVar;
        aopi.registerDefaultInstance(auzy.class, auzyVar);
    }

    private auzy() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", auwh.p, "f", aqfh.u, "g"});
            case 3:
                return new auzy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auzy.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
