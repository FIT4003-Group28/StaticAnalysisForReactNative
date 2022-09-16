package defpackage;
/* compiled from: PG */
/* renamed from: apfw  reason: default package */
/* loaded from: classes.dex */
public final class apfw extends aopi implements aoqv {
    public static final apfw a;
    private static volatile aorb e;
    public int b;
    public apft c;
    public apfx d;

    static {
        apfw apfwVar = new apfw();
        a = apfwVar;
        aopi.registerDefaultInstance(apfw.class, apfwVar);
    }

    private apfw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue7f1㗢ﷄ䗍\u0002\u0000\u0000\u0000\ue7f1㗢ဉ\u0000ﷄ䗍ဉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new apfw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apfw.class) {
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
