package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RefreshConfigCommandOuterClass$RefreshConfigCommand extends aopi implements aoqv {
    public static final RefreshConfigCommandOuterClass$RefreshConfigCommand a;
    private static volatile aorb b;
    public static final aopg refreshConfigCommand;

    static {
        RefreshConfigCommandOuterClass$RefreshConfigCommand refreshConfigCommandOuterClass$RefreshConfigCommand = new RefreshConfigCommandOuterClass$RefreshConfigCommand();
        a = refreshConfigCommandOuterClass$RefreshConfigCommand;
        aopi.registerDefaultInstance(RefreshConfigCommandOuterClass$RefreshConfigCommand.class, refreshConfigCommandOuterClass$RefreshConfigCommand);
        refreshConfigCommand = aopi.newSingularGeneratedExtension(apzg.a, refreshConfigCommandOuterClass$RefreshConfigCommand, refreshConfigCommandOuterClass$RefreshConfigCommand, null, 191373512, aosj.MESSAGE, RefreshConfigCommandOuterClass$RefreshConfigCommand.class);
    }

    private RefreshConfigCommandOuterClass$RefreshConfigCommand() {
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
                return new RefreshConfigCommandOuterClass$RefreshConfigCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (RefreshConfigCommandOuterClass$RefreshConfigCommand.class) {
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
