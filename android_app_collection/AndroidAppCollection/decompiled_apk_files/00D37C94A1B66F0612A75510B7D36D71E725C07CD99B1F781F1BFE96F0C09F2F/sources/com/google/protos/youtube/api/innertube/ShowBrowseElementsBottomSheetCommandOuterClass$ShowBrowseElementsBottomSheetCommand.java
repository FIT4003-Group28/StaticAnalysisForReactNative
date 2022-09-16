package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand extends aopi implements aoqv {
    public static final ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand a;
    private static volatile aorb f;
    public static final aopg showBrowseElementsBottomSheetCommand;
    public apzg b;
    public arag c;
    private int g;
    private arag h;
    private byte i = 2;
    public float d = 1.0f;
    public float e = 1.0f;

    static {
        ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand = new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
        a = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand;
        aopi.registerDefaultInstance(ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class, showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand);
        showBrowseElementsBottomSheetCommand = aopi.newSingularGeneratedExtension(apzg.a, showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand, showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand, null, 372633595, aosj.MESSAGE, ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class);
    }

    private ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"g", "b", "c", "h", "d", "e"});
            case 3:
                return new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class) {
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
