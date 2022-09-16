package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand extends aopi implements aoqv {
    public static final LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand a;
    private static volatile aorb b;
    public static final aopg logAdClickTerminationCommand;

    static {
        LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand logAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand = new LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand();
        a = logAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand;
        aopi.registerDefaultInstance(LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class, logAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand);
        logAdClickTerminationCommand = aopi.newSingularGeneratedExtension(apzg.a, logAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand, logAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand, null, 358889020, aosj.MESSAGE, LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class);
    }

    private LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand() {
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
                return new LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class) {
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
