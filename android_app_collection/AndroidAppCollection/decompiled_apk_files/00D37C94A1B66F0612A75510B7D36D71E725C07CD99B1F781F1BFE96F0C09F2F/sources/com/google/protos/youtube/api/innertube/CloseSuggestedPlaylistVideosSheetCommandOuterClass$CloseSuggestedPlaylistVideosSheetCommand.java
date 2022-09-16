package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand extends aopi implements aoqv {
    public static final CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand a;
    private static volatile aorb b;
    public static final aopg closeSuggestedPlaylistVideosSheetCommand;

    static {
        CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand closeSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand = new CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand();
        a = closeSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand;
        aopi.registerDefaultInstance(CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.class, closeSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand);
        closeSuggestedPlaylistVideosSheetCommand = aopi.newSingularGeneratedExtension(apzg.a, closeSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand, closeSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand, null, 230628345, aosj.MESSAGE, CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.class);
    }

    private CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand() {
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
                return new CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.class) {
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
