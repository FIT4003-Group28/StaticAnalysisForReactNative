package defpackage;
/* compiled from: PG */
/* renamed from: apft  reason: default package */
/* loaded from: classes.dex */
public final class apft extends aopi implements aoqv {
    public static final apft a;
    private static volatile aorb d;
    public String b = "";
    public aopu c = aopi.emptyProtobufList();
    private int e;

    static {
        apft apftVar = new apft();
        a = apftVar;
        aopi.registerDefaultInstance(apft.class, apftVar);
    }

    private apft() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"e", "b", "c"});
            case 3:
                return new apft();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apft.class) {
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
