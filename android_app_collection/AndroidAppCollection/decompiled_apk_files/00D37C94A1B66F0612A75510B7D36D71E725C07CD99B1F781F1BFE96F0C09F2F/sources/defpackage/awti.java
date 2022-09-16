package defpackage;
/* compiled from: PG */
/* renamed from: awti  reason: default package */
/* loaded from: classes2.dex */
public final class awti extends aopi implements aoqv {
    public static final awti a;
    private static volatile aorb e;
    public int b;
    public int c;
    public aoqp d = aoqp.a;

    static {
        awti awtiVar = new awti();
        a = awtiVar;
        aopi.registerDefaultInstance(awti.class, awtiVar);
    }

    private awti() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.d;
        if (!aoqpVar.b) {
            this.d = aoqpVar.a();
        }
        return this.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", awth.a});
            case 3:
                return new awti();
            case 4:
                return new aopa((boolean[][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awti.class) {
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
