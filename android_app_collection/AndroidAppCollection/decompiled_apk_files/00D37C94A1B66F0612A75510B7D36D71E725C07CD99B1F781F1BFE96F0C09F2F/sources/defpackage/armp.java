package defpackage;
/* compiled from: PG */
/* renamed from: armp  reason: default package */
/* loaded from: classes2.dex */
public final class armp extends aopi implements aoqv {
    public static final armp a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        armp armpVar = new armp();
        a = armpVar;
        aopi.registerDefaultInstance(armp.class, armpVar);
    }

    private armp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf5b0\u2b8d\uf1de㍐\u0002\u0000\u0000\u0002\uf5b0\u2b8dᐼ\u0000\uf1de㍐ᐼ\u0000", new Object[]{"c", "b", aptk.class, apuc.class});
            case 3:
                return new armp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (armp.class) {
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
