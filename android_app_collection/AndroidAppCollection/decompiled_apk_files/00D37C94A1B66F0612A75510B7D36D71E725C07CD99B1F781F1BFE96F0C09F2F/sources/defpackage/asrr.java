package defpackage;
/* compiled from: PG */
/* renamed from: asrr  reason: default package */
/* loaded from: classes2.dex */
public final class asrr extends aopi implements aoqv {
    public static final asrr a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asrr asrrVar = new asrr();
        a = asrrVar;
        aopi.registerDefaultInstance(asrr.class, asrrVar);
    }

    private asrr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf6dc㰼識纽\u0004\u0000\u0000\u0004\uf6dc㰼ᐼ\u0000\ue68a㶈ᐼ\u0000\uf407媆ᐼ\u0000識纽ᐼ\u0000", new Object[]{"c", "b", aqus.class, asqj.class, assi.class, asry.class});
            case 3:
                return new asrr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asrr.class) {
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
