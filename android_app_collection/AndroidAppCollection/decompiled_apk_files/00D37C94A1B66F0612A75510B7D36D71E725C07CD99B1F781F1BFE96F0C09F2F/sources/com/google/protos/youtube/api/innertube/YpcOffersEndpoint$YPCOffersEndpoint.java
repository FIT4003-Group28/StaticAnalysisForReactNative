package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcOffersEndpoint$YPCOffersEndpoint extends aopi implements aoqv {
    public static final YpcOffersEndpoint$YPCOffersEndpoint a;
    private static volatile aorb d;
    public static final aopg ypcOffersEndpoint;
    public boolean c;
    private int e;
    private awht f;
    private apzg g;
    private byte h = 2;
    public String b = "";

    static {
        YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint = new YpcOffersEndpoint$YPCOffersEndpoint();
        a = ypcOffersEndpoint$YPCOffersEndpoint;
        aopi.registerDefaultInstance(YpcOffersEndpoint$YPCOffersEndpoint.class, ypcOffersEndpoint$YPCOffersEndpoint);
        ypcOffersEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcOffersEndpoint$YPCOffersEndpoint, ypcOffersEndpoint$YPCOffersEndpoint, null, 64681250, aosj.MESSAGE, YpcOffersEndpoint$YPCOffersEndpoint.class);
    }

    private YpcOffersEndpoint$YPCOffersEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\uf70f⩻\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ဇ\u0003\uf70f⩻ᐉ\u0001", new Object[]{"e", "b", "g", "c", "f"});
            case 3:
                return new YpcOffersEndpoint$YPCOffersEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (YpcOffersEndpoint$YPCOffersEndpoint.class) {
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
