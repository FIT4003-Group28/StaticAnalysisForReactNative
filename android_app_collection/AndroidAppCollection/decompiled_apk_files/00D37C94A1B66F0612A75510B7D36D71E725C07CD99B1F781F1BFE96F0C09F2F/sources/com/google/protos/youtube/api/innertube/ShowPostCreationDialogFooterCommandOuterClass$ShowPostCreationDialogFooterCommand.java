package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand extends aopi implements aoqv {
    public static final ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand a;
    private static volatile aorb d;
    public static final aopg showPostCreationDialogFooterCommand;
    public int b;
    public aunb c;
    private byte e = 2;

    static {
        ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand = new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
        a = showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand;
        aopi.registerDefaultInstance(ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class, showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand);
        showPostCreationDialogFooterCommand = aopi.newSingularGeneratedExtension(apzg.a, showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand, showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand, null, 369262379, aosj.MESSAGE, ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class);
    }

    private ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand() {
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
                return new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class) {
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
