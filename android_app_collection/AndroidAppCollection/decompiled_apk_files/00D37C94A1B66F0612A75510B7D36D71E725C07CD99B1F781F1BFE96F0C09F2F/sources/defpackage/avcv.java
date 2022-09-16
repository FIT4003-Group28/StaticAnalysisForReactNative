package defpackage;
/* compiled from: PG */
/* renamed from: avcv  reason: default package */
/* loaded from: classes2.dex */
public final class avcv extends aopi implements aoqv {
    public static final avcv a;
    private static volatile aorb f;
    public int b;
    public int c;
    public aopu d = emptyProtobufList();
    public apai e;
    private int g;

    static {
        avcv avcvVar = new avcv();
        a = avcvVar;
        aopi.registerDefaultInstance(avcv.class, avcvVar);
    }

    private avcv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0004\u001b\u0005ဉ\u0002", new Object[]{"g", "b", "c", "d", apae.class, "e"});
            case 3:
                return new avcv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avcv.class) {
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
