package defpackage;
/* compiled from: PG */
/* renamed from: avpd  reason: default package */
/* loaded from: classes2.dex */
public final class avpd extends aopi implements aoqv {
    public static final avpd a;
    private static volatile aorb b;
    private int c;
    private avpe d;
    private avpf e;
    private byte f = 2;

    static {
        avpd avpdVar = new avpd();
        a = avpdVar;
        aopi.registerDefaultInstance(avpd.class, avpdVar);
    }

    private avpd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf4b7㡞ﴄ㢙\u0002\u0000\u0000\u0002\uf4b7㡞ᐉ\u0000ﴄ㢙ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new avpd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpd.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
