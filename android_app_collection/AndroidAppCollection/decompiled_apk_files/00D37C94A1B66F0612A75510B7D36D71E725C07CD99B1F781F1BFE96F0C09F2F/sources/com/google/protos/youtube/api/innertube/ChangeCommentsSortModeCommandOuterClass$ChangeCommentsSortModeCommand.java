package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand extends aopi implements aoqv {
    public static final ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand a;
    public static final aopg changeCommentsSortModeCommand;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand = new ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand();
        a = changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand;
        aopi.registerDefaultInstance(ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.class, changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand);
        changeCommentsSortModeCommand = aopi.newSingularGeneratedExtension(apzg.a, changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand, changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand, null, 348085446, aosj.MESSAGE, ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.class);
    }

    private ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", arka.n});
            case 3:
                return new ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.class) {
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
