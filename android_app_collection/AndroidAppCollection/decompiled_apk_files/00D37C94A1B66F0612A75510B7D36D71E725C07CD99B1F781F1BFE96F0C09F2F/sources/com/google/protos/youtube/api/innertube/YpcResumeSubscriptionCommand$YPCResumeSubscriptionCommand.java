package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand extends aopi implements aoqv {
    public static final YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand a;
    private static volatile aorb d;
    public static final aopg ypcResumeSubscriptionCommand;
    public String b = "";
    public aoob c = aoob.b;
    private int e;

    static {
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand = new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
        a = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
        aopi.registerDefaultInstance(YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand);
        ypcResumeSubscriptionCommand = aopi.newSingularGeneratedExtension(apzg.a, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand, null, 191943580, aosj.MESSAGE, YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class);
    }

    private YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class) {
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
