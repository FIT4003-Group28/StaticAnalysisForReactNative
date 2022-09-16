package com.google.protos.youtube.api.innertube;
/* loaded from: classes3.dex */
public final class CreateGpgProfileCommand$CreateGPGProfileCommand extends aopi implements aoqv {
    public static final CreateGpgProfileCommand$CreateGPGProfileCommand a;
    public static final aopg createGpgProfileCommand;
    private static volatile aorb f;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand c;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand d;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand = new CreateGpgProfileCommand$CreateGPGProfileCommand();
        a = createGpgProfileCommand$CreateGPGProfileCommand;
        aopi.registerDefaultInstance(CreateGpgProfileCommand$CreateGPGProfileCommand.class, createGpgProfileCommand$CreateGPGProfileCommand);
        createGpgProfileCommand = aopi.newSingularGeneratedExtension(apzg.a, createGpgProfileCommand$CreateGPGProfileCommand, createGpgProfileCommand$CreateGPGProfileCommand, null, 300761790, aosj.MESSAGE, CreateGpgProfileCommand$CreateGPGProfileCommand.class);
    }

    private CreateGpgProfileCommand$CreateGPGProfileCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new CreateGpgProfileCommand$CreateGPGProfileCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (CreateGpgProfileCommand$CreateGPGProfileCommand.class) {
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
