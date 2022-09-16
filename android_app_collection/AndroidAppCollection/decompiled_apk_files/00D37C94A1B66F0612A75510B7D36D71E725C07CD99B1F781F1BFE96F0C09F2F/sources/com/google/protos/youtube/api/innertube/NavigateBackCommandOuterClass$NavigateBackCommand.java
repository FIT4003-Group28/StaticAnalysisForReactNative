package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NavigateBackCommandOuterClass$NavigateBackCommand extends aopi implements aoqv {
    public static final NavigateBackCommandOuterClass$NavigateBackCommand a;
    private static volatile aorb b;
    public static final aopg navigateBackCommand;

    static {
        NavigateBackCommandOuterClass$NavigateBackCommand navigateBackCommandOuterClass$NavigateBackCommand = new NavigateBackCommandOuterClass$NavigateBackCommand();
        a = navigateBackCommandOuterClass$NavigateBackCommand;
        aopi.registerDefaultInstance(NavigateBackCommandOuterClass$NavigateBackCommand.class, navigateBackCommandOuterClass$NavigateBackCommand);
        navigateBackCommand = aopi.newSingularGeneratedExtension(apzg.a, navigateBackCommandOuterClass$NavigateBackCommand, navigateBackCommandOuterClass$NavigateBackCommand, null, 368868921, aosj.MESSAGE, NavigateBackCommandOuterClass$NavigateBackCommand.class);
    }

    private NavigateBackCommandOuterClass$NavigateBackCommand() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new NavigateBackCommandOuterClass$NavigateBackCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (NavigateBackCommandOuterClass$NavigateBackCommand.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
