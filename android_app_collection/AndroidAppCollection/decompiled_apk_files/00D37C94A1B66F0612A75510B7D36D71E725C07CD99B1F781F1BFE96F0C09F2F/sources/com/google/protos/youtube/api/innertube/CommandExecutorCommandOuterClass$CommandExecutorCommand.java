package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CommandExecutorCommandOuterClass$CommandExecutorCommand extends aopi implements aoqv {
    public static final CommandExecutorCommandOuterClass$CommandExecutorCommand a;
    private static volatile aorb c;
    public static final aopg commandExecutorCommand;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand = new CommandExecutorCommandOuterClass$CommandExecutorCommand();
        a = commandExecutorCommandOuterClass$CommandExecutorCommand;
        aopi.registerDefaultInstance(CommandExecutorCommandOuterClass$CommandExecutorCommand.class, commandExecutorCommandOuterClass$CommandExecutorCommand);
        commandExecutorCommand = aopi.newSingularGeneratedExtension(apzg.a, commandExecutorCommandOuterClass$CommandExecutorCommand, commandExecutorCommandOuterClass$CommandExecutorCommand, null, 174116574, aosj.MESSAGE, CommandExecutorCommandOuterClass$CommandExecutorCommand.class);
    }

    private CommandExecutorCommandOuterClass$CommandExecutorCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", apzg.class});
            case 3:
                return new CommandExecutorCommandOuterClass$CommandExecutorCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (CommandExecutorCommandOuterClass$CommandExecutorCommand.class) {
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
