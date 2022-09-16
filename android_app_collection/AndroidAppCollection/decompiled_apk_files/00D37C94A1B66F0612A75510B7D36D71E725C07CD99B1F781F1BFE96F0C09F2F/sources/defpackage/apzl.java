package defpackage;
/* compiled from: PG */
/* renamed from: apzl  reason: default package */
/* loaded from: classes2.dex */
public final class apzl extends aopi implements aoqv {
    public static final apzl a;
    private static volatile aorb d;
    public int b;
    public apzk c;
    private byte e = 2;

    static {
        apzl apzlVar = new apzl();
        a = apzlVar;
        aopi.registerDefaultInstance(apzl.class, apzlVar);
    }

    private apzl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf1abΐ\uf1abΐ\u0001\u0000\u0000\u0001\uf1abΐᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apzl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apzl.class) {
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
