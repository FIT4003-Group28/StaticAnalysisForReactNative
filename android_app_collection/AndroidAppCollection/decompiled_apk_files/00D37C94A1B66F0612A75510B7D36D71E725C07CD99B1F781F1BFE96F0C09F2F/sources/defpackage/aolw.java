package defpackage;
/* compiled from: PG */
/* renamed from: aolw  reason: default package */
/* loaded from: classes.dex */
public final class aolw extends aopi implements aoqv {
    public static final aolw a;
    private static volatile aorb h;
    public int f;
    private int i;
    public String b = "";
    public String c = "";
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        aolw aolwVar = new aolw();
        a = aolwVar;
        aopi.registerDefaultInstance(aolw.class, aolwVar);
    }

    private aolw() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002\u0006\u001b", new Object[]{"i", "b", "c", "d", aome.class, "e", aols.class, "f", aoli.h, "g", aome.class});
            case 3:
                return new aolw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aolw.class) {
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
