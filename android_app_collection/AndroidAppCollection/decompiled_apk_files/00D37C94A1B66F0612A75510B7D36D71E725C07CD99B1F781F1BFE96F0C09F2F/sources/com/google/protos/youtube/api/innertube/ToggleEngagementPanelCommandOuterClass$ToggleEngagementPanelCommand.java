package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand extends aopi implements aoqv {
    public static final ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand a;
    private static volatile aorb d;
    public static final aopg toggleEngagementPanelCommand;
    public int b = 0;
    public Object c;

    static {
        ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand = new ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand();
        a = toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
        aopi.registerDefaultInstance(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class, toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand);
        toggleEngagementPanelCommand = aopi.newSingularGeneratedExtension(apzg.a, toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand, toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand, null, 369951587, aosj.MESSAGE, ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class);
    }

    private ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"c", "b", aqvl.class});
            case 3:
                return new ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class) {
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
