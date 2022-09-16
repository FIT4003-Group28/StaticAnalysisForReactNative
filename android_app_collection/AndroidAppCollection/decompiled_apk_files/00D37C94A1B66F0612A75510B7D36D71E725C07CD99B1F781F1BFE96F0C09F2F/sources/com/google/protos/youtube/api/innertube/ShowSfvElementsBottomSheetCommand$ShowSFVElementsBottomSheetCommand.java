package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand extends aopi implements aoqv {
    public static final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand a;
    private static volatile aorb f;
    public static final aopg showSfvElementsBottomSheetCommand;
    public aunb b;
    public arag c;
    private int g;
    private byte h = 2;
    public float d = 1.0f;
    public float e = 1.0f;

    static {
        ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand = new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
        a = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand;
        aopi.registerDefaultInstance(ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class, showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand);
        showSfvElementsBottomSheetCommand = aopi.newSingularGeneratedExtension(apzg.a, showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand, showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand, null, 324622913, aosj.MESSAGE, ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class);
    }

    private ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
