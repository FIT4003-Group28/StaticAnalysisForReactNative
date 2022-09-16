package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RunAttestationCommandOuterClass$RunAttestationCommand extends aopi implements aoqv {
    public static final RunAttestationCommandOuterClass$RunAttestationCommand a;
    private static volatile aorb d;
    public static final aopg runAttestationCommand;
    public aopu b = emptyProtobufList();
    public int c;
    private int e;

    static {
        RunAttestationCommandOuterClass$RunAttestationCommand runAttestationCommandOuterClass$RunAttestationCommand = new RunAttestationCommandOuterClass$RunAttestationCommand();
        a = runAttestationCommandOuterClass$RunAttestationCommand;
        aopi.registerDefaultInstance(RunAttestationCommandOuterClass$RunAttestationCommand.class, runAttestationCommandOuterClass$RunAttestationCommand);
        runAttestationCommand = aopi.newSingularGeneratedExtension(apzg.a, runAttestationCommandOuterClass$RunAttestationCommand, runAttestationCommandOuterClass$RunAttestationCommand, null, 272487492, aosj.MESSAGE, RunAttestationCommandOuterClass$RunAttestationCommand.class);
    }

    private RunAttestationCommandOuterClass$RunAttestationCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"e", "b", apig.class, "c", apfa.t});
            case 3:
                return new RunAttestationCommandOuterClass$RunAttestationCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (RunAttestationCommandOuterClass$RunAttestationCommand.class) {
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
