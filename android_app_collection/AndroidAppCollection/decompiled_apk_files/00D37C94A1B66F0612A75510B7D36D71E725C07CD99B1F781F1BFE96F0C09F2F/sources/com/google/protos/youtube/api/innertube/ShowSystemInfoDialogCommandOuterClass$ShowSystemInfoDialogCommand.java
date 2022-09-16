package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand extends aopi implements aoqv {
    public static final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand a;
    private static volatile aorb d;
    public static final aopg showSystemInfoDialogCommand;
    public int b;
    public arag c;
    private byte e = 2;

    static {
        ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand = new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
        a = showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
        aopi.registerDefaultInstance(ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class, showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand);
        showSystemInfoDialogCommand = aopi.newSingularGeneratedExtension(apzg.a, showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand, showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand, null, 240199717, aosj.MESSAGE, ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class);
    }

    private ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand() {
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
                return new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class) {
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
