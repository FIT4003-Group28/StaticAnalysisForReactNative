package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand extends aopi implements aoqv {
    public static final YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand a;
    private static volatile aorb f;
    public static final aopg ypcPauseSubscriptionCommand;
    public int b;
    public String c = "";
    public aoob d = aoob.b;
    public long e;

    static {
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand = new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
        a = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
        aopi.registerDefaultInstance(YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand);
        ypcPauseSubscriptionCommand = aopi.newSingularGeneratedExtension(apzg.a, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand, null, 191762785, aosj.MESSAGE, YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class);
    }

    private YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
