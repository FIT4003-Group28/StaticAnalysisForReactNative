package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand extends aopi implements aoqv {
    public static final MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand a;
    private static volatile aorb c;
    public static final aopg multiReelDismissalEndpointCommand;
    public aunb b;
    private int d;
    private byte e = 2;

    static {
        MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand = new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
        a = multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
        aopi.registerDefaultInstance(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class, multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand);
        multiReelDismissalEndpointCommand = aopi.newSingularGeneratedExtension(apzg.a, multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand, multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand, null, 187251317, aosj.MESSAGE, MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class);
    }

    private MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand() {
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
                return new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class) {
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
