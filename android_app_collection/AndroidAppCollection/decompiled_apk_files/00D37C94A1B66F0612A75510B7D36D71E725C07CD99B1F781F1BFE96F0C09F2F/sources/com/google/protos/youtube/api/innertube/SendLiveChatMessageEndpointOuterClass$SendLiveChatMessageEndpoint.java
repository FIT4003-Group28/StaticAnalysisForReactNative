package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint extends aopi implements aoqv {
    public static final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint a;
    private static volatile aorb e;
    public static final aopg sendLiveChatMessageEndpoint;
    private int f;
    private byte g = 2;
    public aoob b = aoob.b;
    public aopu c = emptyProtobufList();
    public String d = "";

    static {
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
        a = sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
        aopi.registerDefaultInstance(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint);
        sendLiveChatMessageEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint, null, 120929770, aosj.MESSAGE, SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class);
    }

    private SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ည\u0000\u0002Л\u0003ဈ\u0001", new Object[]{"f", "b", "c", apzg.class, "d"});
            case 3:
                return new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
