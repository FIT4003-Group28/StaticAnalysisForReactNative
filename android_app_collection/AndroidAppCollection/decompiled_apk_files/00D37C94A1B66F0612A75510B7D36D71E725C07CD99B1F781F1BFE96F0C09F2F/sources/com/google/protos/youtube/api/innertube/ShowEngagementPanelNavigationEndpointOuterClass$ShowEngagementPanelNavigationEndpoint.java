package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint extends aopi implements aoqv {
    public static final ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint a;
    private static volatile aorb e;
    public static final aopg showEngagementPanelNavigationEndpoint;
    public int b;
    public String c = "";
    public boolean d;

    static {
        ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint = new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
        a = showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
        aopi.registerDefaultInstance(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class, showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint);
        showEngagementPanelNavigationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint, showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint, null, 163501208, aosj.MESSAGE, ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class);
    }

    private ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class) {
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
