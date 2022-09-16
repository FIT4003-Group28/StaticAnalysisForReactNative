package defpackage;
/* compiled from: PG */
/* renamed from: ashn  reason: default package */
/* loaded from: classes2.dex */
public final class ashn extends aopi implements aoqv {
    public static final ashn a;
    private static volatile aorb i;
    public int b;
    public arpa c;
    public ashf d;
    public ashu e;
    public aoob g;
    public int h;
    private arnz j;
    private aoux k;
    private arbf l;
    private byte m = 2;
    public aopu f = emptyProtobufList();

    static {
        ashn ashnVar = new ashn();
        a = ashnVar;
        aopi.registerDefaultInstance(ashn.class, ashnVar);
    }

    private ashn() {
        aopi.emptyProtobufList();
        this.g = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007Л\bᐉ\u0005\nဌ\u0006̉ᐉ\u0007", new Object[]{"b", "c", "d", "j", "e", "g", "f", apzg.class, "k", "h", awbk.u, "l"});
            case 3:
                return new ashn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (ashn.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
