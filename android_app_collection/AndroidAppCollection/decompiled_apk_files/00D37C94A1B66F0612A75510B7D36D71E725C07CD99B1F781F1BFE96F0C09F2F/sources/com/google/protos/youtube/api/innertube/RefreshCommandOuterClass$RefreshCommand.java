package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RefreshCommandOuterClass$RefreshCommand extends aopi implements aoqv {
    public static final RefreshCommandOuterClass$RefreshCommand a;
    private static volatile aorb d;
    public static final aopg refreshCommand;
    public int b;
    public int c;

    static {
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = new RefreshCommandOuterClass$RefreshCommand();
        a = refreshCommandOuterClass$RefreshCommand;
        aopi.registerDefaultInstance(RefreshCommandOuterClass$RefreshCommand.class, refreshCommandOuterClass$RefreshCommand);
        refreshCommand = aopi.newSingularGeneratedExtension(apzg.a, refreshCommandOuterClass$RefreshCommand, refreshCommandOuterClass$RefreshCommand, null, 177327295, aosj.MESSAGE, RefreshCommandOuterClass$RefreshCommand.class);
    }

    private RefreshCommandOuterClass$RefreshCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", aulk.m});
            case 3:
                return new RefreshCommandOuterClass$RefreshCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (RefreshCommandOuterClass$RefreshCommand.class) {
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
