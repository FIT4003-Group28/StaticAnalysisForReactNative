package com.google.protos.youtube.api.innertube;
/* loaded from: classes3.dex */
public final class ConnectGpgDialogCommand$ConnectGPGDialogCommand extends aopi implements aoqv {
    public static final ConnectGpgDialogCommand$ConnectGPGDialogCommand a;
    private static volatile aorb c;
    public static final aopg connectGpgDialogCommand;
    public aunb b;
    private int d;
    private byte e = 2;

    static {
        ConnectGpgDialogCommand$ConnectGPGDialogCommand connectGpgDialogCommand$ConnectGPGDialogCommand = new ConnectGpgDialogCommand$ConnectGPGDialogCommand();
        a = connectGpgDialogCommand$ConnectGPGDialogCommand;
        aopi.registerDefaultInstance(ConnectGpgDialogCommand$ConnectGPGDialogCommand.class, connectGpgDialogCommand$ConnectGPGDialogCommand);
        connectGpgDialogCommand = aopi.newSingularGeneratedExtension(apzg.a, connectGpgDialogCommand$ConnectGPGDialogCommand, connectGpgDialogCommand$ConnectGPGDialogCommand, null, 300778229, aosj.MESSAGE, ConnectGpgDialogCommand$ConnectGPGDialogCommand.class);
    }

    private ConnectGpgDialogCommand$ConnectGPGDialogCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ConnectGpgDialogCommand$ConnectGPGDialogCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ConnectGpgDialogCommand$ConnectGPGDialogCommand.class) {
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
