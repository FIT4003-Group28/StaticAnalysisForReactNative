package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InlineAuthCommandOuterClass$InlineAuthCommand extends aopi implements aoqv {
    public static final InlineAuthCommandOuterClass$InlineAuthCommand a;
    public static final aopg inlineAuthCommand;
    private static volatile aorb j;
    public int b;
    public apzg c;
    public apzg d;
    public apzg e;
    public apzg f;
    public aunb g;
    public apzg i;
    private byte k = 2;
    public aopu h = emptyProtobufList();

    static {
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = new InlineAuthCommandOuterClass$InlineAuthCommand();
        a = inlineAuthCommandOuterClass$InlineAuthCommand;
        aopi.registerDefaultInstance(InlineAuthCommandOuterClass$InlineAuthCommand.class, inlineAuthCommandOuterClass$InlineAuthCommand);
        inlineAuthCommand = aopi.newSingularGeneratedExtension(apzg.a, inlineAuthCommandOuterClass$InlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand, null, 196607391, aosj.MESSAGE, InlineAuthCommandOuterClass$InlineAuthCommand.class);
    }

    private InlineAuthCommandOuterClass$InlineAuthCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", aunb.class, "i"});
            case 3:
                return new InlineAuthCommandOuterClass$InlineAuthCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (InlineAuthCommandOuterClass$InlineAuthCommand.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
