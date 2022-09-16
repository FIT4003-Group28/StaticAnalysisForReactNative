package defpackage;
/* compiled from: PG */
/* renamed from: apbg  reason: default package */
/* loaded from: classes.dex */
public final class apbg extends aopi implements aoqv {
    public static final apbg a;
    private static volatile aorb e;
    public int b;
    public float c;
    public long d;
    private int f;

    static {
        apbg apbgVar = new apbg();
        a = apbgVar;
        aopi.registerDefaultInstance(apbg.class, apbgVar);
    }

    private apbg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဂ\u0002", new Object[]{"f", "b", aoxm.i, "c", "d"});
            case 3:
                return new apbg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apbg.class) {
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
