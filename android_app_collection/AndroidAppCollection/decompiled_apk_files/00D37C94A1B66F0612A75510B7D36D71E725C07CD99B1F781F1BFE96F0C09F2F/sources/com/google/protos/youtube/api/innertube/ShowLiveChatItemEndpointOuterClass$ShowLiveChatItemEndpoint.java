package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint extends aopi implements aoqv {
    public static final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint a;
    private static volatile aorb d;
    public static final aopg showLiveChatItemEndpoint;
    public int b;
    public asqy c;
    private aoux e;
    private byte f = 2;

    static {
        ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
        a = showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
        aopi.registerDefaultInstance(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint);
        showLiveChatItemEndpoint = aopi.newSingularGeneratedExtension(apzg.a, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint, null, 135843030, aosj.MESSAGE, ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class);
    }

    private ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class) {
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
