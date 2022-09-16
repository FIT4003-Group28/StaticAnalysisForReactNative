package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand extends aopi implements aoqv {
    public static final StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand a;
    private static volatile aorb g;
    public static final aopg startModularOnboardingCommand;
    public apwe b;
    public apzg e;
    public boolean f;
    private int h;
    private byte i = 2;
    public String c = "";
    public String d = "";

    static {
        StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand startModularOnboardingCommandOuterClass$StartModularOnboardingCommand = new StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand();
        a = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
        aopi.registerDefaultInstance(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class, startModularOnboardingCommandOuterClass$StartModularOnboardingCommand);
        startModularOnboardingCommand = aopi.newSingularGeneratedExtension(apzg.a, startModularOnboardingCommandOuterClass$StartModularOnboardingCommand, startModularOnboardingCommandOuterClass$StartModularOnboardingCommand, null, 301098174, aosj.MESSAGE, StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class);
    }

    private StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
