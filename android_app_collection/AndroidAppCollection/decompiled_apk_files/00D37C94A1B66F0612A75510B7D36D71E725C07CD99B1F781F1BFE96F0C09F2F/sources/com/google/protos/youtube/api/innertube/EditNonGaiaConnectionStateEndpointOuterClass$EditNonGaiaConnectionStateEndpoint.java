package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint extends aopi implements aoqv {
    public static final EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint a;
    private static volatile aorb b;
    public static final aopg editNonGaiaConnectionStateEndpoint;

    static {
        EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint = new EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint();
        a = editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
        aopi.registerDefaultInstance(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint);
        editNonGaiaConnectionStateEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint, null, 129377887, aosj.MESSAGE, EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class);
    }

    private EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint() {
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
                return new EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class) {
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
