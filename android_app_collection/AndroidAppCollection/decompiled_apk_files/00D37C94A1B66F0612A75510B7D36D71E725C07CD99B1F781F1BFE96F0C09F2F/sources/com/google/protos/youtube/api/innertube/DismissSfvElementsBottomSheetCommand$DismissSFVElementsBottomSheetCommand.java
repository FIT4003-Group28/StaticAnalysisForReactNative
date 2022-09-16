package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand extends aopi implements aoqv {
    public static final DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand a;
    private static volatile aorb d;
    public static final aopg dismissSfvElementsBottomSheetCommand;
    public int b;
    public apzg c;
    private byte e = 2;

    static {
        DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand = new DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand();
        a = dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand;
        aopi.registerDefaultInstance(DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class, dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand);
        dismissSfvElementsBottomSheetCommand = aopi.newSingularGeneratedExtension(apzg.a, dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand, dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand, null, 323826788, aosj.MESSAGE, DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class);
    }

    private DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class) {
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
