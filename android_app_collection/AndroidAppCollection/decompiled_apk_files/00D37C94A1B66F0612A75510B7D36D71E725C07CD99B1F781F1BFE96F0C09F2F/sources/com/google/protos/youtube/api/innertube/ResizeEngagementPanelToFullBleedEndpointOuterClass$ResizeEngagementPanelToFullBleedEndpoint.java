package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint extends aopi implements aoqv {
    public static final ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint a;
    private static volatile aorb d;
    public static final aopg resizeEngagementPanelToFullBleedEndpoint;
    public int b = 0;
    public Object c;

    static {
        ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint = new ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint();
        a = resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint;
        aopi.registerDefaultInstance(ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.class, resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint);
        resizeEngagementPanelToFullBleedEndpoint = aopi.newSingularGeneratedExtension(apzg.a, resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint, resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint, null, 300135747, aosj.MESSAGE, ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.class);
    }

    private ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint() {
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
                return new ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.class) {
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
