package defpackage;
/* compiled from: PG */
/* renamed from: avye  reason: default package */
/* loaded from: classes2.dex */
public final class avye extends aopi implements aoqv {
    public static final avye a;
    private static volatile aorb i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aopu h = emptyProtobufList();

    static {
        avye avyeVar = new avye();
        a = avyeVar;
        aopi.registerDefaultInstance(avye.class, avyeVar);
    }

    private avye() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", avxx.a(), "g", avxw.a(), "h", avyb.class});
            case 3:
                return new avye();
            case 4:
                return new aopa((int[][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avye.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
