package defpackage;
/* compiled from: PG */
/* renamed from: apmy  reason: default package */
/* loaded from: classes.dex */
public final class apmy extends aopi implements aoqv {
    public static final apmy a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        apmy apmyVar = new apmy();
        a = apmyVar;
        aopi.registerDefaultInstance(apmy.class, apmyVar);
    }

    private apmy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apmy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apmy.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
