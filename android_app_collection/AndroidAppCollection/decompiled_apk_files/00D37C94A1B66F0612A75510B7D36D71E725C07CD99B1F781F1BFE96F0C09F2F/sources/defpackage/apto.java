package defpackage;
/* compiled from: PG */
/* renamed from: apto  reason: default package */
/* loaded from: classes2.dex */
public final class apto extends aopi implements aoqv {
    public static final apto a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apto aptoVar = new apto();
        a = aptoVar;
        aopi.registerDefaultInstance(apto.class, aptoVar);
    }

    private apto() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ued5a㊁\ued5a㊁\u0001\u0000\u0000\u0001\ued5a㊁ᐼ\u0000", new Object[]{"c", "b", aptn.class});
            case 3:
                return new apto();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apto.class) {
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
