package defpackage;
/* compiled from: PG */
/* renamed from: apde  reason: default package */
/* loaded from: classes.dex */
public final class apde extends aopi implements aoqv {
    public static final apde a;
    private static volatile aorb f;
    public int b;
    public int c;
    public aopu d = emptyProtobufList();
    public int e;

    static {
        apde apdeVar = new apde();
        a = apdeVar;
        aopi.registerDefaultInstance(apde.class, apdeVar);
    }

    private apde() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"b", "c", apcf.a(), "d", apdd.class, "e"});
            case 3:
                return new apde();
            case 4:
                return new aopa((short[][][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apde.class) {
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
