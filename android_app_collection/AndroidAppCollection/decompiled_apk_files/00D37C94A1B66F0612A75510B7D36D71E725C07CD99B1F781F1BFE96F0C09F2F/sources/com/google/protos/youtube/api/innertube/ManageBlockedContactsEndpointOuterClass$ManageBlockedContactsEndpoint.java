package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint extends aopi implements aoqv {
    public static final ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint a;
    private static volatile aorb b;
    public static final aopg manageBlockedContactsEndpoint;

    static {
        ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint manageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint = new ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint();
        a = manageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint;
        aopi.registerDefaultInstance(ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class, manageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint);
        manageBlockedContactsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, manageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint, manageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint, null, 303779213, aosj.MESSAGE, ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class);
    }

    private ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint() {
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
                return new ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class) {
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
