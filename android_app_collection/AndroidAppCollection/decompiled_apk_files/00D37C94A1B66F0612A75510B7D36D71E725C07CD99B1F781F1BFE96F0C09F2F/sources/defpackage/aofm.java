package defpackage;
/* compiled from: PG */
/* renamed from: aofm  reason: default package */
/* loaded from: classes.dex */
public final class aofm extends aopi implements aoqv {
    public static final aofm a;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        aofm aofmVar = new aofm();
        a = aofmVar;
        aopi.registerDefaultInstance(aofm.class, aofmVar);
    }

    private aofm() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
            case 3:
                return new aofm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aofm.class) {
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
