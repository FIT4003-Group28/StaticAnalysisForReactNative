package defpackage;
/* compiled from: PG */
/* renamed from: avfs  reason: default package */
/* loaded from: classes2.dex */
public final class avfs extends aopi implements aoqv {
    public static final avfs a;
    public static final aopg b;
    private static volatile aorb f;
    public String c = "";
    public String d = "";
    public avfu e;
    private int g;

    static {
        avfs avfsVar = new avfs();
        a = avfsVar;
        aopi.registerDefaultInstance(avfs.class, avfsVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, avfsVar, avfsVar, null, 228172556, aosj.MESSAGE, avfs.class);
    }

    private avfs() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"g", "c", "d", "e"});
            case 3:
                return new avfs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avfs.class) {
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
