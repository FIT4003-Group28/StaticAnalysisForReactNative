package defpackage;
/* compiled from: PG */
/* renamed from: atvc  reason: default package */
/* loaded from: classes2.dex */
public final class atvc extends aopi implements aoqv {
    public static final atvc a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public int d;

    static {
        atvc atvcVar = new atvc();
        a = atvcVar;
        aopi.registerDefaultInstance(atvc.class, atvcVar);
    }

    private atvc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", atvd.a()});
            case 3:
                return new atvc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atvc.class) {
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
