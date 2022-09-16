package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand extends aopi implements aoqv {
    public static final DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand a;
    private static volatile aorb d;
    public static final aopg dismissBrowseElementsBottomSheetCommand;
    public int b;
    public apzg c;
    private byte e = 2;

    static {
        DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand = new DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand();
        a = dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand;
        aopi.registerDefaultInstance(DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.class, dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand);
        dismissBrowseElementsBottomSheetCommand = aopi.newSingularGeneratedExtension(apzg.a, dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand, dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand, null, 373014159, aosj.MESSAGE, DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.class);
    }

    private DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.class) {
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
