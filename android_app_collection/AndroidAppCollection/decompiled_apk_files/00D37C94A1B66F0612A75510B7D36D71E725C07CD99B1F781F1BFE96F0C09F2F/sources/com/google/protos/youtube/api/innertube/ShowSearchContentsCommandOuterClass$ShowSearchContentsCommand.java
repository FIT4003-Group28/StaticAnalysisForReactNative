package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand extends aopi implements aoqv {
    public static final ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand a;
    private static volatile aorb b;
    public static final aopg showSearchContentsCommand;

    static {
        ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand showSearchContentsCommandOuterClass$ShowSearchContentsCommand = new ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand();
        a = showSearchContentsCommandOuterClass$ShowSearchContentsCommand;
        aopi.registerDefaultInstance(ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class, showSearchContentsCommandOuterClass$ShowSearchContentsCommand);
        showSearchContentsCommand = aopi.newSingularGeneratedExtension(apzg.a, showSearchContentsCommandOuterClass$ShowSearchContentsCommand, showSearchContentsCommandOuterClass$ShowSearchContentsCommand, null, 242013526, aosj.MESSAGE, ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class);
    }

    private ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand() {
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
                return new ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class) {
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
