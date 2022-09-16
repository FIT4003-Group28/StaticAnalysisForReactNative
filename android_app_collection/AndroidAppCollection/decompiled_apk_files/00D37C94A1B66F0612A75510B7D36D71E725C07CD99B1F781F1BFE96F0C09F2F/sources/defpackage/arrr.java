package defpackage;
/* compiled from: PG */
/* renamed from: arrr  reason: default package */
/* loaded from: classes2.dex */
public final class arrr extends aopi implements aoqv {
    public static final arrr a;
    private static volatile aorb j;
    public int b;
    public Object d;
    public arag f;
    public avhn g;
    public arag h;
    public arag i;
    private aoux k;
    private arag l;
    public int c = 0;
    private byte m = 2;
    public aoob e = aoob.b;

    static {
        arrr arrrVar = new arrr();
        a = arrrVar;
        aopi.registerDefaultInstance(arrr.class, arrrVar);
    }

    private arrr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐼ\u0000\tျ\u0000", new Object[]{"d", "c", "b", "k", "e", "f", "g", "h", "i", "l", apzg.class});
            case 3:
                return new arrr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (arrr.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
