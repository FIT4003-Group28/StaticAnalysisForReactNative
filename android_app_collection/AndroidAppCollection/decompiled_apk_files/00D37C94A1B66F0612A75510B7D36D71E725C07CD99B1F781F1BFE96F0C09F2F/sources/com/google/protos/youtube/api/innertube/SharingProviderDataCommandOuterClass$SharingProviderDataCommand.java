package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SharingProviderDataCommandOuterClass$SharingProviderDataCommand extends aopi implements aoqv {
    public static final SharingProviderDataCommandOuterClass$SharingProviderDataCommand a;
    private static volatile aorb g;
    public static final aopg sharingProviderDataCommand;
    public int b;
    public boolean d;
    public apzg e;
    public apzg f;
    private byte h = 2;
    public String c = "";

    static {
        SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand = new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
        a = sharingProviderDataCommandOuterClass$SharingProviderDataCommand;
        aopi.registerDefaultInstance(SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class, sharingProviderDataCommandOuterClass$SharingProviderDataCommand);
        sharingProviderDataCommand = aopi.newSingularGeneratedExtension(apzg.a, sharingProviderDataCommandOuterClass$SharingProviderDataCommand, sharingProviderDataCommandOuterClass$SharingProviderDataCommand, null, 377332428, aosj.MESSAGE, SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class);
    }

    private SharingProviderDataCommandOuterClass$SharingProviderDataCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
