package defpackage;
/* compiled from: PG */
/* renamed from: arsc  reason: default package */
/* loaded from: classes2.dex */
public final class arsc extends aopi implements aoqv {
    public static final arsc a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arsc arscVar = new arsc();
        a = arscVar;
        aopi.registerDefaultInstance(arsc.class, arscVar);
    }

    private arsc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf486⢵\ue7fb冰\u0004\u0000\u0000\u0004\uf486⢵ᐼ\u0000\uf730㬮ᐼ\u0000\uf731㬮ᐼ\u0000\ue7fb冰ᐼ\u0000", new Object[]{"c", "b", aqxq.class, arsd.class, arsb.class, asof.class});
            case 3:
                return new arsc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arsc.class) {
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
