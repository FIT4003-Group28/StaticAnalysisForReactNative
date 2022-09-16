package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint extends aopi implements aoqv {
    public static final UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint a;
    private static volatile aorb i;
    public static final aopg unlimitedCreateFamilyEndpoint;
    public int b;
    public avoh d;
    public apzg e;
    public apzg f;
    private avoh j;
    private byte k = 2;
    public String c = "";
    public String g = "";
    public aoob h = aoob.b;

    static {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
        a = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
        aopi.registerDefaultInstance(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint);
        unlimitedCreateFamilyEndpoint = aopi.newSingularGeneratedExtension(apzg.a, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint, null, 128069078, aosj.MESSAGE, UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class);
    }

    private UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"b", "c", "d", "j", "e", "f", "g", "h"});
            case 3:
                return new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
