package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand extends aopi implements aoqv {
    public static final AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand a;
    public static final aopg adsClickWrapperCommand;
    private static volatile aorb e;
    public int b;
    public apzg c;
    public apby d;
    private byte f = 2;

    static {
        AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand adsClickWrapperCommandOuterClass$AdsClickWrapperCommand = new AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand();
        a = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand;
        aopi.registerDefaultInstance(AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class, adsClickWrapperCommandOuterClass$AdsClickWrapperCommand);
        adsClickWrapperCommand = aopi.newSingularGeneratedExtension(apzg.a, adsClickWrapperCommandOuterClass$AdsClickWrapperCommand, adsClickWrapperCommandOuterClass$AdsClickWrapperCommand, null, 310408312, aosj.MESSAGE, AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class);
    }

    private AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class) {
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
