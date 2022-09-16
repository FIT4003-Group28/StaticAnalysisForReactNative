package defpackage;
/* compiled from: PG */
/* renamed from: atiy  reason: default package */
/* loaded from: classes2.dex */
public final class atiy extends aopi implements aoqv {
    public static final atiy a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atiy atiyVar = new atiy();
        a = atiyVar;
        aopi.registerDefaultInstance(atiy.class, atiyVar);
    }

    private atiy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ued6a▻\ue05a䱤\u0003\u0000\u0000\u0003\ued6a▻ᐼ\u0000\ueb6b⳹ᐼ\u0000\ue05a䱤ᐼ\u0000", new Object[]{"c", "b", aqdr.class, apke.class, aviy.class});
            case 3:
                return new atiy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atiy.class) {
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
