package defpackage;
/* compiled from: PG */
/* renamed from: aejm  reason: default package */
/* loaded from: classes.dex */
public final class aejm extends aopi implements aoqv {
    public static final aejm a;
    private static volatile aorb h;
    public int b;
    public int f;
    private int i;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;
    public String g = "";

    static {
        aejm aejmVar = new aejm();
        a = aejmVar;
        aopi.registerDefaultInstance(aejm.class, aejmVar);
    }

    private aejm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0001\u0000\u0002ဍ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ည\u0003\u0006ဍ\u0004\u0007ဈ\u0005", new Object[]{"i", "b", "c", "d", aein.class, "e", "f", "g"});
            case 3:
                return new aejm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aejm.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
