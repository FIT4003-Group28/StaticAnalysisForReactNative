package defpackage;
/* compiled from: PG */
/* renamed from: atxi  reason: default package */
/* loaded from: classes2.dex */
public final class atxi extends aopi implements aoqv {
    public static final atxi a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atxi atxiVar = new atxi();
        a = atxiVar;
        aopi.registerDefaultInstance(atxi.class, atxiVar);
    }

    private atxi() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf3e4\u2e6e\uf174韏\u0004\u0000\u0000\u0003\uf3e4\u2e6eᐼ\u0000\uf3fbヺᐼ\u0000祥䌤ᐼ\u0000\uf174韏ြ\u0000", new Object[]{"c", "b", atnz.class, argj.class, avsn.class, avsp.class});
            case 3:
                return new atxi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atxi.class) {
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
