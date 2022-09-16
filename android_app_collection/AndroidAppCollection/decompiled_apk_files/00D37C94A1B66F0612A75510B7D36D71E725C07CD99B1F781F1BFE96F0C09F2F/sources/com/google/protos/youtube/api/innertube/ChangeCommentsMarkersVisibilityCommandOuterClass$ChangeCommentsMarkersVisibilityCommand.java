package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand extends aopi implements aoqv {
    public static final ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand a;
    public static final aopg changeCommentsMarkersVisibilityCommand;
    private static volatile aorb d;
    public int b;
    public boolean c;

    static {
        ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand = new ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand();
        a = changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand;
        aopi.registerDefaultInstance(ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.class, changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand);
        changeCommentsMarkersVisibilityCommand = aopi.newSingularGeneratedExtension(apzg.a, changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand, changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand, null, 348087899, aosj.MESSAGE, ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.class);
    }

    private ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand() {
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
                return new ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.class) {
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
