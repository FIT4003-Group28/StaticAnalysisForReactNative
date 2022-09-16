package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DisableAutoplayCommandOuterClass$DisableAutoplayCommand extends aopi implements aoqv {
    public static final DisableAutoplayCommandOuterClass$DisableAutoplayCommand a;
    private static volatile aorb b;
    public static final aopg disableAutoplayCommand;

    static {
        DisableAutoplayCommandOuterClass$DisableAutoplayCommand disableAutoplayCommandOuterClass$DisableAutoplayCommand = new DisableAutoplayCommandOuterClass$DisableAutoplayCommand();
        a = disableAutoplayCommandOuterClass$DisableAutoplayCommand;
        aopi.registerDefaultInstance(DisableAutoplayCommandOuterClass$DisableAutoplayCommand.class, disableAutoplayCommandOuterClass$DisableAutoplayCommand);
        disableAutoplayCommand = aopi.newSingularGeneratedExtension(apzg.a, disableAutoplayCommandOuterClass$DisableAutoplayCommand, disableAutoplayCommandOuterClass$DisableAutoplayCommand, null, 251724125, aosj.MESSAGE, DisableAutoplayCommandOuterClass$DisableAutoplayCommand.class);
    }

    private DisableAutoplayCommandOuterClass$DisableAutoplayCommand() {
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
                return new DisableAutoplayCommandOuterClass$DisableAutoplayCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (DisableAutoplayCommandOuterClass$DisableAutoplayCommand.class) {
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
