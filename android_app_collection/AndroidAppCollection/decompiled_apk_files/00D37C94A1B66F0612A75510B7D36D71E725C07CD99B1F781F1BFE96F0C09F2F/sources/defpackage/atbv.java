package defpackage;
/* compiled from: PG */
/* renamed from: atbv  reason: default package */
/* loaded from: classes2.dex */
public final class atbv extends aopi implements aoqv {
    public static final atbv a;
    private static volatile aorb e;
    public int b;
    public long c;
    public aopu d = emptyProtobufList();

    static {
        atbv atbvVar = new atbv();
        a = atbvVar;
        aopi.registerDefaultInstance(atbv.class, atbvVar);
    }

    private atbv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"b", "c", "d", atbu.class});
            case 3:
                return new atbv();
            case 4:
                return new aopa((float[][][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atbv.class) {
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
