package defpackage;
/* compiled from: PG */
/* renamed from: apzb  reason: default package */
/* loaded from: classes2.dex */
public final class apzb extends aopi implements aoqv {
    public static final apzb a;
    private static volatile aorb h;
    public int b;
    public aunb c;
    public arag d;
    public arag e;
    public int f;
    public int g;
    private byte i = 2;

    static {
        apzb apzbVar = new apzb();
        a = apzbVar;
        aopi.registerDefaultInstance(apzb.class, apzbVar);
    }

    private apzb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဌ\u0004\u0006ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", aoxm.e, "c"});
            case 3:
                return new apzb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apzb.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
