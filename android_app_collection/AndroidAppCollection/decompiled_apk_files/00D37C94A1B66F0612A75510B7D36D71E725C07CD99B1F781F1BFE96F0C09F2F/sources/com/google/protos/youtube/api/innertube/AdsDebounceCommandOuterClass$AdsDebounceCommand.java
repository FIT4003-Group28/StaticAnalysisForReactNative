package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdsDebounceCommandOuterClass$AdsDebounceCommand extends aopi implements aoqv {
    public static final AdsDebounceCommandOuterClass$AdsDebounceCommand a;
    public static final aopg adsDebounceCommand;
    private static volatile aorb d;
    public apzg b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand = new AdsDebounceCommandOuterClass$AdsDebounceCommand();
        a = adsDebounceCommandOuterClass$AdsDebounceCommand;
        aopi.registerDefaultInstance(AdsDebounceCommandOuterClass$AdsDebounceCommand.class, adsDebounceCommandOuterClass$AdsDebounceCommand);
        adsDebounceCommand = aopi.newSingularGeneratedExtension(apzg.a, adsDebounceCommandOuterClass$AdsDebounceCommand, adsDebounceCommandOuterClass$AdsDebounceCommand, null, 247128500, aosj.MESSAGE, AdsDebounceCommandOuterClass$AdsDebounceCommand.class);
    }

    private AdsDebounceCommandOuterClass$AdsDebounceCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new AdsDebounceCommandOuterClass$AdsDebounceCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (AdsDebounceCommandOuterClass$AdsDebounceCommand.class) {
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
