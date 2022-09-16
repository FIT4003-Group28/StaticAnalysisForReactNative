package defpackage;
/* compiled from: PG */
/* renamed from: atxv  reason: default package */
/* loaded from: classes2.dex */
public final class atxv extends aopi implements aoqv {
    public static final atxv a;
    private static volatile aorb c;
    private aoqp d = aoqp.a;
    public aopu b = emptyProtobufList();

    static {
        atxv atxvVar = new atxv();
        a = atxvVar;
        aopi.registerDefaultInstance(atxv.class, atxvVar);
    }

    private atxv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new Object[]{"b", atxt.class, "d", atxu.a});
            case 3:
                return new atxv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atxv.class) {
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
