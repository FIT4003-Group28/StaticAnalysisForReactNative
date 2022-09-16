package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand extends aopi implements aoqv {
    public static final SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand a;
    private static volatile aorb d;
    public static final aopg setPlayerControlsOverlayVisibilityCommand;
    public int b;
    public boolean c;

    static {
        SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand = new SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand();
        a = setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand;
        aopi.registerDefaultInstance(SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.class, setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand);
        setPlayerControlsOverlayVisibilityCommand = aopi.newSingularGeneratedExtension(apzg.a, setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand, setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand, null, 344144775, aosj.MESSAGE, SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.class);
    }

    private SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            case 3:
                return new SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.class) {
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
