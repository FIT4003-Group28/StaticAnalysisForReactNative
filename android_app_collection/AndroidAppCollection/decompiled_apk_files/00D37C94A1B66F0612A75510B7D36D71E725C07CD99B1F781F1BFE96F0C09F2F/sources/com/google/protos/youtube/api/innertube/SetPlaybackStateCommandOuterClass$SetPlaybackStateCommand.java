package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand extends aopi implements aoqv {
    public static final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand a;
    private static volatile aorb d;
    public static final aopg setPlaybackStateCommand;
    public int b;
    public int c;

    static {
        SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand setPlaybackStateCommandOuterClass$SetPlaybackStateCommand = new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
        a = setPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
        aopi.registerDefaultInstance(SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class, setPlaybackStateCommandOuterClass$SetPlaybackStateCommand);
        setPlaybackStateCommand = aopi.newSingularGeneratedExtension(apzg.a, setPlaybackStateCommandOuterClass$SetPlaybackStateCommand, setPlaybackStateCommandOuterClass$SetPlaybackStateCommand, null, 327511066, aosj.MESSAGE, SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class);
    }

    private SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", aupm.i});
            case 3:
                return new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class) {
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
