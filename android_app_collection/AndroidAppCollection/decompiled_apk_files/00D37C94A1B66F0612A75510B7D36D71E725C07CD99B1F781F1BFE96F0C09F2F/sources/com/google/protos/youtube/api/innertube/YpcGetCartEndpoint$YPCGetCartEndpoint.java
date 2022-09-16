package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcGetCartEndpoint$YPCGetCartEndpoint extends aopi implements aoqv {
    public static final YpcGetCartEndpoint$YPCGetCartEndpoint a;
    private static volatile aorb n;
    public static final aopg ypcGetCartEndpoint;
    public int b;
    public long f;
    public assu h;
    public awhq i;
    public String j;
    public long k;
    public avka l;
    public String m;
    private byte o = 2;
    public String c = "";
    public aoob d = aoob.b;
    public String e = "";
    public String g = "";

    static {
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = new YpcGetCartEndpoint$YPCGetCartEndpoint();
        a = ypcGetCartEndpoint$YPCGetCartEndpoint;
        aopi.registerDefaultInstance(YpcGetCartEndpoint$YPCGetCartEndpoint.class, ypcGetCartEndpoint$YPCGetCartEndpoint);
        ypcGetCartEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcGetCartEndpoint$YPCGetCartEndpoint, ypcGetCartEndpoint$YPCGetCartEndpoint, null, 95253721, aosj.MESSAGE, YpcGetCartEndpoint$YPCGetCartEndpoint.class);
    }

    private YpcGetCartEndpoint$YPCGetCartEndpoint() {
        emptyProtobufList();
        this.j = "";
        this.m = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0006\u0004ည\u0001\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\nဈ\t\u000bဃ\n\fဈ\u0002\u000eဉ\u000b\u000fဈ\f", new Object[]{"b", "c", "i", "d", "f", "g", "h", "j", "k", "e", "l", "m"});
            case 3:
                return new YpcGetCartEndpoint$YPCGetCartEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (YpcGetCartEndpoint$YPCGetCartEndpoint.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
