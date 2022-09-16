package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint extends aopi implements aoqv {
    public static final OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint a;
    private static volatile aorb b;
    public static final aopg openSourceLicensesEndpoint;

    static {
        OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint = new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
        a = openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
        aopi.registerDefaultInstance(OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class, openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint);
        openSourceLicensesEndpoint = aopi.newSingularGeneratedExtension(apzg.a, openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint, openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint, null, 102687288, aosj.MESSAGE, OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class);
    }

    private OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint() {
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
                return new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class) {
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
