package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint extends aopi implements aoqv {
    public static final VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint a;
    private static volatile aorb b;
    public static final aopg varispeedPickerEndpoint;

    static {
        VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint varispeedPickerEndpointOuterClass$VarispeedPickerEndpoint = new VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint();
        a = varispeedPickerEndpointOuterClass$VarispeedPickerEndpoint;
        aopi.registerDefaultInstance(VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint.class, varispeedPickerEndpointOuterClass$VarispeedPickerEndpoint);
        varispeedPickerEndpoint = aopi.newSingularGeneratedExtension(apzg.a, varispeedPickerEndpointOuterClass$VarispeedPickerEndpoint, varispeedPickerEndpointOuterClass$VarispeedPickerEndpoint, null, 150929833, aosj.MESSAGE, VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint.class);
    }

    private VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint() {
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
                return new VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint.class) {
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
