package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint extends aopi implements aoqv {
    public static final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint a;
    private static volatile aorb m;
    public static final aopg showEngagementPanelEndpoint;
    public int b;
    public Object d;
    public auvf e;
    public boolean g;
    public aqvm h;
    public boolean i;
    public apzg j;
    public auve k;
    public auvd l;
    public int c = 0;
    private byte n = 2;
    public String f = "";

    static {
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
        a = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
        aopi.registerDefaultInstance(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
        showEngagementPanelEndpoint = aopi.newSingularGeneratedExtension(apzg.a, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, null, 138681778, aosj.MESSAGE, ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class);
    }

    private ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0004\u0001ျ\u0000\u0002ᐉ\u0006\u0003ဈ\u0003\u0005ဇ\u0005\u0006ဇ\u0007\u0007ᐉ\b\bဉ\t\tᐉ\n\nြ\u0000\u000bᐉ\u0002", new Object[]{"d", "c", "b", "h", "f", "g", "i", "j", "k", "l", aqvl.class, "e"});
            case 3:
                return new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
