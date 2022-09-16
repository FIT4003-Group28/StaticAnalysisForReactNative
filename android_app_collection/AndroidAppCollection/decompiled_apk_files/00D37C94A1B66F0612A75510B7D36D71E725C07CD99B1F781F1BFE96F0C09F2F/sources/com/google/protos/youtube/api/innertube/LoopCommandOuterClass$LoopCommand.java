package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoopCommandOuterClass$LoopCommand extends aopi implements aoqv {
    public static final LoopCommandOuterClass$LoopCommand a;
    private static volatile aorb g;
    public static final aopg loopCommand;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public String f = "";

    static {
        LoopCommandOuterClass$LoopCommand loopCommandOuterClass$LoopCommand = new LoopCommandOuterClass$LoopCommand();
        a = loopCommandOuterClass$LoopCommand;
        aopi.registerDefaultInstance(LoopCommandOuterClass$LoopCommand.class, loopCommandOuterClass$LoopCommand);
        loopCommand = aopi.newSingularGeneratedExtension(apzg.a, loopCommandOuterClass$LoopCommand, loopCommandOuterClass$LoopCommand, null, 250570650, aosj.MESSAGE, LoopCommandOuterClass$LoopCommand.class);
    }

    private LoopCommandOuterClass$LoopCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new LoopCommandOuterClass$LoopCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (LoopCommandOuterClass$LoopCommand.class) {
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
