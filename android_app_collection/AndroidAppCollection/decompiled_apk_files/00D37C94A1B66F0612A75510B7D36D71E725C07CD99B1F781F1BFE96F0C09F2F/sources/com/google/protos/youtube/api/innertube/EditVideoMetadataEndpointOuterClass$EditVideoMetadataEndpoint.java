package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint extends aopi implements aoqv {
    public static final EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint a;
    private static volatile aorb d;
    public static final aopg editVideoMetadataEndpoint;
    public int b;
    public String c = "";

    static {
        EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint = new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
        a = editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
        aopi.registerDefaultInstance(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint);
        editVideoMetadataEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint, null, 63560970, aosj.MESSAGE, EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class);
    }

    private EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class) {
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
