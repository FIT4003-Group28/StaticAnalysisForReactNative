package defpackage;
/* compiled from: PG */
/* renamed from: avwt  reason: default package */
/* loaded from: classes2.dex */
public final class avwt extends aopi implements aoqv {
    public static final avwt a;
    private static volatile aorb e;
    public avws b;
    public aoyz d;
    private int f;
    private byte g = 2;
    public int c = 1;

    static {
        avwt avwtVar = new avwt();
        a = avwtVar;
        aopi.registerDefaultInstance(avwt.class, avwtVar);
    }

    private avwt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0002\u0003င\u0001", new Object[]{"f", "b", "d", "c"});
            case 3:
                return new avwt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avwt.class) {
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
