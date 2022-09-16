package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand extends aopi implements aoqv {
    public static final AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand a;
    public static final aopg adsVisualElementLoggingWrapperCommand;
    private static volatile aorb f;
    public int b;
    public apzg c;
    public boolean d;
    public boolean e;
    private byte g = 2;

    static {
        AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand = new AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand();
        a = adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand;
        aopi.registerDefaultInstance(AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.class, adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand);
        adsVisualElementLoggingWrapperCommand = aopi.newSingularGeneratedExtension(apzg.a, adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand, adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand, null, 287920878, aosj.MESSAGE, AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.class);
    }

    private AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.class) {
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
