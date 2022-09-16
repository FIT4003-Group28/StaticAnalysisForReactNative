package defpackage;
/* compiled from: PG */
/* renamed from: asgn  reason: default package */
/* loaded from: classes2.dex */
public final class asgn extends aopi implements aoqv {
    public static final asgn a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgn asgnVar = new asgn();
        a = asgnVar;
        aopi.registerDefaultInstance(asgn.class, asgnVar);
    }

    private asgn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf321Ẑ\ue16f㳩\u0006\u0000\u0000\u0006\uf321Ẑᐼ\u0000\ueaaaᾮᐼ\u0000\uf42fⓣᐼ\u0000\ueaae┢ᐼ\u0000\ue282㘿ᐼ\u0000\ue16f㳩ᐼ\u0000", new Object[]{"c", "b", aqft.class, atep.class, auwk.class, atul.class, aunm.class, asnb.class});
            case 3:
                return new asgn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgn.class) {
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
