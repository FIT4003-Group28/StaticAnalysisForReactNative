package defpackage;
/* compiled from: PG */
/* renamed from: aoxe  reason: default package */
/* loaded from: classes.dex */
public final class aoxe extends aopi implements aoqv {
    public static final aoxe a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aoxe aoxeVar = new aoxe();
        a = aoxeVar;
        aopi.registerDefaultInstance(aoxe.class, aoxeVar);
    }

    private aoxe() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueeecḿ\ued6a▻\u0002\u0000\u0000\u0002\ueeecḿᐼ\u0000\ued6a▻ᐼ\u0000", new Object[]{"c", "b", aoxc.class, aqdr.class});
            case 3:
                return new aoxe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aoxe.class) {
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
