package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand extends aopi implements aoqv {
    public static final ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand a;
    private static volatile aorb b;
    public static final aopg showNoConnectionBarCommand;

    static {
        ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand = new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
        a = showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
        aopi.registerDefaultInstance(ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class, showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand);
        showNoConnectionBarCommand = aopi.newSingularGeneratedExtension(apzg.a, showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand, showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand, null, 246536901, aosj.MESSAGE, ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class);
    }

    private ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
