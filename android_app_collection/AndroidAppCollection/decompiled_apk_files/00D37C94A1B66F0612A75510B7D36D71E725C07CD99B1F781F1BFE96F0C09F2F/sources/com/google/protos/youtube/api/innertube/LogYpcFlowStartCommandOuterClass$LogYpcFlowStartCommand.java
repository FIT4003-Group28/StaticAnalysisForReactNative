package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand extends aopi implements aoqv {
    public static final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand a;
    private static volatile aorb d;
    public static final aopg logYpcFlowStartCommand;
    public int b = 0;
    public Object c;

    static {
        LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand = new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
        a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand;
        aopi.registerDefaultInstance(LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand);
        logYpcFlowStartCommand = aopi.newSingularGeneratedExtension(apzg.a, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand, null, 191342865, aosj.MESSAGE, LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class);
    }

    private LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000\u0003ွ\u0000\u0004ွ\u0000\u0005ွ\u0000\u0006ွ\u0000\bွ\u0000", new Object[]{"c", "b"});
            case 3:
                return new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class) {
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
