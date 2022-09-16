package defpackage;
/* compiled from: PG */
/* renamed from: arvg  reason: default package */
/* loaded from: classes2.dex */
public final class arvg extends aopi implements aoqv {
    public static final arvg a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apok e;
    private byte f = 2;

    static {
        arvg arvgVar = new arvg();
        a = arvgVar;
        aopi.registerDefaultInstance(arvg.class, arvgVar);
    }

    private arvg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new arvg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arvg.class) {
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
