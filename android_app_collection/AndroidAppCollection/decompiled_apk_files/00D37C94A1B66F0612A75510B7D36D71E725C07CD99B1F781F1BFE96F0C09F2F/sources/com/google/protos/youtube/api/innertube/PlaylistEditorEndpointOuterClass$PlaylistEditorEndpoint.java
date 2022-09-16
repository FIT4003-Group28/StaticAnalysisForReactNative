package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint extends aopi implements aoqv {
    public static final PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint a;
    private static volatile aorb c;
    public static final aopg playlistEditorEndpoint;
    public String b = "";
    private int d;

    static {
        PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint playlistEditorEndpointOuterClass$PlaylistEditorEndpoint = new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
        a = playlistEditorEndpointOuterClass$PlaylistEditorEndpoint;
        aopi.registerDefaultInstance(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class, playlistEditorEndpointOuterClass$PlaylistEditorEndpoint);
        playlistEditorEndpoint = aopi.newSingularGeneratedExtension(apzg.a, playlistEditorEndpointOuterClass$PlaylistEditorEndpoint, playlistEditorEndpointOuterClass$PlaylistEditorEndpoint, null, 93440769, aosj.MESSAGE, PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class);
    }

    private PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
