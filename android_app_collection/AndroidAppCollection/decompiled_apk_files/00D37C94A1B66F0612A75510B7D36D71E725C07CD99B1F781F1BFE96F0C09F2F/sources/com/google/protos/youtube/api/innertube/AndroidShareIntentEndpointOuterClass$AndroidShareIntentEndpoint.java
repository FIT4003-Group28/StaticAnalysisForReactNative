package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint extends aopi implements aoqv {
    public static final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint a;
    public static final aopg androidShareIntentEndpoint;
    private static volatile aorb e;
    private int f;
    private byte g = 2;
    public aopu b = emptyProtobufList();
    public String c = "";
    public String d = "";

    static {
        AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
        a = androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
        aopi.registerDefaultInstance(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
        androidShareIntentEndpoint = aopi.newSingularGeneratedExtension(apzg.a, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint, null, 106983893, aosj.MESSAGE, AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class);
    }

    private AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0004ဈ\u0001", new Object[]{"f", "b", asmc.class, "c", "d"});
            case 3:
                return new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
