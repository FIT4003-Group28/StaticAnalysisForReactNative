package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdFeedbackEndpointOuterClass$AdFeedbackEndpoint extends aopi implements aoqv {
    public static final AdFeedbackEndpointOuterClass$AdFeedbackEndpoint a;
    public static final aopg adFeedbackEndpoint;
    private static volatile aorb c;
    public aoyq b;
    private int d;
    private byte e = 2;

    static {
        AdFeedbackEndpointOuterClass$AdFeedbackEndpoint adFeedbackEndpointOuterClass$AdFeedbackEndpoint = new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
        a = adFeedbackEndpointOuterClass$AdFeedbackEndpoint;
        aopi.registerDefaultInstance(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class, adFeedbackEndpointOuterClass$AdFeedbackEndpoint);
        adFeedbackEndpoint = aopi.newSingularGeneratedExtension(apzg.a, adFeedbackEndpointOuterClass$AdFeedbackEndpoint, adFeedbackEndpointOuterClass$AdFeedbackEndpoint, null, 79296801, aosj.MESSAGE, AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class);
    }

    private AdFeedbackEndpointOuterClass$AdFeedbackEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
