package defpackage;
/* compiled from: PG */
/* renamed from: atdb  reason: default package */
/* loaded from: classes2.dex */
public final class atdb extends aopi implements aoqv {
    public static final atdb a;
    private static volatile aorb g;
    public int b;
    public atdc d;
    public atdm e;
    public aopu c = aopi.emptyProtobufList();
    public aopu f = aopi.emptyProtobufList();

    static {
        atdb atdbVar = new atdb();
        a = atdbVar;
        aopi.registerDefaultInstance(atdb.class, atdbVar);
    }

    private atdb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0002\u0000\u0005\u001a\u0006ဉ\u0003\u0007ဉ\u0004\b\u001a", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new atdb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atdb.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
