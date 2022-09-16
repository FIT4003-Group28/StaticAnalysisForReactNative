package defpackage;
/* compiled from: PG */
/* renamed from: asbx  reason: default package */
/* loaded from: classes2.dex */
public final class asbx extends aopi implements aoqv {
    public static final asbx a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asbx asbxVar = new asbx();
        a = asbxVar;
        aopi.registerDefaultInstance(asbx.class, asbxVar);
    }

    private asbx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf321Ẑ\ue1c0ꉹ\u0005\u0000\u0000\u0005\uf321Ẑᐼ\u0000\uefcf⸵ᐼ\u0000ﲸ䍖ᐼ\u0000\ueb41䣥ᐼ\u0000\ue1c0ꉹᐼ\u0000", new Object[]{"c", "b", aqft.class, atds.class, avsr.class, avjf.class, aqge.class});
            case 3:
                return new asbx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asbx.class) {
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
