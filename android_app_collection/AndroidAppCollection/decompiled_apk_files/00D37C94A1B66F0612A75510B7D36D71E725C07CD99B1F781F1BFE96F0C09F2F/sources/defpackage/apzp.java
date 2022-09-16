package defpackage;
/* compiled from: PG */
/* renamed from: apzp  reason: default package */
/* loaded from: classes2.dex */
public final class apzp extends aopi implements aoqv {
    public static final apzp a;
    private static volatile aorb g;
    public int b;
    public apzq c;
    public apzn d;
    public apzr e;
    public apzs f;
    private byte h = 2;

    static {
        apzp apzpVar = new apzp();
        a = apzpVar;
        aopi.registerDefaultInstance(apzp.class, apzpVar);
    }

    private apzp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue552㰻\uedd0䲹\u0004\u0000\u0000\u0004\ue552㰻ᐉ\u0000\ue2e7㲩ᐉ\u0001\uf68b䤹ᐉ\u0002\uedd0䲹ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apzp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apzp.class) {
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
