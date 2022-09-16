package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint extends aopi implements aoqv {
    public static final AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint a;
    public static final aopg androidOsApplicationSettingsEndpoint;
    private static volatile aorb d;
    public int b;
    public String c = "";
    private int e;

    static {
        AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint = new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
        a = androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
        aopi.registerDefaultInstance(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint);
        androidOsApplicationSettingsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint, null, 128828810, aosj.MESSAGE, AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class);
    }

    private AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001", new Object[]{"e", "b", apfa.k, "c"});
            case 3:
                return new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class) {
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
