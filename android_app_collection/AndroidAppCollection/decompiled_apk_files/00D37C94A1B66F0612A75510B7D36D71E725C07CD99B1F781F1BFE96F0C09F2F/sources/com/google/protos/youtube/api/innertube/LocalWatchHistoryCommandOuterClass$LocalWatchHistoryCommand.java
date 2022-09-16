package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand extends aopi implements aoqv {
    public static final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand a;
    private static volatile aorb d;
    public static final aopg localWatchHistoryCommand;
    public int b;
    public String c = "";
    private int e;

    static {
        LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
        a = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
        aopi.registerDefaultInstance(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand);
        localWatchHistoryCommand = aopi.newSingularGeneratedExtension(apzg.a, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand, null, 246157926, aosj.MESSAGE, LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class);
    }

    private LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", asut.e, "c"});
            case 3:
                return new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class) {
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
