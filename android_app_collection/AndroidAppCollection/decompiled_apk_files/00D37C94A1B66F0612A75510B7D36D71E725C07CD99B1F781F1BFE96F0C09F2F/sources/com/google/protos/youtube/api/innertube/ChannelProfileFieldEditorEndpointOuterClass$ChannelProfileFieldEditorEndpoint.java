package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint extends aopi implements aoqv {
    public static final ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint a;
    public static final aopg channelProfileFieldEditorEndpoint;
    private static volatile aorb d;
    public int b;
    public aptu c;
    private byte e = 2;

    static {
        ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint = new ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint();
        a = channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
        aopi.registerDefaultInstance(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint);
        channelProfileFieldEditorEndpoint = aopi.newSingularGeneratedExtension(apzg.a, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint, null, 106088718, aosj.MESSAGE, ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class);
    }

    private ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
