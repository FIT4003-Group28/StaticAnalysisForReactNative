package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand extends aopi implements aoqv {
    public static final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand a;
    private static volatile aorb e;
    public static final aopg showPendingReelUploadsCommand;
    public int b;
    public aunb c;
    public apzg d;
    private byte f = 2;

    static {
        ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand = new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
        a = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
        aopi.registerDefaultInstance(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand);
        showPendingReelUploadsCommand = aopi.newSingularGeneratedExtension(apzg.a, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand, null, 291405045, aosj.MESSAGE, ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class);
    }

    private ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
