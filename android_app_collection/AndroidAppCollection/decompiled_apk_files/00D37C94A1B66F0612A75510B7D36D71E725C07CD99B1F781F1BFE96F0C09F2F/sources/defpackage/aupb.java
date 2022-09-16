package defpackage;
/* compiled from: PG */
/* renamed from: aupb  reason: default package */
/* loaded from: classes2.dex */
public final class aupb extends aopi implements aoqv {
    public static final aupb a;
    private static volatile aorb d;
    public int b;
    public aupa c;

    static {
        aupb aupbVar = new aupb();
        a = aupbVar;
        aopi.registerDefaultInstance(aupb.class, aupbVar);
    }

    private aupb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001ﷵ㝅ﷵ㝅\u0001\u0000\u0000\u0000ﷵ㝅ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aupb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aupb.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
