package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RegisterTasksCommandOuterClass$RegisterTasksCommand extends aopi implements aoqv {
    public static final RegisterTasksCommandOuterClass$RegisterTasksCommand a;
    private static volatile aorb c;
    public static final aopg registerTasksCommand;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        RegisterTasksCommandOuterClass$RegisterTasksCommand registerTasksCommandOuterClass$RegisterTasksCommand = new RegisterTasksCommandOuterClass$RegisterTasksCommand();
        a = registerTasksCommandOuterClass$RegisterTasksCommand;
        aopi.registerDefaultInstance(RegisterTasksCommandOuterClass$RegisterTasksCommand.class, registerTasksCommandOuterClass$RegisterTasksCommand);
        registerTasksCommand = aopi.newSingularGeneratedExtension(apzg.a, registerTasksCommandOuterClass$RegisterTasksCommand, registerTasksCommandOuterClass$RegisterTasksCommand, null, 377621461, aosj.MESSAGE, RegisterTasksCommandOuterClass$RegisterTasksCommand.class);
    }

    private RegisterTasksCommandOuterClass$RegisterTasksCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", avfx.class});
            case 3:
                return new RegisterTasksCommandOuterClass$RegisterTasksCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (RegisterTasksCommandOuterClass$RegisterTasksCommand.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
