package defpackage;
/* compiled from: PG */
/* renamed from: aqur  reason: default package */
/* loaded from: classes2.dex */
public final class aqur extends aopi implements aoqv {
    public static final aqur a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqur aqurVar = new aqur();
        a = aqurVar;
        aopi.registerDefaultInstance(aqur.class, aqurVar);
    }

    private aqur() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf739㰼\ue15a凍\u0002\u0000\u0000\u0002\uf739㰼ᐼ\u0000\ue15a凍ᐼ\u0000", new Object[]{"c", "b", aquq.class, aqut.class});
            case 3:
                return new aqur();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqur.class) {
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
