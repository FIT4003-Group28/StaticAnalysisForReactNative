package defpackage;
/* compiled from: PG */
/* renamed from: arpd  reason: default package */
/* loaded from: classes2.dex */
public final class arpd extends aopi implements aoqv {
    public static final arpd a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;

    static {
        arpd arpdVar = new arpd();
        a = arpdVar;
        aopi.registerDefaultInstance(arpd.class, arpdVar);
    }

    private arpd() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u000f\u0003\u0000\u0000\u0000\u0003ဈ\u0003\u0007ဇ\u0005\u000fဇ\f", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new arpd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arpd.class) {
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
