package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EnterVrModeCommandOuterClass$EnterVrModeCommand extends aopi implements aoqv {
    public static final EnterVrModeCommandOuterClass$EnterVrModeCommand a;
    private static volatile aorb b;
    public static final aopg enterVrModeCommand;

    static {
        EnterVrModeCommandOuterClass$EnterVrModeCommand enterVrModeCommandOuterClass$EnterVrModeCommand = new EnterVrModeCommandOuterClass$EnterVrModeCommand();
        a = enterVrModeCommandOuterClass$EnterVrModeCommand;
        aopi.registerDefaultInstance(EnterVrModeCommandOuterClass$EnterVrModeCommand.class, enterVrModeCommandOuterClass$EnterVrModeCommand);
        enterVrModeCommand = aopi.newSingularGeneratedExtension(apzg.a, enterVrModeCommandOuterClass$EnterVrModeCommand, enterVrModeCommandOuterClass$EnterVrModeCommand, null, 245319097, aosj.MESSAGE, EnterVrModeCommandOuterClass$EnterVrModeCommand.class);
    }

    private EnterVrModeCommandOuterClass$EnterVrModeCommand() {
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
                return new EnterVrModeCommandOuterClass$EnterVrModeCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EnterVrModeCommandOuterClass$EnterVrModeCommand.class) {
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
