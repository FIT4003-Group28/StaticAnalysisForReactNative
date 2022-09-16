package defpackage;
/* compiled from: PG */
/* renamed from: aofv  reason: default package */
/* loaded from: classes.dex */
public final class aofv extends aopi implements aoqv {
    public static final aofv a;
    private static volatile aorb e;
    public aofx b;
    public String c = "";
    public aoey d;

    static {
        aofv aofvVar = new aofv();
        a = aofvVar;
        aopi.registerDefaultInstance(aofv.class, aofvVar);
    }

    private aofv() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t", new Object[]{"b", "c", "d"});
            case 3:
                return new aofv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aofv.class) {
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
