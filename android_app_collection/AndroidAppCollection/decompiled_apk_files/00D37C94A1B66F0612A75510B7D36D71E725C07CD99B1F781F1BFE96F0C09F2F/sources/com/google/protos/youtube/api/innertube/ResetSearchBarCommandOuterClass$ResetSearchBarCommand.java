package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResetSearchBarCommandOuterClass$ResetSearchBarCommand extends aopi implements aoqv {
    public static final ResetSearchBarCommandOuterClass$ResetSearchBarCommand a;
    private static volatile aorb b;
    public static final aopg resetSearchBarCommand;

    static {
        ResetSearchBarCommandOuterClass$ResetSearchBarCommand resetSearchBarCommandOuterClass$ResetSearchBarCommand = new ResetSearchBarCommandOuterClass$ResetSearchBarCommand();
        a = resetSearchBarCommandOuterClass$ResetSearchBarCommand;
        aopi.registerDefaultInstance(ResetSearchBarCommandOuterClass$ResetSearchBarCommand.class, resetSearchBarCommandOuterClass$ResetSearchBarCommand);
        resetSearchBarCommand = aopi.newSingularGeneratedExtension(apzg.a, resetSearchBarCommandOuterClass$ResetSearchBarCommand, resetSearchBarCommandOuterClass$ResetSearchBarCommand, null, 245120411, aosj.MESSAGE, ResetSearchBarCommandOuterClass$ResetSearchBarCommand.class);
    }

    private ResetSearchBarCommandOuterClass$ResetSearchBarCommand() {
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
                return new ResetSearchBarCommandOuterClass$ResetSearchBarCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ResetSearchBarCommandOuterClass$ResetSearchBarCommand.class) {
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
