package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TextMessageEndpointOuterClass$TextMessageEndpoint extends aopi implements aoqv {
    public static final TextMessageEndpointOuterClass$TextMessageEndpoint a;
    private static volatile aorb d;
    public static final aopg textMessageEndpoint;
    private int e;
    private byte f = 2;
    public String b = "";
    public aopu c = aopi.emptyProtobufList();

    static {
        TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = new TextMessageEndpointOuterClass$TextMessageEndpoint();
        a = textMessageEndpointOuterClass$TextMessageEndpoint;
        aopi.registerDefaultInstance(TextMessageEndpointOuterClass$TextMessageEndpoint.class, textMessageEndpointOuterClass$TextMessageEndpoint);
        textMessageEndpoint = aopi.newSingularGeneratedExtension(apzg.a, textMessageEndpointOuterClass$TextMessageEndpoint, textMessageEndpointOuterClass$TextMessageEndpoint, null, 90566164, aosj.MESSAGE, TextMessageEndpointOuterClass$TextMessageEndpoint.class);
    }

    private TextMessageEndpointOuterClass$TextMessageEndpoint() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"e", "b", "c"});
            case 3:
                return new TextMessageEndpointOuterClass$TextMessageEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (TextMessageEndpointOuterClass$TextMessageEndpoint.class) {
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
