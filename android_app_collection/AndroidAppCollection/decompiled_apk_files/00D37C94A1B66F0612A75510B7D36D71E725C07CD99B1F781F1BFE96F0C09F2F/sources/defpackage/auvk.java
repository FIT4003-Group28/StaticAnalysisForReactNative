package defpackage;
/* compiled from: PG */
/* renamed from: auvk  reason: default package */
/* loaded from: classes2.dex */
public final class auvk extends aopi implements aoqv {
    public static final auvk a;
    private static volatile aorb d;
    public int b;
    public atds c;
    private byte e = 2;

    static {
        auvk auvkVar = new auvk();
        a = auvkVar;
        aopi.registerDefaultInstance(auvk.class, auvkVar);
    }

    private auvk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uefcf⸵\uefcf⸵\u0001\u0000\u0000\u0001\uefcf⸵ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new auvk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auvk.class) {
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
