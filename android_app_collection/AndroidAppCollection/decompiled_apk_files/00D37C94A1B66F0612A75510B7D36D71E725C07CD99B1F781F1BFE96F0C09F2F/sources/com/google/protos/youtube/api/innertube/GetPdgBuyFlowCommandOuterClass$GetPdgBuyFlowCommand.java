package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand extends aopi implements aoqv {
    public static final GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand a;
    private static volatile aorb c;
    public static final aopg getPdgBuyFlowCommand;
    public aoob b = aoob.b;
    private int d;

    static {
        GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand = new GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand();
        a = getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand;
        aopi.registerDefaultInstance(GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class, getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand);
        getPdgBuyFlowCommand = aopi.newSingularGeneratedExtension(apzg.a, getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand, getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand, null, 257016449, aosj.MESSAGE, GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class);
    }

    private GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"d", "b"});
            case 3:
                return new GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class) {
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
