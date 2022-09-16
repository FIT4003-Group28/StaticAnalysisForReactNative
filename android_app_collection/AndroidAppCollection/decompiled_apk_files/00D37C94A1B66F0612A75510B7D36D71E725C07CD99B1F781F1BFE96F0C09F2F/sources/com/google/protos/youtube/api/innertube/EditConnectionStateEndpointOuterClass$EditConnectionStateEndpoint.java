package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint extends aopi implements aoqv {
    public static final EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint a;
    private static volatile aorb e;
    public static final aopg editConnectionStateEndpoint;
    public int b;
    private byte f = 2;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = new EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint();
        a = editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
        aopi.registerDefaultInstance(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint);
        editConnectionStateEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint, null, 90427601, aosj.MESSAGE, EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class);
    }

    private EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"b", "c", "d", apzg.class});
            case 3:
                return new EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class) {
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
