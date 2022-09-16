package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand extends aopi implements aoqv {
    public static final LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand a;
    private static volatile aorb d;
    public static final aopg logYpcFlowDismissCommand;
    public int b = 0;
    public Object c;

    static {
        LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand = new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
        a = logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand;
        aopi.registerDefaultInstance(LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class, logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand);
        logYpcFlowDismissCommand = aopi.newSingularGeneratedExtension(apzg.a, logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand, logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand, null, 192838928, aosj.MESSAGE, LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class);
    }

    private LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000\u0003ွ\u0000\u0004ွ\u0000\u0005ွ\u0000", new Object[]{"c", "b"});
            case 3:
                return new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class) {
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
