package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint extends aopi implements aoqv {
    public static final EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint a;
    private static volatile aorb b;
    public static final aopg editChannelBannerEndpoint;

    static {
        EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint = new EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint();
        a = editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
        aopi.registerDefaultInstance(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class, editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint);
        editChannelBannerEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint, editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint, null, 113001276, aosj.MESSAGE, EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class);
    }

    private EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class) {
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
