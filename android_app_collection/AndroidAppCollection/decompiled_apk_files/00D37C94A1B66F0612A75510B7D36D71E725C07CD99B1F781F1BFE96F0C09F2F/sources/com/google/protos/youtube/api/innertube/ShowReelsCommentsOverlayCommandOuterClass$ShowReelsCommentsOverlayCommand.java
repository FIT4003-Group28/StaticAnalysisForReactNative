package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand extends aopi implements aoqv {
    public static final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand a;
    private static volatile aorb d;
    public static final aopg showReelsCommentsOverlayCommand;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand = new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
        a = showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
        aopi.registerDefaultInstance(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand);
        showReelsCommentsOverlayCommand = aopi.newSingularGeneratedExtension(apzg.a, showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand, showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand, null, 206635851, aosj.MESSAGE, ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class);
    }

    private ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"c", "b", aunb.class, aunb.class});
            case 3:
                return new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class) {
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
