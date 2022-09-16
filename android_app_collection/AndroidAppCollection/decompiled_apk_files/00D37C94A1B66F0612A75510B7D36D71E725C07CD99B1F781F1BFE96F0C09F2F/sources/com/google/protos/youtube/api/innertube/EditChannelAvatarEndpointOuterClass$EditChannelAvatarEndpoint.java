package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint extends aopi implements aoqv {
    public static final EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint a;
    private static volatile aorb b;
    public static final aopg editChannelAvatarEndpoint;

    static {
        EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint editChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint = new EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint();
        a = editChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint;
        aopi.registerDefaultInstance(EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.class, editChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint);
        editChannelAvatarEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint, editChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint, null, 311688876, aosj.MESSAGE, EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.class);
    }

    private EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint() {
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
                return new EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.class) {
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
