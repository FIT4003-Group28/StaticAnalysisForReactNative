package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint extends aopi implements aoqv {
    public static final YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint a;
    private static volatile aorb d;
    public static final aopg ypcCancelSurveyEndpoint;
    public int b;
    public avdu c;
    private byte e = 2;

    static {
        YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint = new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
        a = ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint;
        aopi.registerDefaultInstance(YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint);
        ypcCancelSurveyEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint, null, 152893416, aosj.MESSAGE, YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class);
    }

    private YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class) {
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
