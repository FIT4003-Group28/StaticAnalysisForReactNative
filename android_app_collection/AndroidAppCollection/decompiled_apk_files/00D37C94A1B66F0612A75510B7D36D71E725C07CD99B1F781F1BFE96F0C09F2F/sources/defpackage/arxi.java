package defpackage;
/* compiled from: PG */
/* renamed from: arxi  reason: default package */
/* loaded from: classes2.dex */
public final class arxi extends aopi implements aoqv {
    public static final arxi a;
    private static volatile aorb e;
    public int b;
    public int c;
    public arwo d;

    static {
        arxi arxiVar = new arxi();
        a = arxiVar;
        aopi.registerDefaultInstance(arxi.class, arxiVar);
    }

    private arxi() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", arpt.g, "d"});
            case 3:
                return new arxi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arxi.class) {
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
