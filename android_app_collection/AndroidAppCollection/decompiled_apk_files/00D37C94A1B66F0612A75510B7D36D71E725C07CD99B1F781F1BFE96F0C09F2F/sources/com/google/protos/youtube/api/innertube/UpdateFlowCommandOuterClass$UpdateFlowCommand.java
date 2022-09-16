package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateFlowCommandOuterClass$UpdateFlowCommand extends aopi implements aoqv {
    public static final UpdateFlowCommandOuterClass$UpdateFlowCommand a;
    private static volatile aorb g;
    public static final aopg updateFlowCommand;
    public int b;
    public apzg e;
    public apzg f;
    private byte h = 2;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        UpdateFlowCommandOuterClass$UpdateFlowCommand updateFlowCommandOuterClass$UpdateFlowCommand = new UpdateFlowCommandOuterClass$UpdateFlowCommand();
        a = updateFlowCommandOuterClass$UpdateFlowCommand;
        aopi.registerDefaultInstance(UpdateFlowCommandOuterClass$UpdateFlowCommand.class, updateFlowCommandOuterClass$UpdateFlowCommand);
        updateFlowCommand = aopi.newSingularGeneratedExtension(apzg.a, updateFlowCommandOuterClass$UpdateFlowCommand, updateFlowCommandOuterClass$UpdateFlowCommand, null, 371825304, aosj.MESSAGE, UpdateFlowCommandOuterClass$UpdateFlowCommand.class);
    }

    private UpdateFlowCommandOuterClass$UpdateFlowCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", aunb.class, "e", "f"});
            case 3:
                return new UpdateFlowCommandOuterClass$UpdateFlowCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (UpdateFlowCommandOuterClass$UpdateFlowCommand.class) {
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
