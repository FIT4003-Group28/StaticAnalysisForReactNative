package defpackage;
/* compiled from: PG */
/* renamed from: apvw  reason: default package */
/* loaded from: classes2.dex */
public final class apvw extends aopi implements aoqv {
    public static final apvw a;
    private static volatile aorb e;
    public int b;
    public int c;
    public apvz d;

    static {
        apvw apvwVar = new apvw();
        a = apvwVar;
        aopi.registerDefaultInstance(apvw.class, apvwVar);
    }

    private apvw() {
        emptyProtobufList();
        emptyLongList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", apvq.d, "d"});
            case 3:
                return new apvw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apvw.class) {
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
