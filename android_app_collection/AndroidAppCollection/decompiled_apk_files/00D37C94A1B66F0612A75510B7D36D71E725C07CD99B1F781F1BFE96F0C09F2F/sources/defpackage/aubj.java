package defpackage;
/* compiled from: PG */
/* renamed from: aubj  reason: default package */
/* loaded from: classes2.dex */
public final class aubj extends aopi implements aoqv {
    public static final aubj a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aubj aubjVar = new aubj();
        a = aubjVar;
        aopi.registerDefaultInstance(aubj.class, aubjVar);
    }

    private aubj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000ﮧ㴸\ue2ca碘\u0004\u0000\u0000\u0004ﮧ㴸ᐼ\u0000\uf8af䝐ᐼ\u0000\uf492䤳ᐼ\u0000\ue2ca碘ᐼ\u0000", new Object[]{"c", "b", aubi.class, aqts.class, aqtb.class, atkh.class});
            case 3:
                return new aubj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aubj.class) {
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
