package defpackage;
/* compiled from: PG */
/* renamed from: avjg  reason: default package */
/* loaded from: classes2.dex */
public final class avjg extends aopi implements aoqv {
    public static final avjg a;
    private static volatile aorb d;
    public aunb b;
    private int e;
    private byte f = 2;
    public aopu c = aopi.emptyProtobufList();

    static {
        avjg avjgVar = new avjg();
        a = avjgVar;
        aopi.registerDefaultInstance(avjg.class, avjgVar);
    }

    private avjg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a", new Object[]{"e", "b", "c"});
            case 3:
                return new avjg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avjg.class) {
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
