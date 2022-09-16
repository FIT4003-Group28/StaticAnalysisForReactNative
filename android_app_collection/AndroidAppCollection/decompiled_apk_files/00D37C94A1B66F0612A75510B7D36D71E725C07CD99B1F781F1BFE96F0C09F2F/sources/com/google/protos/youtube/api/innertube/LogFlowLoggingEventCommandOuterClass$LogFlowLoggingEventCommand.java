package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand extends aopi implements aoqv {
    public static final LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand a;
    private static volatile aorb i;
    public static final aopg logFlowLoggingEventCommand;
    public int b;
    public int c;
    public int d;
    public int e;
    public aqyu f;
    public String g = "";
    public long h;

    static {
        LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand = new LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand();
        a = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand;
        aopi.registerDefaultInstance(LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand);
        logFlowLoggingEventCommand = aopi.newSingularGeneratedExtension(apzg.a, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand, null, 346644970, aosj.MESSAGE, LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class);
    }

    private LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", aqyp.e, "e", aqzj.a(), "f", "g", "h"});
            case 3:
                return new LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
