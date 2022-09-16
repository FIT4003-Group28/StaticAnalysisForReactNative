package defpackage;
/* compiled from: PG */
/* renamed from: awem  reason: default package */
/* loaded from: classes2.dex */
public final class awem extends aopi implements aoqv {
    public static final awem a;
    private static volatile aorb f;
    public int b;
    public atzb c;
    public atza d;
    public atzc e;

    static {
        awem awemVar = new awem();
        a = awemVar;
        aopi.registerDefaultInstance(awem.class, awemVar);
    }

    private awem() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf027₅\ue433ⲧ\u0003\u0000\u0000\u0000\uf027₅ဉ\u0001\ue7c7₡ဉ\u0000\ue433ⲧဉ\u0003", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new awem();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awem.class) {
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
