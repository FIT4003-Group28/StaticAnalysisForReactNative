package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand extends aopi implements aoqv {
    public static final SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand a;
    private static volatile aorb f;
    public static final aopg setEngagementPanelActivelyEngagingCommand;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand = new SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand();
        a = setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand;
        aopi.registerDefaultInstance(SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.class, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand);
        setEngagementPanelActivelyEngagingCommand = aopi.newSingularGeneratedExtension(apzg.a, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand, null, 321581790, aosj.MESSAGE, SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.class);
    }

    private SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ဇ\u0002\u0003ြ\u0000", new Object[]{"d", "c", "b", "e", aqvl.class});
            case 3:
                return new SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.class) {
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
