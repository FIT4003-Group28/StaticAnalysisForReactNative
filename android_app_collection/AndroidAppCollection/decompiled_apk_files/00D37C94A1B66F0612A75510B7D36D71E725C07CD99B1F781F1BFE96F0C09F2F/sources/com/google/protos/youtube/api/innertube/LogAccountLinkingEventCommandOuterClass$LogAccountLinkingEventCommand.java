package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand extends aopi implements aoqv {
    public static final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand a;
    private static volatile aorb d;
    public static final aopg logAccountLinkingEventCommand;
    public int b;
    public arby c;

    static {
        LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand = new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
        a = logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand;
        aopi.registerDefaultInstance(LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class, logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand);
        logAccountLinkingEventCommand = aopi.newSingularGeneratedExtension(apzg.a, logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand, logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand, null, 316544609, aosj.MESSAGE, LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class);
    }

    private LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class) {
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
