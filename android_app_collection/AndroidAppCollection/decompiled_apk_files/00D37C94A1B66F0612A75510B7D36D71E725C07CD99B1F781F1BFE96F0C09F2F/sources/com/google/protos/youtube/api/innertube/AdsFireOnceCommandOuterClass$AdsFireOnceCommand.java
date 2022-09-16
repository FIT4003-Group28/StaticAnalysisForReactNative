package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdsFireOnceCommandOuterClass$AdsFireOnceCommand extends aopi implements aoqv {
    public static final AdsFireOnceCommandOuterClass$AdsFireOnceCommand a;
    public static final aopg adsFireOnceCommand;
    private static volatile aorb e;
    public int b;
    public apzg c;
    private byte f = 2;
    public String d = "";

    static {
        AdsFireOnceCommandOuterClass$AdsFireOnceCommand adsFireOnceCommandOuterClass$AdsFireOnceCommand = new AdsFireOnceCommandOuterClass$AdsFireOnceCommand();
        a = adsFireOnceCommandOuterClass$AdsFireOnceCommand;
        aopi.registerDefaultInstance(AdsFireOnceCommandOuterClass$AdsFireOnceCommand.class, adsFireOnceCommandOuterClass$AdsFireOnceCommand);
        adsFireOnceCommand = aopi.newSingularGeneratedExtension(apzg.a, adsFireOnceCommandOuterClass$AdsFireOnceCommand, adsFireOnceCommandOuterClass$AdsFireOnceCommand, null, 284059002, aosj.MESSAGE, AdsFireOnceCommandOuterClass$AdsFireOnceCommand.class);
    }

    private AdsFireOnceCommandOuterClass$AdsFireOnceCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new AdsFireOnceCommandOuterClass$AdsFireOnceCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (AdsFireOnceCommandOuterClass$AdsFireOnceCommand.class) {
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
