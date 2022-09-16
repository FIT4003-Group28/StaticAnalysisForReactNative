package defpackage;
/* compiled from: PG */
/* renamed from: assu  reason: default package */
/* loaded from: classes2.dex */
public final class assu extends aopi implements aoqv {
    public static final assu a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public boolean d;

    static {
        assu assuVar = new assu();
        a = assuVar;
        aopi.registerDefaultInstance(assu.class, assuVar);
    }

    private assu() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"b", "c", assv.class, "d"});
            case 3:
                return new assu();
            case 4:
                return new aopa((byte[]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (assu.class) {
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
