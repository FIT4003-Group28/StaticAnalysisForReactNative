package defpackage;
/* compiled from: PG */
/* renamed from: axch  reason: default package */
/* loaded from: classes2.dex */
public final class axch extends aopi implements aoqv {
    public static final axch a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();

    static {
        axch axchVar = new axch();
        a = axchVar;
        aopi.registerDefaultInstance(axch.class, axchVar);
    }

    private axch() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
            case 3:
                return new axch();
            case 4:
                return new aopa((int[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (axch.class) {
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
