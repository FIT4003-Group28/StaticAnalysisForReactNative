package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint extends aopi implements aoqv {
    public static final BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint a;
    public static final aopg browseSectionListReloadEndpoint;
    private static volatile aorb g;
    public int b;
    public apoa c;
    public boolean e;
    public int f;
    private byte h = 2;
    public String d = "";

    static {
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = new BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint();
        a = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
        aopi.registerDefaultInstance(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint);
        browseSectionListReloadEndpoint = aopi.newSingularGeneratedExtension(apzg.a, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint, null, 120837120, aosj.MESSAGE, BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class);
    }

    private BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
