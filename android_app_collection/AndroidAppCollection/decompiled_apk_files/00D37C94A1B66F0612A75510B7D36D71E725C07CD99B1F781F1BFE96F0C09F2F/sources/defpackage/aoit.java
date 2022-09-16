package defpackage;
/* compiled from: PG */
/* renamed from: aoit  reason: default package */
/* loaded from: classes.dex */
public final class aoit extends aopi implements aoqv {
    public static final aoit a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        aoit aoitVar = new aoit();
        a = aoitVar;
        aopi.registerDefaultInstance(aoit.class, aoitVar);
    }

    private aoit() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e", anfo.t});
            case 3:
                return new aoit();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aoit.class) {
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
