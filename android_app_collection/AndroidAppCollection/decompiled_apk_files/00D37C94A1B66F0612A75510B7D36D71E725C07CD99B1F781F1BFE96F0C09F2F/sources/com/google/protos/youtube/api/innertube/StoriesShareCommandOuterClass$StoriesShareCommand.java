package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StoriesShareCommandOuterClass$StoriesShareCommand extends aopi implements aoqv {
    public static final StoriesShareCommandOuterClass$StoriesShareCommand a;
    private static volatile aorb h;
    public static final aopg storiesShareCommand;
    public Object c;
    public int e;
    private int i;
    public int b = 0;
    public aoob d = aoob.b;
    public String f = "";
    public String g = "";

    static {
        StoriesShareCommandOuterClass$StoriesShareCommand storiesShareCommandOuterClass$StoriesShareCommand = new StoriesShareCommandOuterClass$StoriesShareCommand();
        a = storiesShareCommandOuterClass$StoriesShareCommand;
        aopi.registerDefaultInstance(StoriesShareCommandOuterClass$StoriesShareCommand.class, storiesShareCommandOuterClass$StoriesShareCommand);
        storiesShareCommand = aopi.newSingularGeneratedExtension(apzg.a, storiesShareCommandOuterClass$StoriesShareCommand, storiesShareCommandOuterClass$StoriesShareCommand, null, 377377894, aosj.MESSAGE, StoriesShareCommandOuterClass$StoriesShareCommand.class);
    }

    private StoriesShareCommandOuterClass$StoriesShareCommand() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ွ\u0000\u0003ွ\u0000\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"c", "b", "i", "d", "e", auwh.o, "f", "g"});
            case 3:
                return new StoriesShareCommandOuterClass$StoriesShareCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (StoriesShareCommandOuterClass$StoriesShareCommand.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
