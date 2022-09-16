package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint extends aopi implements aoqv {
    public static final InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint a;
    private static volatile aorb b;
    public static final aopg inlineMutedSettingsMenuEndpoint;

    static {
        InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint = new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
        a = inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint;
        aopi.registerDefaultInstance(InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class, inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint);
        inlineMutedSettingsMenuEndpoint = aopi.newSingularGeneratedExtension(apzg.a, inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint, inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint, null, 148127366, aosj.MESSAGE, InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class);
    }

    private InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint() {
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
                return new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class) {
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
