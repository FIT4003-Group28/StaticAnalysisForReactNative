package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactMenuEndpointOuterClass$ContactMenuEndpoint extends aopi implements aoqv {
    public static final ContactMenuEndpointOuterClass$ContactMenuEndpoint a;
    public static final aopg contactMenuEndpoint;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aqkk d;

    static {
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = new ContactMenuEndpointOuterClass$ContactMenuEndpoint();
        a = contactMenuEndpointOuterClass$ContactMenuEndpoint;
        aopi.registerDefaultInstance(ContactMenuEndpointOuterClass$ContactMenuEndpoint.class, contactMenuEndpointOuterClass$ContactMenuEndpoint);
        contactMenuEndpoint = aopi.newSingularGeneratedExtension(apzg.a, contactMenuEndpointOuterClass$ContactMenuEndpoint, contactMenuEndpointOuterClass$ContactMenuEndpoint, null, 98695964, aosj.MESSAGE, ContactMenuEndpointOuterClass$ContactMenuEndpoint.class);
    }

    private ContactMenuEndpointOuterClass$ContactMenuEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ContactMenuEndpointOuterClass$ContactMenuEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ContactMenuEndpointOuterClass$ContactMenuEndpoint.class) {
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
