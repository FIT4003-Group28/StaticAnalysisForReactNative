package defpackage;
/* compiled from: PG */
/* renamed from: apmp  reason: default package */
/* loaded from: classes.dex */
public final class apmp extends aopi implements aoqv {
    public static final apmp a;
    private static volatile aorb b;
    private int c;
    private avvh d;
    private aqmu e;
    private byte f = 2;

    static {
        apmp apmpVar = new apmp();
        a = apmpVar;
        aopi.registerDefaultInstance(apmp.class, apmpVar);
    }

    private apmp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱃ\u196f\ue607⨅\u0002\u0000\u0000\u0002ﱃ\u196fᐉ\u0001\ue607⨅ᐉ\u0000", new Object[]{"c", "e", "d"});
            case 3:
                return new apmp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apmp.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
