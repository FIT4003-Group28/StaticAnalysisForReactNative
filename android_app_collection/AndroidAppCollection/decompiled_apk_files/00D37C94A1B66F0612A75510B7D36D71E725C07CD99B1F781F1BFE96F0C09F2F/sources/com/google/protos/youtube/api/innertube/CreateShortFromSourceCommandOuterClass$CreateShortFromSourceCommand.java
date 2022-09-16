package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand extends aopi implements aoqv {
    public static final CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand a;
    public static final aopg createShortFromSourceCommand;
    private static volatile aorb d;
    public apzg b;
    public aqiz c;
    private int e;
    private byte f = 2;

    static {
        CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand = new CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand();
        a = createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand;
        aopi.registerDefaultInstance(CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.class, createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand);
        createShortFromSourceCommand = aopi.newSingularGeneratedExtension(apzg.a, createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand, createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand, null, 325343688, aosj.MESSAGE, CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.class);
    }

    private CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
