package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlaylistEditEndpointOuterClass$PlaylistEditEndpoint extends aopi implements aoqv {
    public static final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint a;
    private static volatile aorb f;
    public static final aopg playlistEditEndpoint;
    private int g;
    private byte h = 2;
    public String b = "";
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public String e = "";

    static {
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
        a = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
        aopi.registerDefaultInstance(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class, playlistEditEndpointOuterClass$PlaylistEditEndpoint);
        playlistEditEndpoint = aopi.newSingularGeneratedExtension(apzg.a, playlistEditEndpointOuterClass$PlaylistEditEndpoint, playlistEditEndpointOuterClass$PlaylistEditEndpoint, null, 60666189, aosj.MESSAGE, PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class);
    }

    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0005Л", new Object[]{"g", "b", "c", auci.class, "e", "d", apzg.class});
            case 3:
                return new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
            case 4:
                return new aopa((short[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
