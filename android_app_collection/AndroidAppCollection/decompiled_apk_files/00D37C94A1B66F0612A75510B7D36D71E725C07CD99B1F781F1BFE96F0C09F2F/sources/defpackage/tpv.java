package defpackage;
/* compiled from: PG */
/* renamed from: tpv  reason: default package */
/* loaded from: classes4.dex */
public final class tpv extends aopi implements aoqv {
    public static final tpv a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        tpv tpvVar = new tpv();
        a = tpvVar;
        aopi.registerDefaultInstance(tpv.class, tpvVar);
    }

    private tpv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u000f\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0007ဈ\u0000\u000fဌ\u0003", new Object[]{"b", "d", "c", "e", sml.h});
            case 3:
                return new tpv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (tpv.class) {
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
