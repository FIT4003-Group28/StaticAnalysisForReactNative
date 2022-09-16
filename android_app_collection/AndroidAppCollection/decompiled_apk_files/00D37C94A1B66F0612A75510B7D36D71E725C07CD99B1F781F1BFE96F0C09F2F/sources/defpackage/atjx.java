package defpackage;
/* compiled from: PG */
/* renamed from: atjx  reason: default package */
/* loaded from: classes2.dex */
public final class atjx extends aopi implements aoqv {
    public static final atjx a;
    private static volatile aorb c;
    public boolean b;
    private int d;

    static {
        atjx atjxVar = new atjx();
        a = atjxVar;
        aopi.registerDefaultInstance(atjx.class, atjxVar);
    }

    private atjx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဇ\u0004", new Object[]{"d", "b"});
            case 3:
                return new atjx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atjx.class) {
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
