package defpackage;
/* compiled from: PG */
/* renamed from: apaw  reason: default package */
/* loaded from: classes.dex */
public final class apaw extends aopi implements aoqv {
    public static final apaw a;
    private static volatile aorb d;
    public aunb b;
    public aunb c;
    private int e;
    private byte f = 2;

    static {
        apaw apawVar = new apaw();
        a = apawVar;
        aopi.registerDefaultInstance(apaw.class, apawVar);
    }

    private apaw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new apaw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apaw.class) {
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
