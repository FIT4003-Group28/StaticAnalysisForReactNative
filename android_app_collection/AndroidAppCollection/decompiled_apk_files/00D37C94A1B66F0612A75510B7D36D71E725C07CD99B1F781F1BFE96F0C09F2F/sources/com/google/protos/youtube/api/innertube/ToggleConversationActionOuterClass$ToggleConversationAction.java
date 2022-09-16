package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ToggleConversationActionOuterClass$ToggleConversationAction extends aopi implements aoqv {
    public static final ToggleConversationActionOuterClass$ToggleConversationAction a;
    private static volatile aorb d;
    public static final aopg toggleConversationAction;
    public int b;
    public boolean c;

    static {
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = new ToggleConversationActionOuterClass$ToggleConversationAction();
        a = toggleConversationActionOuterClass$ToggleConversationAction;
        aopi.registerDefaultInstance(ToggleConversationActionOuterClass$ToggleConversationAction.class, toggleConversationActionOuterClass$ToggleConversationAction);
        toggleConversationAction = aopi.newSingularGeneratedExtension(apzg.a, toggleConversationActionOuterClass$ToggleConversationAction, toggleConversationActionOuterClass$ToggleConversationAction, null, 130528991, aosj.MESSAGE, ToggleConversationActionOuterClass$ToggleConversationAction.class);
    }

    private ToggleConversationActionOuterClass$ToggleConversationAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"b", "c"});
            case 3:
                return new ToggleConversationActionOuterClass$ToggleConversationAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ToggleConversationActionOuterClass$ToggleConversationAction.class) {
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
