package defpackage;
/* compiled from: PG */
/* renamed from: apts  reason: default package */
/* loaded from: classes2.dex */
public final class apts extends aopi implements aoqv {
    public static final apts a;
    private static volatile aorb c;
    public aptt b;
    private int d;
    private apok e;
    private byte f = 2;

    static {
        apts aptsVar = new apts();
        a = aptsVar;
        aopi.registerDefaultInstance(apts.class, aptsVar);
    }

    private apts() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
            case 3:
                return new apts();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apts.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
