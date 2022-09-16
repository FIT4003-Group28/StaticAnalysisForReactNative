package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand extends aopi implements aoqv {
    public static final ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand a;
    private static volatile aorb c;
    public static final aopg reelPrefetchWatchCommand;
    public apzg b;
    private int d;
    private byte e = 2;

    static {
        ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand reelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand = new ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand();
        a = reelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand;
        aopi.registerDefaultInstance(ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand.class, reelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand);
        reelPrefetchWatchCommand = aopi.newSingularGeneratedExtension(apzg.a, reelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand, reelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand, null, 371256104, aosj.MESSAGE, ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand.class);
    }

    private ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand.class) {
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
