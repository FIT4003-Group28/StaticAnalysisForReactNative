package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint extends aopi implements aoqv {
    public static final ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint a;
    private static volatile aorb d;
    public static final aopg resizeEngagementPanelToMaximizedEndpoint;
    public int b = 0;
    public Object c;

    static {
        ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint = new ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint();
        a = resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint;
        aopi.registerDefaultInstance(ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.class, resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint);
        resizeEngagementPanelToMaximizedEndpoint = aopi.newSingularGeneratedExtension(apzg.a, resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint, resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint, null, 300413109, aosj.MESSAGE, ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.class);
    }

    private ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"c", "b", aqvl.class});
            case 3:
                return new ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.class) {
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
