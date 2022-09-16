package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint extends aopi implements aoqv {
    public static final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint a;
    private static volatile aorb h;
    public static final aopg hideEngagementPanelEndpoint;
    public int b;
    public Object d;
    public boolean e;
    public apzg f;
    public boolean g;
    public int c = 0;
    private byte i = 2;

    static {
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
        a = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
        aopi.registerDefaultInstance(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint);
        hideEngagementPanelEndpoint = aopi.newSingularGeneratedExtension(apzg.a, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint, null, 183437148, aosj.MESSAGE, HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class);
    }

    private HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ျ\u0000\u0002ဇ\u0002\u0003ᐉ\u0003\u0004ြ\u0000\u0005ဇ\u0004", new Object[]{"d", "c", "b", "e", "f", aqvl.class, "g"});
            case 3:
                return new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
