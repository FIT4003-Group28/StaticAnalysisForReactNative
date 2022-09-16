package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand extends aopi implements aoqv {
    public static final WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand a;
    private static volatile aorb c;
    public static final aopg watchNextWatchEndpointMutationCommand;
    public apzg b;
    private int d;
    private byte e = 2;

    static {
        WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand watchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand = new WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand();
        a = watchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand;
        aopi.registerDefaultInstance(WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.class, watchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand);
        watchNextWatchEndpointMutationCommand = aopi.newSingularGeneratedExtension(apzg.a, watchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand, watchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand, null, 267704595, aosj.MESSAGE, WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.class);
    }

    private WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand() {
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
                return new WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.class) {
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
