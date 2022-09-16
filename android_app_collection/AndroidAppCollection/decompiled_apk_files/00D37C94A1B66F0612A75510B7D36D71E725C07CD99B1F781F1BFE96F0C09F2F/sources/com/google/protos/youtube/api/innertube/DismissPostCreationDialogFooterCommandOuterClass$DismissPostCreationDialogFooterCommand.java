package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand extends aopi implements aoqv {
    public static final DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand a;
    private static volatile aorb b;
    public static final aopg dismissPostCreationDialogFooterCommand;

    static {
        DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand dismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand = new DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand();
        a = dismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand;
        aopi.registerDefaultInstance(DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.class, dismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand);
        dismissPostCreationDialogFooterCommand = aopi.newSingularGeneratedExtension(apzg.a, dismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand, dismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand, null, 368549163, aosj.MESSAGE, DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.class);
    }

    private DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand() {
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
                return new DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.class) {
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
