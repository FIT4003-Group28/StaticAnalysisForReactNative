package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogStreamEventsCommandOuterClass$LogStreamEventsCommand extends aopi implements aoqv {
    public static final LogStreamEventsCommandOuterClass$LogStreamEventsCommand a;
    private static volatile aorb d;
    public static final aopg logStreamEventsCommand;
    public String b = "";
    public String c = "";
    private int e;

    static {
        LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand = new LogStreamEventsCommandOuterClass$LogStreamEventsCommand();
        a = logStreamEventsCommandOuterClass$LogStreamEventsCommand;
        aopi.registerDefaultInstance(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.class, logStreamEventsCommandOuterClass$LogStreamEventsCommand);
        logStreamEventsCommand = aopi.newSingularGeneratedExtension(apzg.a, logStreamEventsCommandOuterClass$LogStreamEventsCommand, logStreamEventsCommandOuterClass$LogStreamEventsCommand, null, 191842732, aosj.MESSAGE, LogStreamEventsCommandOuterClass$LogStreamEventsCommand.class);
    }

    private LogStreamEventsCommandOuterClass$LogStreamEventsCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new LogStreamEventsCommandOuterClass$LogStreamEventsCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LogStreamEventsCommandOuterClass$LogStreamEventsCommand.class) {
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
