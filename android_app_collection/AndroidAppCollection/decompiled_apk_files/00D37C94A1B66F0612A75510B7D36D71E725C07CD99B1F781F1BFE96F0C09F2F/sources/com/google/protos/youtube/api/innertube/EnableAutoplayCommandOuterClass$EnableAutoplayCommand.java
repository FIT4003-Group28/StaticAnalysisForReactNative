package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EnableAutoplayCommandOuterClass$EnableAutoplayCommand extends aopi implements aoqv {
    public static final EnableAutoplayCommandOuterClass$EnableAutoplayCommand a;
    private static volatile aorb b;
    public static final aopg enableAutoplayCommand;

    static {
        EnableAutoplayCommandOuterClass$EnableAutoplayCommand enableAutoplayCommandOuterClass$EnableAutoplayCommand = new EnableAutoplayCommandOuterClass$EnableAutoplayCommand();
        a = enableAutoplayCommandOuterClass$EnableAutoplayCommand;
        aopi.registerDefaultInstance(EnableAutoplayCommandOuterClass$EnableAutoplayCommand.class, enableAutoplayCommandOuterClass$EnableAutoplayCommand);
        enableAutoplayCommand = aopi.newSingularGeneratedExtension(apzg.a, enableAutoplayCommandOuterClass$EnableAutoplayCommand, enableAutoplayCommandOuterClass$EnableAutoplayCommand, null, 251724126, aosj.MESSAGE, EnableAutoplayCommandOuterClass$EnableAutoplayCommand.class);
    }

    private EnableAutoplayCommandOuterClass$EnableAutoplayCommand() {
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
                return new EnableAutoplayCommandOuterClass$EnableAutoplayCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EnableAutoplayCommandOuterClass$EnableAutoplayCommand.class) {
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
