package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand extends aopi implements aoqv {
    public static final CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand a;
    private static volatile aorb b;
    public static final aopg closeSponsorshipsDialogCommand;

    static {
        CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand closeSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand = new CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand();
        a = closeSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand;
        aopi.registerDefaultInstance(CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.class, closeSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand);
        closeSponsorshipsDialogCommand = aopi.newSingularGeneratedExtension(apzg.a, closeSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand, closeSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand, null, 252663493, aosj.MESSAGE, CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.class);
    }

    private CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand() {
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
                return new CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.class) {
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
