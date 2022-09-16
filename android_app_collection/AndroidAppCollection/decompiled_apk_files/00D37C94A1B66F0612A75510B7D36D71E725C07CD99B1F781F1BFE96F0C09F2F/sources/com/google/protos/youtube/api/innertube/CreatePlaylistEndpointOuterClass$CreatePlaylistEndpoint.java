package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint extends aopi implements aoqv {
    public static final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint a;
    public static final aopg createPlaylistEndpoint;
    private static volatile aorb i;
    public int b;
    public Object d;
    public int c = 0;
    private byte j = 2;
    public aopu e = aopi.emptyProtobufList();
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = new CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint();
        a = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        aopi.registerDefaultInstance(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint);
        createPlaylistEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, null, 85650004, aosj.MESSAGE, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class);
    }

    private CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\t\u0005\u0000\u0001\u0001\u0001\u001a\u0002ဈ\u0000\u0007ဈ\u0002\bဈ\u0003\tᐼ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", aunb.class});
            case 3:
                return new CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
