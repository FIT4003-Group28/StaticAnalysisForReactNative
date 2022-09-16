package defpackage;
/* compiled from: PG */
/* renamed from: attu  reason: default package */
/* loaded from: classes2.dex */
public final class attu extends aopi implements aoqv {
    public static final attu a;
    private static volatile aorb d;
    public aopu b = aopi.emptyProtobufList();
    public aopu c = aopi.emptyProtobufList();

    static {
        attu attuVar = new attu();
        a = attuVar;
        aopi.registerDefaultInstance(attu.class, attuVar);
    }

    private attu() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\t\f\u0002\u0000\u0002\u0000\t\u001a\f\u001a", new Object[]{"c", "b"});
            case 3:
                return new attu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (attu.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
