package defpackage;
/* compiled from: PG */
/* renamed from: asbg  reason: default package */
/* loaded from: classes2.dex */
public final class asbg extends aopi implements aoqv {
    public static final asbg a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asbg asbgVar = new asbg();
        a = asbgVar;
        aopi.registerDefaultInstance(asbg.class, asbgVar);
    }

    private asbg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue467╢\uf2e8䕺\u0002\u0000\u0000\u0002\ue467╢ᐼ\u0000\uf2e8䕺ᐼ\u0000", new Object[]{"c", "b", aueb.class, aqzr.class});
            case 3:
                return new asbg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asbg.class) {
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
