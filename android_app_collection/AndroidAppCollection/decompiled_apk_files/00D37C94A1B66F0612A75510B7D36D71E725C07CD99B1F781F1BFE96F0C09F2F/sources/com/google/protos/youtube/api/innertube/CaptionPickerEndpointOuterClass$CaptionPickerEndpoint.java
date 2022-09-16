package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CaptionPickerEndpointOuterClass$CaptionPickerEndpoint extends aopi implements aoqv {
    public static final CaptionPickerEndpointOuterClass$CaptionPickerEndpoint a;
    public static final aopg captionPickerEndpoint;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = new CaptionPickerEndpointOuterClass$CaptionPickerEndpoint();
        a = captionPickerEndpointOuterClass$CaptionPickerEndpoint;
        aopi.registerDefaultInstance(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.class, captionPickerEndpointOuterClass$CaptionPickerEndpoint);
        captionPickerEndpoint = aopi.newSingularGeneratedExtension(apzg.a, captionPickerEndpointOuterClass$CaptionPickerEndpoint, captionPickerEndpointOuterClass$CaptionPickerEndpoint, null, 74232380, aosj.MESSAGE, CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.class);
    }

    private CaptionPickerEndpointOuterClass$CaptionPickerEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new CaptionPickerEndpointOuterClass$CaptionPickerEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.class) {
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
