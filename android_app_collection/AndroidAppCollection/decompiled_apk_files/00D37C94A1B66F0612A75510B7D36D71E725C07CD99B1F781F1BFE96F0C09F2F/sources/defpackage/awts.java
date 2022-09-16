package defpackage;
/* compiled from: PG */
/* renamed from: awts  reason: default package */
/* loaded from: classes2.dex */
public final class awts extends aopi implements aoqv {
    public static final awts a;
    private static volatile aorb e;
    public int b;
    public aoqp c = aoqp.a;
    public long d;

    static {
        awts awtsVar = new awts();
        a = awtsVar;
        aopi.registerDefaultInstance(awts.class, awtsVar);
    }

    private awts() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.c;
        if (!aoqpVar.b) {
            this.c = aoqpVar.a();
        }
        return this.c;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဃ\u0000", new Object[]{"b", "c", awtr.a, "d"});
            case 3:
                return new awts();
            case 4:
                return new aopa((boolean[]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awts.class) {
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
