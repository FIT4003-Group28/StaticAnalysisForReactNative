package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand extends aopi implements aoqv {
    public static final GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand a;
    private static volatile aorb b;
    public static final aopg getSuggestedPlaylistVideosCommand;

    static {
        GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand = new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
        a = getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand;
        aopi.registerDefaultInstance(GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand);
        getSuggestedPlaylistVideosCommand = aopi.newSingularGeneratedExtension(apzg.a, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand, null, 229815794, aosj.MESSAGE, GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class);
    }

    private GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand() {
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
                return new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class) {
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
